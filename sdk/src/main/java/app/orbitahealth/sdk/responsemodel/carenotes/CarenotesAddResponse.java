package app.orbitahealth.sdk.responsemodel.carenotes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarenotesAddResponse {
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("patientid")
    @Expose
    private String patientid;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
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
