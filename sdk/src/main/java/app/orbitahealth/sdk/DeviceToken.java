package app.orbitahealth.sdk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeviceToken {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("device")
    @Expose
    private Device device;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

}
