package com.willblaschko.android.alexa;

import android.Manifest;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.willblaschko.android.alexa.audioplayer.AlexaAudioPlayer;
import com.willblaschko.android.alexa.callbacks.AsyncCallback;
import com.willblaschko.android.alexa.callbacks.AuthorizationCallback;
import com.willblaschko.android.alexa.data.AlexaCardImageModel;
import com.willblaschko.android.alexa.data.AlexaCardModel;
import com.willblaschko.android.alexa.data.Directive;
import com.willblaschko.android.alexa.interfaces.AlexaAndroidState;
import com.willblaschko.android.alexa.interfaces.AvsItem;
import com.willblaschko.android.alexa.interfaces.AvsListenerInterface;
import com.willblaschko.android.alexa.interfaces.AvsResponse;
import com.willblaschko.android.alexa.interfaces.audioplayer.AvsPlayAudioItem;
import com.willblaschko.android.alexa.interfaces.audioplayer.AvsPlayContentItem;
import com.willblaschko.android.alexa.interfaces.audioplayer.AvsPlayRemoteItem;
import com.willblaschko.android.alexa.interfaces.errors.AvsResponseException;
import com.willblaschko.android.alexa.interfaces.playbackcontrol.AvsMediaNextCommandItem;
import com.willblaschko.android.alexa.interfaces.playbackcontrol.AvsMediaPauseCommandItem;
import com.willblaschko.android.alexa.interfaces.playbackcontrol.AvsMediaPlayCommandItem;
import com.willblaschko.android.alexa.interfaces.playbackcontrol.AvsMediaPreviousCommandItem;
import com.willblaschko.android.alexa.interfaces.playbackcontrol.AvsReplaceAllItem;
import com.willblaschko.android.alexa.interfaces.playbackcontrol.AvsReplaceEnqueuedItem;
import com.willblaschko.android.alexa.interfaces.playbackcontrol.AvsStopItem;
import com.willblaschko.android.alexa.interfaces.speaker.AvsAdjustVolumeItem;
import com.willblaschko.android.alexa.interfaces.speaker.AvsSetMuteItem;
import com.willblaschko.android.alexa.interfaces.speaker.AvsSetVolumeItem;
import com.willblaschko.android.alexa.interfaces.speechrecognizer.AvsExpectSpeechItem;
import com.willblaschko.android.alexa.interfaces.speechrecognizer.AvsStopCaptureItem;
import com.willblaschko.android.alexa.interfaces.speechsynthesizer.AvsSpeakItem;
import com.willblaschko.android.alexa.interfaces.templateruntime.AvsRenderTemplateItem;
import com.willblaschko.android.alexa.service.DownChannelService;
import com.willblaschko.android.alexa.utility.MediaUtil;
import com.willblaschko.android.alexa.utility.Util;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * AlexaAndroid is a wrapper class, contains {@link AlexaManager}, {@link AuthorizationManager}, {@link AudioStreamRecorder}
 * and exposes simple interfaces for accessing AVS.
 * <p>
 * Connects to AVS and fires {@link AlexaAndroidState} callback on each voice request initiated by user,
 * sends {@link com.willblaschko.android.alexa.interfaces.speechrecognizer.SpeechSendEvent} to AVS and Handles {@link Directive} sent from Alexa.
 *
 */
public class AlexaAndroid
        implements AvsListenerInterface,
        SocketTask.SocketTaskCallback<AlexaCardModel> {

    private final static String TAG = "BaseActivity";

    private final static int STATE_CONNECTING = 5;
    private final static int STATE_CONNECTED = 6;
    private final static int STATE_LISTENING = 1;
    private final static int STATE_PROCESSING = 2;
    private final static int STATE_SPEAKING = 3;
    private final static int STATE_PROMPTING = 4;
    private final static int STATE_FINISHED = 0;

    private Context mContext;

    private AlexaManager alexaManager;
    private AlexaAudioPlayer audioPlayer;
    private List<AvsItem> avsQueue = new ArrayList<>();

    private boolean isLoggedIn = false;

    private DownChannelStatusReceiver mReceiver = new DownChannelStatusReceiver();

    private AuthorizationManager mAuthorizationManager;
    private SocketTask mSocketTask;

    private AlexaAndroidState mAlexaInterface;

    private View mLoginWithAmazonView;
    private View mRecorderView;

    private AudioStreamRecorder mAudioRecorder;

    private long startTime = 0;

    /**
     * Return an instance of AlexaAndroid.
     *
     * @param context         activity context
     * @param mAlexaInterface implementation of {@link AlexaAndroidState}
     */
    public AlexaAndroid(Context context, AlexaAndroidState mAlexaInterface) {
        checkContextSuitability(context);

        this.mContext = context;
        this.mSocketTask = new SocketTask(context, this);
        this.mAuthorizationManager = new AuthorizationManager(mContext, mContext.getString(R.string.alexa_product_id));
        this.mAlexaInterface = mAlexaInterface;
        this.mAudioRecorder = new AudioStreamRecorder();
    }

    /**
     * Call this in the activity's onCreate.
     *
     */
    public void onCreate() {
        if (null != mAlexaInterface && null != mAudioRecorder) {
            mAudioRecorder.getLevelSource().setListener(new AudioLevelSource.Listener() {
                @Override
                public void onSpeechLevel(int speechLevel) {
                    mAlexaInterface.onSpeechLevel(speechLevel);
                }
            });
        }
    }

    /**
     * Call this when activity is starting.
     *
     */
    public void onStart() {
        checkIsLoggedIn();
    }

    /**
     * Call this when activity is stopping.
     *
     */
    public void onStop() {
        if (isLoggedIn) {
            resetAlexaAndroid();
            EventBus.getDefault().unregister(AlexaAndroid.this);
        }
    }

    /**
     * Call this when the activity is destroying. Performs cleanup and releases resources.
     *
     */
    public void onDestroy() {
        if(audioPlayer != null){
            audioPlayer.release();
        }
    }

    /**
     * Performs signout from the loggedIn amazon account, on successful logout onLogoutSuccess from {@link AlexaAndroidState} is called
     * and registered login view is hided.
     *
     */
    public void performSignOut() {
        mAuthorizationManager.logoutUser(new AuthorizationCallback() {
            @Override
            public void onCancel() {

            }

            @Override
            public void onSuccess() {
                if (null != mContext && null != mAlexaInterface) {
                    //since logout callback was happened in background
                    ((Activity) mContext).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mAlexaInterface.onLogoutSuccess();
                            resetAlexaAndroid();
                            EventBus.getDefault().unregister(AlexaAndroid.this);
                            showLogin();
                        }
                    });
                }
            }

            @Override
            public void onError(Exception error) {
                //TODO show error in dialog
            }
        });
    }

    /**
     * registers the view to be used as a trigger for LoginWithAmazon,
     * supplied view click events is handled by {@link AlexaAndroid}
     *
     * @param view view to trigger LoginWithAmazon
     */
    public void registerLoginWithAmazonView(View view) {
        if (null != view) {
            this.mLoginWithAmazonView = view;
            this.mLoginWithAmazonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    launchAuthorization();
                }
            });
        }
    }

    /**
     * registers the view to be used to trigger the voice capturing and sending the captured voice data to AVS,
     * supplied view click events is handled by {@link AlexaAndroid}
     *
     * @param view view to trigger Voice capturing
     */
    public void registerRecorderView(View view) {
        if (null != view) {
            this.mRecorderView = view;
            this.mRecorderView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startRecording();
                }
            });
        }
    }

    /**
     * returns the instance of {@link AsyncCallback} for the events send to AVS.
     * All callbacks are implemented by {@link AlexaAndroid}, use this callback for all {@link com.willblaschko.android.alexa.data.Event} triggered by your code.
     *
     * @return the {@link AsyncCallback}
     */
    @Override
    public AsyncCallback<AvsResponse, Exception> getRequestCallback() {
        return requestCallback;
    }

    /**
     * Optional callback for receiving {@link AlexaCardModel} from WebSocket. Though {@link AlexaAndroidState} onNewCard provides both AVS cards and WebSocket cards.
     *
     * @param result the {@link AlexaCardModel} returned from WebSocket
     */
    @Override
    public void updateFromTask(AlexaCardModel result) {
        if (null != mAlexaInterface) {
            mAlexaInterface.onNewCard(result);
        }
    }

    /**
     * Callback called when {@link AvsStopCaptureItem} is sent from AVS.
     * Recorder must stop recording, after receiving this {@link Directive} from AVS.
     *
     * @param avsStopCaptureItem the {@link AvsStopCaptureItem} sent from AVS.
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onStopCaptureEvent(AvsStopCaptureItem avsStopCaptureItem) {
        stopRecording();
    }

    /**
     * Initializes {@link AlexaAndroid}, in detail it adds WAKE_LOCK, initializes {@link AlexaAudioPlayer},
     * starts {@link DownChannelService} and starts {@link SocketTask}.
     *
     */
    private void initAlexaAndroid() {

        if (null == mContext) {
            return;
        }

        //Keep the screen awake
        ((Activity) mContext).getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        //get our AlexaManager instance for convenience
        alexaManager = AlexaManager.getInstance(mContext);

        //instantiate our audio player
        audioPlayer = AlexaAudioPlayer.getInstance(mContext);

        //Remove the current item and check for more items once we've finished playing
        audioPlayer.addCallback(alexaAudioPlayerCallback);

        //open our downchannel
        alexaManager.startDownChannelService();


        //synchronize our device
        //alexaManager.sendSynchronizeStateEvent(requestCallback);

        setState(STATE_CONNECTING);

        mContext.registerReceiver(mReceiver, new IntentFilter(DownChannelService.ACTION_CHANNEL_STATUS));

        //start listening from websocket
        mSocketTask.execute(SocketTask.SOCKET_CONNECT);

/*
        // Bind to DownChannelService
        Intent intent = new Intent(this, DownChannelService.class);
        bindService(intent, mConnection, Context.BIND_AUTO_CREATE);*/
    }

    /**
     * resets {@link AlexaAndroid}, in detail it removes WAKE_LOCK, releases {@link AlexaAudioPlayer} resources,
     * if loggedIn Unregisters from {@link DownChannelService} and stops it, and stops {@link SocketTask}.
     *
     */
    private void resetAlexaAndroid() {

        if (null == mContext) {
            return;
        }

        //clearing the wake lock
        ((Activity) mContext).getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        //Toast.makeText(getBaseContext(), "Base Activity OnStop", Toast.LENGTH_SHORT).show();
        if(audioPlayer != null){
            if(audioPlayer.isPlaying()) {
                audioPlayer.pause();
            }
            audioPlayer.stop();
            //remove callback to avoid memory leaks
            audioPlayer.removeCallback(alexaAudioPlayerCallback);
        }
        if (isLoggedIn) {

            if (!avsQueue.isEmpty()) {
                avsQueue.clear();
            }

            mContext.unregisterReceiver(mReceiver);

            // UnBind from DownChannelService
            //unbindService(mConnection);
            alexaManager.stopDownChannelService();

            //stop listening from websocket
            mSocketTask.execute(SocketTask.SOCKET_DISCONNECT);
        }
    }

    /**
     * checks whether the user is loggedIn or not,
     * and shows the registered Recorder {@link View} if the user is loggedIn,
     * else shows the registered LoginWithAmazon {@link View}.
     *
     */
    private void checkIsLoggedIn() {

        if (null == mContext) {
            return;
        }

        mAuthorizationManager.checkLoggedIn(mContext, new AsyncCallback<Boolean, Throwable>() {
            @Override
            public void start() {

            }

            @Override
            public void success(Boolean result) {
                if (result) {
                    showAssistant();
                }
            }

            @Override
            public void failure(Throwable error) {
                showLogin();
            }

            @Override
            public void complete() {

            }
        });

    }

    /**
     * launches the LoginWithAmazon authorization, handles the onSuccess of Authorization and shows the Recorder {@link View}.
     *
     */
    private void launchAuthorization() {
        mAuthorizationManager.authorizeUser(new AuthorizationCallback() {
            @Override
            public void onCancel() {

            }

            @Override
            public void onSuccess() {
                showAssistant();
            }

            @Override
            public void onError(Exception error) {
                //TODO show error in dialog
            }
        });
    }

    /**
     * sets the login state to true, and shows the registered Recorder {@link View} and hides the registered LoginWithAmazon {@link View}.
     *
     */
    private void showAssistant() {
        if (null != mAlexaInterface) {
            mAlexaInterface.onLoginSuccess();
        }
        isLoggedIn = true;
        EventBus.getDefault().register(AlexaAndroid.this);
        initAlexaAndroid();
        if (null != mLoginWithAmazonView && null != mRecorderView) {
            mLoginWithAmazonView.setVisibility(View.GONE);
            mRecorderView.setVisibility(View.VISIBLE);
        }
    }

    /**
     * sets the login state to false and shows the registered LoginWithAmazon {@link View} and hides the registered  Recorder {@link View}.
     *
     */
    private void showLogin() {
        isLoggedIn = false;
        if (null != mLoginWithAmazonView && null != mRecorderView) {
            mLoginWithAmazonView.setVisibility(View.VISIBLE);
            mRecorderView.setVisibility(View.GONE);
        }
    }

    /**
     * Plays audio recording prompt and starts audio recording, if the Manifest.permission.RECORD_AUDIO is granted.
     * For more info how audio is recorded and send to AVS see {@link AudioStreamRecorder}
     *
     */
    private void startRecording() {
        if (null != mContext) {
            if (android.content.pm.PackageManager.PERMISSION_GRANTED
                    == ContextCompat.checkSelfPermission(mContext, Manifest.permission.RECORD_AUDIO)) {
                //start recording
                if (!mAudioRecorder.isRecording()) {
                    playAudioStartSound(new MediaUtil.OnCompletionListener() {
                        @Override
                        public void onCompletion() {
                            mAudioRecorder.startRecording(alexaManager, getRequestCallback());
                        }
                    });
                }
            } else {
                if (null != mAlexaInterface) {
                    mAlexaInterface.onRecordPermissionDenied();
                    Util.showAuthToast(mContext, "enable Audio record permission");
                }
            }
        }
    }

    /**
     * Stops the audio recording and plays audio record ended prompt.
     *
     */
    private void stopRecording() {
        if (mAudioRecorder.isRecording()) {
            mAudioRecorder.stopRecording();
            playAudioEndSound();
        }
    }

    /**
     * Plays an audio prompt before starting recording, start the audio recording on {@link com.willblaschko.android.alexa.utility.MediaUtil.OnCompletionListener} callback.
     *
     * @param completionListener the {@link com.willblaschko.android.alexa.utility.MediaUtil.OnCompletionListener} instance, called when playback is completed.
     */
    private void playAudioStartSound(final MediaUtil.OnCompletionListener completionListener) {
        MediaUtil.get().playSound(mContext, R.raw.audio_initiate, completionListener);
    }

    /**
     * Plays an audio prompt indicating audio record is ended.
     *
     */
    private void playAudioEndSound() {
        MediaUtil.get().playSound(mContext, R.raw.audio_end, null);
    }

    /**
     * A {@link BroadcastReceiver} for receiving {@link DownChannelService} status.
     *
     */
    public class DownChannelStatusReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (DownChannelService.ACTION_CHANNEL_STATUS.equals(intent.getAction())) {
                switch (intent.getIntExtra("status", -1)) {
                    case DownChannelService.CONNECTED:
                        setState(STATE_CONNECTED);
                        break;
                    case DownChannelService.DISCONNECTED:
                        setState(STATE_CONNECTING);
                        break;
                }
            }
        }
    }

    //Our callback that deals with removing played items in our media player and then checking to see if more items exist
    private AlexaAudioPlayer.Callback alexaAudioPlayerCallback = new AlexaAudioPlayer.Callback() {

        private boolean almostDoneFired = false;
        private boolean playbackStartedFired = false;

        @Override
        public void playerPrepared(AvsItem pendingItem) {

        }

        @Override
        public void playerProgress(AvsItem item, long offsetInMilliseconds, float percent) {
            if(BuildConfig.DEBUG) {
                //Log.i(TAG, "Player percent: " + percent);
            }
            if(item instanceof AvsPlayContentItem || item == null){
                return;
            }
            if(!playbackStartedFired){
                if(BuildConfig.DEBUG) {
                    Log.i(TAG, "PlaybackStarted " + item.getToken() + " fired: " + percent);
                }
                playbackStartedFired = true;
                sendPlaybackStartedEvent(item);
            }
            if(!almostDoneFired && percent > .8f){
                if(BuildConfig.DEBUG) {
                    Log.i(TAG, "AlmostDone " + item.getToken() + " fired: " + percent);
                }
                almostDoneFired = true;
                if(item instanceof AvsPlayAudioItem) {
                    sendPlaybackNearlyFinishedEvent((AvsPlayAudioItem) item, offsetInMilliseconds);
                }
            }
        }

        @Override
        public void itemComplete(AvsItem completedItem) {
            almostDoneFired = false;
            playbackStartedFired = false;
            avsQueue.remove(completedItem);
            checkQueue();
            if(completedItem instanceof AvsPlayContentItem || completedItem == null){
                return;
            }
            if(BuildConfig.DEBUG) {
                Log.i(TAG, "Complete " + completedItem.getToken() + " fired");
            }
            sendPlaybackFinishedEvent(completedItem);
        }

        @Override
        public boolean playerError(AvsItem item, int what, int extra) {
            return false;
        }

        @Override
        public void dataError(AvsItem item, Exception e) {
            e.printStackTrace();
        }


    };

    /**
     * Send an event back to Alexa that we're nearly done with our current playback event, this should supply us with the next item
     * https://developer.amazon.com/public/solutions/alexa/alexa-voice-service/reference/audioplayer#PlaybackNearlyFinished Event
     */
    private void sendPlaybackNearlyFinishedEvent(AvsPlayAudioItem item, long offsetInMilliseconds){
        if (item != null) {
            alexaManager.sendPlaybackNearlyFinishedEvent(item, offsetInMilliseconds, requestCallback);
            Log.i(TAG, "Sending PlaybackNearlyFinishedEvent");
        }
    }

    /**
     * Send an event back to Alexa that we're starting a speech event
     * https://developer.amazon.com/public/solutions/alexa/alexa-voice-service/reference/audioplayer#PlaybackNearlyFinished Event
     */
    private void sendPlaybackStartedEvent(AvsItem item){
        alexaManager.sendPlaybackStartedEvent(item, 0, null);
        Log.i(TAG, "Sending SpeechStartedEvent");
    }

    /**
     * Send an event back to Alexa that we're done with our current speech event, this should supply us with the next item
     * https://developer.amazon.com/public/solutions/alexa/alexa-voice-service/reference/audioplayer#PlaybackNearlyFinished Event
     */
    private void sendPlaybackFinishedEvent(AvsItem item){
        if (item != null) {
            alexaManager.sendPlaybackFinishedEvent(item, null);
            Log.i(TAG, "Sending PlaybackFinishedEvent");
        }
    }

    //async callback for commands sent to Alexa Voice
    private AsyncCallback<AvsResponse, Exception> requestCallback = new AsyncCallback<AvsResponse, Exception>() {
        @Override
        public void start() {
            startTime = System.currentTimeMillis();
            Log.i(TAG, "Event Start");
            setState(STATE_PROCESSING);
            if (audioPlayer.isPlaying()) {
                audioPlayer.pause();
                audioPlayer.stop();
                sendPlaybackFinishedEvent(audioPlayer.getCurrentItem());
                avsQueue.clear();
            }
        }

        @Override
        public void success(AvsResponse result) {
            Log.i(TAG, "Event Success");
            handleResponse(result);
        }

        @Override
        public void failure(Exception error) {
            error.printStackTrace();
            Log.i(TAG, "Event Error");
            setState(STATE_FINISHED);
        }

        @Override
        public void complete() {
            Log.i(TAG, "Event Complete");
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    long totalTime = System.currentTimeMillis() - startTime;
                    //Toast.makeText(AlexaAndroid.this, "Total request time: "+totalTime+" miliseconds", Toast.LENGTH_LONG).show();
                    //Log.i(TAG, "Total request time: "+totalTime+" miliseconds");
                }
            });
        }
    };

    /**
     * Handle the response sent back from Alexa's parsing of the Intent, these can be any of the AvsItem types (play, speak, stop, clear, listen)
     * @param response a List<AvsItem> returned from the mAlexaManager.sendTextRequest() call in sendVoiceToAlexa()
     */
    private void handleResponse(AvsResponse response){
        boolean checkAfter = (avsQueue.size() == 0);
        if(response != null){
            //if we have a clear queue item in the list, we need to clear the current queue before proceeding
            //iterate backwards to avoid changing our array positions and getting all the nasty errors that come
            //from doing that
            for(int i = response.size() - 1; i >= 0; i--){
                if(response.get(i) instanceof AvsReplaceAllItem || response.get(i) instanceof AvsReplaceEnqueuedItem){
                    //clear our queue
                    avsQueue.clear();
                    //remove item
                    response.remove(i);
                }
            }
            Log.i(TAG, "Adding "+response.size()+" items to our queue");
            if(BuildConfig.DEBUG){
                for (int i = 0; i < response.size(); i++){
                    Log.i(TAG, "\tAdding: "+response.get(i).getToken());
                }
            }

            // pre-process the RenderTemplateItem and remove them from response
            // because ExpectSpeech has to be the last Directive

            Iterator<AvsItem> avsResponseIterator = response.iterator();

            while (avsResponseIterator.hasNext()) {
                AvsItem item = avsResponseIterator.next();
                if (item instanceof AvsRenderTemplateItem) {
                    AvsRenderTemplateItem template = (AvsRenderTemplateItem) item;
                    final AlexaCardModel card = new AlexaCardModel();
                    if (template.isBodyTemplate1()) {
                        card.setType("Simple");
                        card.setContent(template.getTextField());
                    } else if (template.isBodyTemplate2()) {
                        card.setType("Standard");
                        card.setText(template.getTextField());
                        if (template.getImage() != null
                                && template.getImage().getSources() != null
                                && !template.getImage().getSources().isEmpty()) {
                            boolean isImageFound = false;
                            for (Directive.Source source : template.getImage().getSources()) {
                                if (source.getSize().equals("MEDIUM")) {
                                    card.setImage(new AlexaCardImageModel(null, source.getUrl()));
                                    isImageFound = true;
                                }
                            }
                            if (!isImageFound) {
                                card.setImage(new AlexaCardImageModel(null, template.getImage().getSources().get(0).getUrl()));
                            }
                        }
                    }
                    card.setTitle(template.getTitle().getMainTitle());
                    if (null != mContext && null != mAlexaInterface) {
                        ((Activity) mContext).runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                mAlexaInterface.onNewCard(card);
                            }
                        });
                        Log.d(TAG, " After Card publishing");
                    }
                    avsResponseIterator.remove();
                }
            }

            avsQueue.addAll(response);
        }
        if(checkAfter) {
            checkQueue();
        }
    }


    /**
     * Check our current queue of items, and if we have more to parse (once we've reached a play or listen callback) then proceed to the
     * next item in our list.
     *
     * We're handling the AvsReplaceAllItem in handleResponse() because it needs to clear everything currently in the queue, before
     * the new items are added to the list, it should have no function here.
     */
    private void checkQueue() {

        //if we're out of things, hang up the phone and move on
        if (avsQueue.size() == 0) {
            setState(STATE_FINISHED);
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    long totalTime = System.currentTimeMillis() - startTime;
                    //Toast.makeText(AlexaAndroid.this, "Total interaction time: "+totalTime+" miliseconds", Toast.LENGTH_LONG).show();
                    Log.i(TAG, "Total interaction time: "+totalTime+" miliseconds");
                }
            });
            return;
        }

        final AvsItem current = avsQueue.get(0);

        Log.i(TAG, "Item type " + current.getClass().getName());

        if (current instanceof AvsPlayRemoteItem) {
            //play a URL
            if (!audioPlayer.isPlaying()) {
                audioPlayer.playItem((AvsPlayRemoteItem) current);
            }
        } else if (current instanceof AvsPlayContentItem) {
            //play a URL
            if (!audioPlayer.isPlaying()) {
                audioPlayer.playItem((AvsPlayContentItem) current);
            }
        } else if (current instanceof AvsSpeakItem) {
            //play a sound file
            if (!audioPlayer.isPlaying()) {
                audioPlayer.playItem((AvsSpeakItem) current);
            }
            setState(STATE_SPEAKING);
        } else if (current instanceof AvsStopItem) {
            //stop our play
            audioPlayer.stop();
            avsQueue.remove(current);
        } else if (current instanceof AvsReplaceAllItem) {
            //clear all items
            //mAvsItemQueue.clear();
            audioPlayer.stop();
            avsQueue.remove(current);
        } else if (current instanceof AvsReplaceEnqueuedItem) {
            //clear all items
            //mAvsItemQueue.clear();
            avsQueue.remove(current);
        } else if (current instanceof AvsExpectSpeechItem) {

            //listen for user input
            audioPlayer.stop();
            avsQueue.clear();
            setState(STATE_LISTENING);
            startRecording();
            Log.d(TAG, " Moving to listening state");
        } else if (current instanceof AvsSetVolumeItem) {
            //set our volume
            setVolume(((AvsSetVolumeItem) current).getVolume());
            avsQueue.remove(current);
        } else if(current instanceof AvsAdjustVolumeItem){
            //adjust the volume
            adjustVolume(((AvsAdjustVolumeItem) current).getAdjustment());
            avsQueue.remove(current);
        } else if(current instanceof AvsSetMuteItem){
            //mute/unmute the device
            setMute(((AvsSetMuteItem) current).isMute());
            avsQueue.remove(current);
        }else if(current instanceof AvsMediaPlayCommandItem){
            //fake a hardware "play" press
            sendMediaButton(KeyEvent.KEYCODE_MEDIA_PLAY);
            Log.i(TAG, "Media play command issued");
            avsQueue.remove(current);
        }else if(current instanceof AvsMediaPauseCommandItem){
            //fake a hardware "pause" press
            sendMediaButton(KeyEvent.KEYCODE_MEDIA_PAUSE);
            Log.i(TAG, "Media pause command issued");
            avsQueue.remove(current);
        }else if(current instanceof AvsMediaNextCommandItem){
            //fake a hardware "next" press
            sendMediaButton(KeyEvent.KEYCODE_MEDIA_NEXT);
            Log.i(TAG, "Media next command issued");
            avsQueue.remove(current);
        }else if(current instanceof AvsMediaPreviousCommandItem){
            //fake a hardware "previous" press
            sendMediaButton(KeyEvent.KEYCODE_MEDIA_PREVIOUS);
            Log.i(TAG, "Media previous command issued");
            avsQueue.remove(current);
        }else if(current instanceof AvsResponseException){
            if (null != mContext) {
                ((Activity) mContext).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new AlertDialog.Builder(mContext)
                                .setTitle("Error")
                                .setMessage(((AvsResponseException) current).getDirective().getPayload().getCode() + ": " + ((AvsResponseException) current).getDirective().getPayload().getDescription())
                                .setPositiveButton(android.R.string.ok, null)
                                .show();
                    }
                });
                Log.d(TAG, " Exception from AVS");
            }
            avsQueue.remove(current);
            checkQueue();
        }
    }

    private void adjustVolume(long adjust){
        setVolume(adjust, true);
    }

    private void setVolume(long volume){
        setVolume(volume, false);
    }

    private void setVolume(final long volume, final boolean adjust){

        if (null == mContext) {
            return;
        }

        AudioManager am = (AudioManager) mContext.getSystemService(android.content.Context.AUDIO_SERVICE);
        final int max = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        long vol= am.getStreamVolume(AudioManager.STREAM_MUSIC);
        if(adjust){
            vol += volume * max / 100;
        }else{
            vol = volume * max / 100;
        }
        am.setStreamVolume(AudioManager.STREAM_MUSIC, (int) vol, AudioManager.FLAG_VIBRATE);

        alexaManager.sendVolumeChangedEvent(volume, vol == 0, requestCallback);

        Log.i(TAG, "Volume set to : " + vol +"/"+max+" ("+volume+")");

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                if(adjust) {
                    Toast.makeText(mContext, "Volume adjusted.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(mContext, "Volume set to: " + (volume / 10), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void setMute(final boolean isMute){
        AudioManager am = (AudioManager) mContext.getSystemService(android.content.Context.AUDIO_SERVICE);
        am.setStreamMute(AudioManager.STREAM_MUSIC, isMute);

        alexaManager.sendMutedEvent(isMute, requestCallback);

        Log.i(TAG, "Mute set to : "+isMute);

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(mContext, "Volume " + (isMute ? "muted" : "unmuted"), Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * Force the device to think that a hardware button has been pressed, this is used for Play/Pause/Previous/Next Media commands
     * @param keyCode keycode for the hardware button we're emulating
     */
    private void sendMediaButton(int keyCode) {
        if (null == mContext) {
            return;
        }
        Instrumentation inst = new Instrumentation();
        inst.sendKeyDownUpSync(keyCode);
    }

    /**
     * Publishes the various state the {@link AlexaAndroid} is in,
     * respective callback from {@link AlexaAndroidState} is called for each state.
     *
     * @param state the state of A
     */
    private void setState(final int state){
        if (null == mContext) {
            return;
        }
        if (null != mAlexaInterface) {
            ((Activity) mContext).runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    switch (state) {
                        case (STATE_CONNECTING):
                            mAlexaInterface.stateConnecting();
                            break;
                        case (STATE_CONNECTED):
                            mAlexaInterface.stateConnected();
                            break;
                        case (STATE_LISTENING):
                            mAlexaInterface.stateListening();
                            break;
                        case (STATE_PROCESSING):
                            mAlexaInterface.stateProcessing();
                            break;
                        case (STATE_SPEAKING):
                            mAlexaInterface.stateSpeaking();
                            break;
                        case (STATE_FINISHED):
                            mAlexaInterface.stateFinished();
                            break;
                        case (STATE_PROMPTING):
                            mAlexaInterface.statePrompting();
                            break;
                        default:
                            mAlexaInterface.stateNone();
                            break;
                    }
                }
            });
            Log.d(TAG, " After State setting " + String.valueOf(state));
        }
    }

    /**
     * checks the callee suitability
     *
     * @param context the {@link Activity} context
     */
    private void checkContextSuitability(Context context) {
        // Make sure Object is an Activity
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("Caller must be an Activity");
        }

    }

}
