package app.orbitahealth.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import java.io.IOException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.android.AndroidLog;
import retrofit.client.OkClient;
import retrofit.client.Response;


public class RestAdapter {
    SignInResponse sg = new SignInResponse();
     String s = sg.getToken();
    private static final String PREFERENCES = "Preferences";
    private static final String PREFERENCES_KEY_TOKEN = "token";
    private static final String PREFERENCES_KEY_ENDPOINT = "endpoint";
   static SignInResponse responseObj = new SignInResponse();
    private static String token="";
     static  Context context;


    /*
    OkClient client = new OkClient();

    public void setClient(OkClient client) {
        this.client = client;
    }
    OkHttpClient client = new OkHttpClient();
    client.setConnectTimeout(CONNECT_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
    client.setReadTimeout(READ_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
    OkHttpClient okHttpClient = new OkHttpClient().setConnectTimeout(120,TimeUnit.SECONDS);

*/



    //https://wildoyster.bebaio.codes - https://vinfiz.bebaio.codes:8080


    private static  retrofit.RestAdapter restAdapter;


   /* public final class MyUrlConnectionClient extends UrlConnectionClient {
        @Override protected HttpUrlConnection openConnection(VoiceInteractor.Request request) {
            HttpUrlConnection connection = super.openConnection(request);
            connection.setConnectTimeout(15 * 1000);
            connection.setReadTimeout(30 * 1000);
            return connection;
        }
    }*/

    private static OkHttpClient getClient() {
       final OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(1, TimeUnit.MINUTES);
        client.setReadTimeout(1, TimeUnit.MINUTES);
        client.setAuthenticator(new Authenticator() {
            @Override
            public Request authenticate(Proxy proxy, com.squareup.okhttp.Response response) throws IOException {

                // get the token inside the decoded token from signin response
                SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES,0);
                String userToken = sharedPreferences.getString("userToken","");

                TokenUpdateResponse tokenUpdateResponse = restAdapter.create(Services.class).updateToken(userToken);
                if (tokenUpdateResponse != null && !TextUtils.isEmpty(tokenUpdateResponse.getToken())) {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString(PREFERENCES_KEY_TOKEN, tokenUpdateResponse.getToken());

                        LoginTokenResponse credentials = decodeJwtToObject(tokenUpdateResponse.getToken());
                        if (!TextUtils.isEmpty(String.valueOf(credentials.getExp()))) {
                            editor.putString("exp", String.valueOf(credentials.getExp()));

                        }

                        editor.commit();
                        return response.request().newBuilder().header("Authorization", "Bearer " + tokenUpdateResponse.getToken()).build();
                }
                return null;
            }

            @Override
            public Request authenticateProxy(Proxy proxy, com.squareup.okhttp.Response response) throws IOException {
                return null;
            }

        });
        return client;
    }

    public static  retrofit.RestAdapter genericTypeAdapter(Context appContext) {
        SharedPreferences sharedPreferences = null;
        if (appContext!=null) {
            sharedPreferences = appContext.getSharedPreferences(PREFERENCES,0);
        }
        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(
                        new EmptyCheckTypeAdapterFactory())
                .create();

        retrofit.RestAdapter restAdapter = new retrofit.RestAdapter.Builder().setClient(new OkClient(getClient()))
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL).setLog(new AndroidLog("YOUR_LOG_TAG"))
                .setEndpoint(sharedPreferences.getString(PREFERENCES_KEY_ENDPOINT,""))
                .build();
        RestAdapter.restAdapter = restAdapter;
         return restAdapter;
    }

    OkHttpClient httpClient = new OkHttpClient();

    public static void signIn(String userAgent, final Context mContext, app.orbitahealth.sdk.requestmodel.signupmodel.User user, final LoginInterface loginInterface) {
        context=mContext;
        Services services = RestAdapter.genericTypeAdapter(mContext).create(Services.class);
        services.getSignIn(user, "application/json", userAgent, new Callback<SignInResponse>() {
            @Override
            public void success(SignInResponse signInResponse, Response response) {
                responseObj = signInResponse;
                token = signInResponse.getToken();
                SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFERENCES,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(PREFERENCES_KEY_TOKEN, token);
                editor.commit();
                loginInterface.onLoginSuccess(signInResponse);

            }

            @Override
            public void failure(RetrofitError error) {
                loginInterface.onLoginFailure(error);
            }
        });
    }

    public static retrofit.RestAdapter getAdapter(Context context) {
        if (restAdapter == null) {
            context = context.getApplicationContext();
            restAdapter = new retrofit.RestAdapter.Builder().setClient(new OkClient(getClient()))
                    .setEndpoint(context.getSharedPreferences(PREFERENCES, 0).getString(PREFERENCES_KEY_ENDPOINT, ""))
                    .setLogLevel(retrofit.RestAdapter.LogLevel.FULL).setLog(new AndroidLog("YOUR_LOG_TAG")).build();
        }
        return restAdapter;
    }

    private static LoginTokenResponse decodeJwtToObject(String token) {
        if (token != null && !token.isEmpty()) {

            String[] jwtParts = token.split("\\.");
            String baseToken = jwtParts[1];
            int totalLength = (int) (4 * Math.ceil((float) baseToken.length() / 4));
            int paddingLength = totalLength - baseToken.length();

            String encodedToken = baseToken;
            if (paddingLength > 0) {
                String paddedString = String.format("%1$" + paddingLength + "s", "").replace(' ', '=');
                encodedToken = baseToken.concat(paddedString);
            }

            encodedToken = encodedToken.replace('-', '+');
            encodedToken = encodedToken.replace('_', '/');

            LoginTokenResponse response = null;

            try {
                ObjectMapper mapper = new ObjectMapper();
                response = mapper.readValue(Base64.decode(encodedToken, Base64.DEFAULT), LoginTokenResponse.class);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return response;
        } else {
            return null;
        }
    }

}





