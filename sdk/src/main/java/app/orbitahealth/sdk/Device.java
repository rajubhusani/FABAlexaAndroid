package app.orbitahealth.sdk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Device {

    @SerializedName("lastActiveDate")
    @Expose
    private String lastActiveDate;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("arnType")
    @Expose
    private String arnType;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("uniqueId")
    @Expose
    private String uniqueId;

    public String getLastActiveDate() {
        return lastActiveDate;
    }

    public void setLastActiveDate(String lastActiveDate) {
        this.lastActiveDate = lastActiveDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getArnType() {
        return arnType;
    }

    public void setArnType(String arnType) {
        this.arnType = arnType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

}
