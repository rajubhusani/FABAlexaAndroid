
package app.orbitahealth.sdk.responsemodel.wizardResponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "caregiver",
    "patient",
    "carecircle",
    "devices"
})
public class Caregiver {

    @JsonProperty("caregiver")
    private Boolean caregiver;
    @JsonProperty("patient")
    private Boolean patient;
    @JsonProperty("carecircle")
    private Boolean carecircle;
    @JsonProperty("device")
    private Boolean device;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The caregiver
     */
    @JsonProperty("caregiver")
    public Boolean getCaregiver() {
        return caregiver;
    }

    /**
     * 
     * @param caregiver
     *     The caregiver
     */
    @JsonProperty("caregiver")
    public void setCaregiver(Boolean caregiver) {
        this.caregiver = caregiver;
    }

    /**
     * 
     * @return
     *     The patient
     */
    @JsonProperty("patient")
    public Boolean getPatient() {
        return patient;
    }

    /**
     * 
     * @param patient
     *     The patient
     */
    @JsonProperty("patient")
    public void setPatient(Boolean patient) {
        this.patient = patient;
    }

    /**
     * 
     * @return
     *     The carecircle
     */
    @JsonProperty("carecircle")
    public Boolean getCarecircle() {
        return carecircle;
    }

    /**
     * 
     * @param carecircle
     *     The carecircle
     */
    @JsonProperty("carecircle")
    public void setCarecircle(Boolean carecircle) {
        this.carecircle = carecircle;
    }

    /**
     * 
     * @return
     *     The device
     */
    @JsonProperty("device")
    public Boolean getDevice() {
        return device;
    }

    /**
     * 
     * @param device
     *     The device
     */
    @JsonProperty("device")
    public void setDevice(Boolean device) {
        this.device = device;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
