package app.orbitahealth.sdk;

import android.content.Context;

import app.orbitahealth.sdk.requestmodel.signupmodel.User;
import retrofit.RetrofitError;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.POST;


public interface LoginInterface {


    void onLoginSuccess(SignInResponse signInResponse);

    void onLoginFailure(RetrofitError error);
}
