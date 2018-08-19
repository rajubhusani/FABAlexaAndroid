
package app.orbitahealth.sdk.responsemodel.patientheightresponse;

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
    "_id",
    "modifiedAt",
    "createdAt",
    "measurementValue",
    "unitOfMeasurement",
    "notes",
    "attributes",
    "user",
    "__v",
    "source"
})
public class BodyHeight {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("modifiedAt")
    private String modifiedAt;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("measurementValue")
    private Double measurementValue;
    @JsonProperty("unitOfMeasurement")
    private String unitOfMeasurement;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("attributes")
    private String attributes;
    @JsonProperty("user")
    private User user;
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("source")
    private Source source;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The modifiedAt
     */
    @JsonProperty("modifiedAt")
    public String getModifiedAt() {
        return modifiedAt;
    }

    /**
     * 
     * @param modifiedAt
     *     The modifiedAt
     */
    @JsonProperty("modifiedAt")
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The measurementValue
     */
    @JsonProperty("measurementValue")
    public Double getMeasurementValue() {
        return measurementValue;
    }

    /**
     * 
     * @param measurementValue
     *     The measurementValue
     */
    @JsonProperty("measurementValue")
    public void setMeasurementValue(Double measurementValue) {
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

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The v
     */
    @JsonProperty("__v")
    public Integer getV() {
        return v;
    }

    /**
     * 
     * @param v
     *     The __v
     */
    @JsonProperty("__v")
    public void setV(Integer v) {
        this.v = v;
    }

    /**
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
