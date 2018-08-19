
package app.orbitahealth.sdk.responsemodel.getdashboard;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecentData {

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
    @SerializedName("unitOfMeasurement")
    @Expose
    private String unitOfMeasurement;
    @SerializedName("recordedTime")
    @Expose
    private String recordedTime;
    @SerializedName("user")
    @Expose
    private String user;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The modifiedAt
     */
    public String getModifiedAt() {
        return modifiedAt;
    }

    /**
     * 
     * @param modifiedAt
     *     The modifiedAt
     */
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The measurementValue
     */
    public JsonElement getMeasurementValue() {
        return measurementValue;
    }

    /**
     * 
     * @param measurementValue
     *     The measurementValue
     */
    public void setMeasurementValue(JsonElement measurementValue) {
        this.measurementValue = measurementValue;
    }

    /**
     * 
     * @return
     *     The unitOfMeasurement
     */
    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * 
     * @param unitOfMeasurement
     *     The unitOfMeasurement
     */
    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    /**
     * 
     * @return
     *     The recordedTime
     */
    public String getRecordedTime() {
        return recordedTime;
    }

    /**
     * 
     * @param recordedTime
     *     The recordedTime
     */
    public void setRecordedTime(String recordedTime) {
        this.recordedTime = recordedTime;
    }

    /**
     * 
     * @return
     *     The user
     */
    public String getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(String user) {
        this.user = user;
    }

}
