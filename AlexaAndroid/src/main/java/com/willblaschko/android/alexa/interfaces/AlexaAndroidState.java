package com.willblaschko.android.alexa.interfaces;

import com.willblaschko.android.alexa.data.AlexaCardModel;

public interface AlexaAndroidState {

    void stateConnecting();

    void stateConnected();

    void stateListening();

    void stateProcessing();

    void stateSpeaking();

    void stateFinished();

    void statePrompting();

    void stateNone();

    void onLoginSuccess();

    void onLogoutSuccess();

    void onRecordPermissionDenied();

    void onSpeechLevel(int level);

    void onNewCard(AlexaCardModel cardModel);

}
