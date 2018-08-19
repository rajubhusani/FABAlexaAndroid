package com.willblaschko.android.alexa.interfaces;

import com.willblaschko.android.alexa.callbacks.AsyncCallback;

public interface AvsListenerInterface {
    AsyncCallback<AvsResponse, Exception> getRequestCallback();
}
