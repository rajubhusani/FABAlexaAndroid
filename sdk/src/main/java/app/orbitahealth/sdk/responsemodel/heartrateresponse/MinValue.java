
package app.orbitahealth.sdk.responsemodel.heartrateresponse;

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
    "_id",
    "recordDate",
    "recordValue",
    "recordUnit"
})
public class MinValue {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("recordDate")
    private String recordDate;
    @JsonProperty("recordValue")
    private Double recordValue;
    @JsonProperty("recordUnit")
    private String recordUnit;
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
     *     The recordDate
     */
    @JsonProperty("recordDate")
    public String getRecordDate() {
        return recordDate;
    }

    /**
     * 
     * @param recordDate
     *     The recordDate
     */
    @JsonProperty("recordDate")
    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * 
     * @return
     *     The recordValue
     */
    @JsonProperty("recordValue")
    public Double getRecordValue() {
        return recordValue;
    }

    /**
     * 
     * @param recordValue
     *     The recordValue
     */
    @JsonProperty("recordValue")
    public void setRecordValue(Double recordValue) {
        this.recordValue = recordValue;
    }

    /**
     * 
     * @return
     *     The recordUnit
     */
    @JsonProperty("recordUnit")
    public String getRecordUnit() {
        return recordUnit;
    }

    /**
     * 
     * @param recordUnit
     *     The recordUnit
     */
    @JsonProperty("recordUnit")
    public void setRecordUnit(String recordUnit) {
        this.recordUnit = recordUnit;
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
