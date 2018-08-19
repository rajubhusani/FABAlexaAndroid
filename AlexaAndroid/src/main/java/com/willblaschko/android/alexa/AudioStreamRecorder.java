package com.willblaschko.android.alexa;

import android.util.Log;

import com.willblaschko.android.alexa.callbacks.AsyncCallback;
import com.willblaschko.android.alexa.interfaces.AvsResponse;
import com.willblaschko.android.alexa.requestbody.DataRequestBody;

import java.io.IOException;

import ee.ioc.phon.android.speechutils.RawAudioRecorder;

public class AudioStreamRecorder {
    public static final String TAG = AudioStreamRecorder.class.getName();
    // We refresh sound level every 100ms during a recording session.
    private static final int REFRESH_INTERVAL_MILLIS = 100;

    private final AudioLevelSource mLevelSource;
    private Thread mRefreshLevelThread;
    private RawAudioRecorder mRecorder;
    private DataRequestBody mRequestBody;

    public AudioStreamRecorder() {
        mLevelSource = new AudioLevelSource();
    }

    public AudioLevelSource getLevelSource() {
        return mLevelSource;
    }

    /**
     * @return if we are currently in a recording session.
     */
    public boolean isRecording() {
        return mRecorder != null;
    }

    /**
     * Start a new recording session.
     * @return true if a session is successfully started; false if something went wrong or if
     *         we are already recording.
     */
    public boolean startRecording(final AlexaManager alexaManager, final AsyncCallback<AvsResponse, Exception> callback) {
        synchronized (AudioStreamRecorder.class) {
            if (mRecorder == null) {
                mRecorder = new RawAudioRecorder();
                try {
                    // The scratch space file is a Uri, however MediaRecorder
                    // API only accepts absolute FD's. Therefore, get the
                    // FileDescriptor from the content resolver to ensure the
                    // directory is created and get the file path to output the
                    // audio to.
                    mRecorder.start();
                    mRequestBody = new DataRequestBody();
                    alexaManager.sendAudioRequest(mRequestBody, callback);
                    startTrackingSoundLevel();
                    return true;
                } catch (final Exception e) {
                    // There may be a device failure or I/O failure, record the error but
                    // don't fail.
                    Log.e(TAG, "Something went wrong when starting " +
                            "media recorder. " + e);
                    //UiUtils.showToastAtBottom(R.string.audio_recording_start_failed);
                    stopRecording();
                }
            } else {
                //Assert.fail("Trying to start a new recording session while already recording!");
            }
            return false;
        }
    }

    /**
     * Stop the current recording session.
     * @return the Uri of the output file, or null if not currently recording.
     */
    public boolean stopRecording() {
        boolean isNormalStop = true;
        synchronized (AudioStreamRecorder.class) {
            if (mRecorder != null) {
                try {
                    mRecorder.stop();
                    return true;
                } catch (final RuntimeException ex) {
                    // This may happen when the recording is too short, so just drop the recording
                    // in this case.
                    Log.w(TAG, "Something went wrong when stopping " +
                            "media recorder. " + ex);
                    isNormalStop = false;
                } finally {
                    mRecorder.release();
                    mRecorder = null;
                }
            } else {
                isNormalStop = false;
            }
        }
        stopTrackingSoundLevel();
        return isNormalStop;
    }

    private void startTrackingSoundLevel() {
        stopTrackingSoundLevel();
        mRefreshLevelThread = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        synchronized (AudioStreamRecorder.class) {
                            if (mRecorder != null) {
                                mRequestBody.sink().write(mRecorder.consumeRecording());
                                mLevelSource.setSpeechLevel((int) mRecorder.getRmsdb());
                            } else {
                                // The recording session is over, finish the thread.
                                mRequestBody.sink().close();
                                return;
                            }
                        }
                        Thread.sleep(REFRESH_INTERVAL_MILLIS);
                    }
                } catch (final InterruptedException e) {
                    Thread.currentThread().interrupt();
                } catch (IOException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        };
        mRefreshLevelThread.start();
    }

    private void stopTrackingSoundLevel() {
        if (mRefreshLevelThread != null && mRefreshLevelThread.isAlive()) {
            mRefreshLevelThread.interrupt();
            mRefreshLevelThread = null;
        }
    }

}
