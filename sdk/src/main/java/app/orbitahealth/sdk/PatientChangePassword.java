package app.orbitahealth.sdk;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by User on 13-05-2016.
 */
public class PatientChangePassword {
    @JsonProperty("currentPassword")
    String currentPassword;
    @JsonProperty("newPassword")
    String newPassword;
    @JsonProperty("verifyPassword")
    String verifyPassword;

    @JsonProperty("currentPassword")
    public String getCurrentPassword() {
        return currentPassword;
    }

    @JsonProperty("currentPassword")
    public void setCurrentPassword(String CurrentPassword) {
        currentPassword = CurrentPassword;
    }

    @JsonProperty("newPassword")
    public String getNewPassword() {
        return newPassword;
    }

    @JsonProperty("newPassword")
    public void setNewPassword(String newPassword1) {
        newPassword = newPassword1;
    }

    @JsonProperty("verifyPassword")
    public String getRetypePassword() {
        return verifyPassword;
    }

    @JsonProperty("verifyPassword")
    public void setRetypePassword(String retypePassword) {
        verifyPassword = retypePassword;
    }
}
