
package app.orbitahealth.sdk.requestmodel.patientweight;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "user",
        "measurementValue",
        "unitOfMeasurement",
        "bodyWeightDateTime",
        "recordedTime",
        "source",
        "notes",
        "attributes",
    "user",
    "measurementValue",
    "unitOfMeasurement",
    "bodyWeightDateTime",
        "recordedTime",
    "source",
    "notes",
    "attributes"
})
public class PatientWeight {

    @JsonProperty("user")
    private String user;
    @JsonProperty("measurementValue")
    private String measurementValue;
    @JsonProperty("unitOfMeasurement")
    private String unitOfMeasurement;
    @JsonProperty("bodyWeightDateTime")
    private String bodyWeightDateTime;


    @JsonProperty("recordedTime")
    private String recordedTime;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("attributes")
    private String attributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    /**
     *
     * @return
     *     The measurementValue
     */
    @JsonProperty("measurementValue")
    public String getMeasurementValue() {
        return measurementValue;
    }

    /**
     *
     * @param measurementValue
     *     The measurementValue
     */
    @JsonProperty("measurementValue")
    public void setMeasurementValue(String measurementValue) {
        this.measurementValue = measurementValue;
    }

    /**
     *
     * @return
     *     The unitOfMeasurement
     */
    @JsonProperty("unitOfMeasurement")
    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     *
     * @param unitOfMeasurement
     *     The unitOfMeasurement
     */
    @JsonProperty("unitOfMeasurement")
    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    /**
     *
     * @return
     *     The bodyWeightDateTime
     */
    @JsonProperty("bodyWeightDateTime")
    public String getBodyWeightDateTime() {
        return bodyWeightDateTime;
    }

    /**
     *
     * @param bodyWeightDateTime
     *     The bodyWeightDateTime
     */
    @JsonProperty("bodyWeightDateTime")
    public void setBodyWeightDateTime(String bodyWeightDateTime) {
        this.bodyWeightDateTime = bodyWeightDateTime;
    }

    /**
     *
     * @return the recorded time
     */

    @JsonProperty("recordedTime")
    public String getRecordedTime() {
        return recordedTime;
    }

    /**
     *
     * @param recordedTime
     */
    @JsonProperty("recordedTime")
    public void setRecordedTime(String recordedTime) {
        this.recordedTime = recordedTime;
    }

    /**
     *
     *
     * @return
     *     The source
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     *
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     *
     * @return
     *     The notes
     */
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    /**
     *
     * @param notes
     *     The notes
     */
    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     *
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public String getAttributes() {
        return attributes;
    }

    /**
     *
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(String attributes) {
        this.attributes = attributes;
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
