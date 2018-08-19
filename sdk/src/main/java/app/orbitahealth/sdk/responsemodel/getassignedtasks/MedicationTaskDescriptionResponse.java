package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MedicationTaskDescriptionResponse {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("dosage")
    @Expose
    private Integer dosage;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("journeytypeid")
    @Expose
    private String journeytypeid;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("refSource")
    @Expose
    private String refSource;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(Integer dosage) {
        this.dosage = dosage;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getJourneytypeid() {
        return journeytypeid;
    }

    public void setJourneytypeid(String journeytypeid) {
        this.journeytypeid = journeytypeid;
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

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getRefSource() {
        return refSource;
    }

    public void setRefSource(String refSource) {
        this.refSource = refSource;
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
