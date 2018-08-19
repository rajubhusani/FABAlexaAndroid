
package app.orbitahealth.sdk.requestmodel;

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
public class MemberObject {

    @JsonProperty("caregiver")
    private String caregiver;
    @JsonProperty("patient")
    private String patient;
    @JsonProperty("carecircle")
    private String carecircle;
    @JsonProperty("device")
    private String device;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The caregiver
     */
    @JsonProperty("caregiver")
    public String getCaregiver() {
        return caregiver;
    }

    /**
     * 
     * @param caregiver
     *     The caregiver
     */
    @JsonProperty("caregiver")
    public void setCaregiver(String caregiver) {
        this.caregiver = caregiver;
    }

    /**
     * 
     * @return
     *     The patient
     */
    @JsonProperty("patient")
    public String getPatient() {
        return patient;
    }

    /**
     * 
     * @param patient
     *     The patient
     */
    @JsonProperty("patient")
    public void setPatient(String patient) {
        this.patient = patient;
    }

    /**
     * 
     * @return
     *     The carecircle
     */
    @JsonProperty("carecircle")
    public String getCarecircle() {
        return carecircle;
    }

    /**
     * 
     * @param carecircle
     *     The carecircle
     */
    @JsonProperty("carecircle")
    public void setCarecircle(String carecircle) {
        this.carecircle = carecircle;
    }

    /**
     * 
     * @return
     *     The device
     */
    @JsonProperty("device")
    public String getDevices() {
        return device;
    }

    /**
     * 
     * @param devices
     *     The devices
     */
    @JsonProperty("device")
    public void setDevices(String devices) {
        this.device = devices;
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
