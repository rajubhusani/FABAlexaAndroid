package app.orbitahealth.sdk.responsemodel;

import android.content.Context;
import android.content.SharedPreferences;

import app.orbitahealth.sdk.LoginInterface;
import app.orbitahealth.sdk.RestAdapter;
import app.orbitahealth.sdk.Services;
import app.orbitahealth.sdk.SignInResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by User on 6/13/2016.
 */
public class ResponseDash {
    private static final String PREFERENCES = "Preferences";
    SignInResponse responseObj = new SignInResponse();
    public void signIn(String userAgent, final Context mCOntext, app.orbitahealth.sdk.requestmodel.signupmodel.User user, final LoginInterface loginInterface) {

        Services services = RestAdapter.getAdapter(mCOntext).create(Services.class);
        services.getSignIn(user, userAgent, new Callback<SignInResponse>() {
            @Override
            public void success(SignInResponse signInResponse, Response response) {
                responseObj = signInResponse;
                String token = signInResponse.getToken();
                System.out.println("Token "+token+ "Success "+String.valueOf(signInResponse.getSuccess()));
                SharedPreferences sharedPreferences = mCOntext.getSharedPreferences(PREFERENCES,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("orbitaToken", token);
                editor.commit();
                loginInterface.onLoginSuccess(signInResponse);

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }



}
