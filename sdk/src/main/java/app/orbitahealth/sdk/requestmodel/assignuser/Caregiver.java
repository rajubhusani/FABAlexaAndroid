package app.orbitahealth.sdk.requestmodel.assignuser;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({

        "caregiver",
        "patient",
        "carecircle",
        "device"
})


public class Caregiver {

    @JsonProperty("caregiver")
    private String caregiver;
    @JsonProperty("patient")
    private String patient;
    @JsonProperty("carecircle")
    private String carecircle;
    @JsonProperty("device")
    private String device;

    @JsonProperty("caregiver")
    public String getCaregiver() {
        return caregiver;
    }

    @JsonProperty("caregiver")
    public void setCaregiver(String caregiver) {
        this.caregiver = caregiver;
    }

    @JsonProperty("patient")
    public String getPatient() {
        return patient;
    }

    @JsonProperty("patient")
    public void setPatient(String patient) {
        this.patient = patient;
    }

    @JsonProperty("carecircle")
    public String getCarecircle() {
        return carecircle;
    }

    @JsonProperty("carecircle")
    public void setCarecircle(String carecircle) {
        this.carecircle = carecircle;
    }

    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(String device) {
        this.device = device;
    }
}
