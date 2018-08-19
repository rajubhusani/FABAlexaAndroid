package com.willblaschko.android.alexa;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.willblaschko.android.alexa.connection.WebSocketImpl;
import com.willblaschko.android.alexa.data.AlexaCardModel;

public class SocketTask {

    public static final String TAG = SocketTask.class.getName();

    public static final int SOCKET_CONNECT = 1;
    public static final int SOCKET_DISCONNECT = 0;

    private Context mContext;
    private SocketTaskCallback mCallback;

    private WebSocketImpl socketimpl;

    public SocketTask(Context context, SocketTaskCallback callback) {
        this.mContext = context;
        setCallback(callback);
        this.socketimpl = new WebSocketImpl(mContext, callback);
    }

    void setCallback(SocketTaskCallback callback) {
        this.mCallback = callback;
    }

    public void execute(Integer... params) {
        doInBackground(params);
    }

    protected void doInBackground(Integer... params) {
        if (mContext != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) mContext
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNet = connectivityManager.getActiveNetworkInfo();
            boolean isConnected = activeNet != null
                    && activeNet.isConnectedOrConnecting();
            if (!isConnected) {
                mCallback.updateFromTask(null);
            } else {
                if (params[0] == SOCKET_CONNECT) {
                    socketimpl.start();
                } else if (params[0] == SOCKET_DISCONNECT) {
                    socketimpl.stop();
                }
            }
        }
    }

    protected void publishProgress(String... values) {
        if (mCallback != null) {
            try {
                Gson gson = new Gson();
                mCallback.updateFromTask(gson.fromJson(gson.fromJson(values[0], JsonObject.class).get("card").toString(), AlexaCardModel.class));
            } catch (JsonSyntaxException e) {
                mCallback.updateFromTask(null);
            }
        }
    }

    public interface SocketTaskCallback<T> {

        /**
         * Indicates that the callback handler needs to update its appearance or information based on
         * the result of the task. Expected to be called from the main thread.
         */
        void updateFromTask(T result);

    }

}
