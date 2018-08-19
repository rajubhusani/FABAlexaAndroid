package app.orbitahealth.sdk.requestmodel.addsurveydata;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddSurveyDataRequest {

    @SerializedName("userData")
    @Expose
    private JsonElement userData;
    @SerializedName("surveyId")
    @Expose
    private String surveyId;
    @SerializedName("takenDate")
    @Expose
    private String takenDate;
    @SerializedName("userId")
    @Expose
    private String userId;

    public JsonElement getUserData() {
        return userData;
    }

    public void setUserData(JsonElement userData) {
        this.userData = userData;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(String takenDate) {
        this.takenDate = takenDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
