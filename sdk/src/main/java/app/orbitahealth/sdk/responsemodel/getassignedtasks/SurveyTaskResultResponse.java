package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SurveyTaskResultResponse {

    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("surveyId")
    @Expose
    private String surveyId;
    @SerializedName("takenDate")
    @Expose
    private String takenDate;
    @SerializedName("userData")
    @Expose
    private JsonElement userData;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
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

    public JsonElement getUserData() {
        return userData;
    }

    public void setUserData(JsonElement userData) {
        this.userData = userData;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
