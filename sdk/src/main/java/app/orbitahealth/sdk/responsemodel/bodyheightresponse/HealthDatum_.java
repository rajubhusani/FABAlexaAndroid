
package app.orbitahealth.sdk.responsemodel.bodyheightresponse;

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
    "measuredTime",
    "measuredValue",
    "measuredUnit"
})
public class HealthDatum_ {

    @JsonProperty("measuredTime")
    private String measuredTime;
    @JsonProperty("measuredValue")
    private Double measuredValue;
    @JsonProperty("measuredUnit")
    private String measuredUnit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The measuredTime
     */
    @JsonProperty("measuredTime")
    public String getMeasuredTime() {
        return measuredTime;
    }

    /**
     * 
     * @param measuredTime
     *     The measuredTime
     */
    @JsonProperty("measuredTime")
    public void setMeasuredTime(String measuredTime) {
        this.measuredTime = measuredTime;
    }

    /**
     * 
     * @return
     *     The measuredValue
     */
    @JsonProperty("measuredValue")
    public Double getMeasuredValue() {
        return measuredValue;
    }

    /**
     * 
     * @param measuredValue
     *     The measuredValue
     */
    @JsonProperty("measuredValue")
    public void setMeasuredValue(Double measuredValue) {
        this.measuredValue = measuredValue;
    }

    /**
     * 
     * @return
     *     The measuredUnit
     */
    @JsonProperty("measuredUnit")
    public String getMeasuredUnit() {
        return measuredUnit;
    }

    /**
     * 
     * @param measuredUnit
     *     The measuredUnit
     */
    @JsonProperty("measuredUnit")
    public void setMeasuredUnit(String measuredUnit) {
        this.measuredUnit = measuredUnit;
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
