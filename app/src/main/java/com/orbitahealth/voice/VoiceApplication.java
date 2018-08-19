package com.orbitahealth.voice;

import android.app.Application;

public class VoiceApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        FactoryImpl.register(getApplicationContext(), this);
    }
}
