package app.orbitahealth.sdk.responsemodel.healthdataresponse;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import app.orbitahealth.sdk.responsemodel.User;

public class PageDatum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("measurementValue")
    @Expose
    private JsonElement measurementValue;
    @SerializedName("activityName")
    @Expose
    private String activityName;
    @SerializedName("unitOfMeasurement")
    @Expose
    private String unitOfMeasurement;
    @SerializedName("recordedTime")
    @Expose
    private String recordedTime;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("user")
    @Expose
    private JsonElement user;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("source")
    @Expose
    private Source source;

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

    public JsonElement getMeasurementValue() {
        return measurementValue;
    }

    public void setMeasurementValue(JsonElement measurementValue) {
        this.measurementValue = measurementValue;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String getRecordedTime() {
        return recordedTime;
    }

    public void setRecordedTime(String recordedTime) {
        this.recordedTime = recordedTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public JsonElement getUser() {
        return user;
    }

    public void setUser(JsonElement user) {
        this.user = user;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

}