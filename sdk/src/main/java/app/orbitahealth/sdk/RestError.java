package app.orbitahealth.sdk;

import com.google.gson.annotations.SerializedName;

public class RestError {
    @SerializedName("code")
    public int code;
    @SerializedName("reason")
    public String errorDetails;
}