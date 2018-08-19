package com.willblaschko.android.alexa.connection;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.willblaschko.android.alexa.SocketTask;
import com.willblaschko.android.alexa.data.AlexaCardModel;

import java.io.EOFException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

public class WebSocketImpl {

    public static final String TAG = WebSocketImpl.class.getName();

    private static final String PREFERENCES = "Preferences";
    private static final String PREFERENCES_KEY_TOKEN = "token";
    private static final String PREFERENCES_KEY_ENDPOINT = "endpoint";

    private static final int NORMAL_CLOSURE_STATUS = 1000;

    OkHttpClient client;

    private Context mContext;
    private WebSocket webSocket;
    private SocketTask.SocketTaskCallback callback;

    public WebSocketImpl(Context context, SocketTask.SocketTaskCallback callback) {
        this.mContext = context;
        this.callback = callback;
    }

    public void start() {
        if (null == mContext) {
            return;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFERENCES,0);
        String baseUrl = sharedPreferences.getString(PREFERENCES_KEY_ENDPOINT, null);
        if (TextUtils.isEmpty(baseUrl)) {
            return;
        }
        baseUrl = Uri.parse(baseUrl)
                .buildUpon()
                .scheme("wss")
                .encodedPath("/oeapi/ws/cards")
                .toString();
        try {
            client = new OkHttpClient.Builder()
                    .readTimeout(0,  TimeUnit.MILLISECONDS)
                    .writeTimeout(0, TimeUnit.MILLISECONDS)
                    .pingInterval(45, TimeUnit.SECONDS)
                    .build();
            Request request = new Request.Builder()
                    .url(baseUrl)
                    .addHeader("Authorization", "Bearer " + sharedPreferences.getString(PREFERENCES_KEY_TOKEN, null))
                    .build();
            EchoWebSocketListener listener = new EchoWebSocketListener();
            webSocket = client.newWebSocket(request, listener);
        } catch (RejectedExecutionException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        if (client != null) {
            if (webSocket != null) {
                webSocket.cancel();
            }
            client.dispatcher().executorService().shutdown();
        }
    }

    private final class EchoWebSocketListener extends WebSocketListener {
        @Override
        public void onOpen(WebSocket webSocket, Response response) {
            Log.d(TAG, "Open: " + response.message());
        }
        @Override
        public void onMessage(WebSocket webSocket, final String text) {
            Log.d(TAG, "Message: " + text);
            if (callback != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Gson gson = new Gson();
                            callback.updateFromTask(gson.fromJson(gson.fromJson(text, JsonObject.class).get("card").toString(), AlexaCardModel.class));
                        } catch (JsonSyntaxException e) {
                            callback.updateFromTask(null);
                        }
                    }
                });
            }
        }
        @Override
        public void onMessage(WebSocket webSocket, ByteString bytes) {
            Log.d(TAG, "Bytes: " + bytes.toString());
        }
        @Override
        public void onClosing(WebSocket webSocket, int code, String reason) {
            webSocket.close(NORMAL_CLOSURE_STATUS, null);
            Log.d(TAG, "Closing : " + code + " / " + reason);
        }
        @Override
        public void onFailure(WebSocket webSocket, Throwable t, Response response) {
            webSocket.cancel();
            Log.d(TAG, "Error : " + t.getMessage());
            if (t instanceof EOFException) {
                start();
            }
        }
    }
}
