package com.orbitahealth.voice;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitahealth.voice.util.AlexaCardRecyclerAdapter;
import com.orbitahealth.voice.util.Utilities;
import com.willblaschko.android.alexa.AlexaAndroid;
import com.willblaschko.android.alexa.data.AlexaCardModel;
import com.willblaschko.android.alexa.interfaces.AlexaAndroidState;

public class MainActivity extends AppCompatActivity
        implements AlexaAndroidState {

    public static final String TAG = MainActivity.class.getName();

    private static final String[] AUDIO_RECORD_PERMISSION = {Manifest.permission.RECORD_AUDIO};

    private static final int AUDIO_RECORD_PERMISSION_CODE = 801;

    private Toolbar mToolbar;
    private ActionBar mActionBar;

    private View statusBar;
    private TextView status;
    private FrameLayout mContentView;
    private ImageButton mLoginButton;
    private ImageButton mRecorderButton;
    private ImageButton mLogoutButton;
    private RecyclerView mCardsRecycler;
    private LinearLayoutManager mLayoutManager;

    private AlexaAndroid mAlexaBase;

    private AlexaCardRecyclerAdapter mCardsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexa_assistant);

        mToolbar = (Toolbar) findViewById(R.id.alexa_assistant_toolbar);
        setSupportActionBar(mToolbar);

        mActionBar = getSupportActionBar();

        mContentView = (FrameLayout) findViewById(R.id.alexa_view_container);
        statusBar = findViewById(R.id.status_bar);
        status = (TextView) findViewById(R.id.status);
        mLoginButton = (ImageButton) findViewById(R.id.login_button);
        mRecorderButton = (ImageButton) findViewById(R.id.recorder_button);
        mLogoutButton = (ImageButton) findViewById(R.id.logout_button);
        mCardsRecycler =(RecyclerView) findViewById(R.id.alexa_cards_recycler);
        mLayoutManager = new LinearLayoutManager(getBaseContext());

        mAlexaBase = new AlexaAndroid(MainActivity.this, this);
        initializeViews();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout_amazon:
                mAlexaBase.performSignOut();
                return true;
            case R.id.action_switch:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.alexa_menu, menu);

        return false;
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAlexaBase.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAlexaBase.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAlexaBase.onDestroy();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (AUDIO_RECORD_PERMISSION_CODE == requestCode) {
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Utilities.showToast(MainActivity.this, "audio permission granted", Toast.LENGTH_SHORT);
            }
        }
    }

    private void initializeViews() {
        mAlexaBase.onCreate();
        mAlexaBase.registerLoginWithAmazonView(mLoginButton);
        mAlexaBase.registerRecorderView(mRecorderButton);
        mCardsAdapter = new AlexaCardRecyclerAdapter(MainActivity.this);
        mCardsRecycler.setLayoutManager(mLayoutManager);
        mCardsRecycler.setAdapter(mCardsAdapter);
        mLogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAlexaBase != null) {
                    mAlexaBase.performSignOut();
                }
            }
        });
        initializeCards();
    }

    private void initializeCards() {
        if (mCardsAdapter.getItemCount() > 0) {
            mCardsAdapter.clear();
        }
    }

    public void stateConnecting(){
        if(status != null) {
            status.setText("connecting");
            statusBar.animate().alpha(1);
        }
    }

    public void stateConnected() {
        if (status != null) {
            status.setText("");
            statusBar.animate().alpha(0);
            Utilities.showToast(MainActivity.this, "Alexa ready", Toast.LENGTH_SHORT);
        }
    }

    public void stateListening(){
        if(status != null) {
            status.setText("listening");
            statusBar.animate().alpha(1);
        }
    }

    public void stateProcessing(){
        if(status != null) {
            status.setText("processing");
            statusBar.animate().alpha(1);
        }
    }

    public void stateSpeaking(){
        if(status != null) {
            status.setText("speaking");
            statusBar.animate().alpha(1);
        }
    }

    public void statePrompting(){

        if(status != null) {
            status.setText("");
            statusBar.animate().alpha(1);
        }
    }

    public void stateFinished(){
        if(status != null) {
            status.setText("");
            statusBar.animate().alpha(0);
        }
    }

    public void stateNone(){
        statusBar.animate().alpha(0);
    }

    public void onLoginSuccess() {
        mLogoutButton.setVisibility(View.VISIBLE);
    }

    public void onRecordPermissionDenied() {
        boolean shouldShowRationale = false;
        for (String perm : AUDIO_RECORD_PERMISSION) {
            shouldShowRationale = shouldShowRationale
                    || ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this, perm);
        }
        if (shouldShowRationale) {
            Utilities.startInstalledAppDetailsActivity(MainActivity.this);
        } else {
            ActivityCompat.requestPermissions(MainActivity.this, AUDIO_RECORD_PERMISSION, AUDIO_RECORD_PERMISSION_CODE);
        }
    }

    public void onLogoutSuccess() {
        mLogoutButton.setVisibility(View.GONE);
        initializeCards();
    }

    public void onNewCard(AlexaCardModel card) {
        mCardsAdapter.addToStart(card);
        mCardsRecycler.scrollToPosition(0);
    }

    public void onSpeechLevel(int level) {

    }
}
