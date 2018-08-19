package app.orbitahealth.sdk.responsemodel.getsurveyresultgraphdata;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SurveyData implements Parcelable {

    @SerializedName("_id")
    @Expose
    private String id;
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
    private CreatedBy createdBy;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.surveyId);
        dest.writeString(this.takenDate);
        dest.writeString(this.userData.toString());
        dest.writeString(this.userId);
        dest.writeParcelable(this.createdBy, flags);
        dest.writeString(this.user);
        dest.writeValue(this.v);
        dest.writeString(this.modifiedAt);
        dest.writeString(this.createdAt);
    }

    public SurveyData() {
    }

    protected SurveyData(Parcel in) {
        this.id = in.readString();
        this.surveyId = in.readString();
        this.takenDate = in.readString();
        this.userData = new JsonParser().parse(in.readString());
        this.userId = in.readString();
        this.createdBy = in.readParcelable(CreatedBy.class.getClassLoader());
        this.user = in.readString();
        this.v = (Integer) in.readValue(Integer.class.getClassLoader());
        this.modifiedAt = in.readString();
        this.createdAt = in.readString();
    }

    public static final Parcelable.Creator<SurveyData> CREATOR = new Parcelable.Creator<SurveyData>() {
        @Override
        public SurveyData createFromParcel(Parcel source) {
            return new SurveyData(source);
        }

        @Override
        public SurveyData[] newArray(int size) {
            return new SurveyData[size];
        }
    };

}
