
package app.orbitahealth.sdk.responsemodel.bodyheightresponse;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "maxValue",
    "minValue",
    "avgValue"
})
public class AvgHealthDatum {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("maxValue")
    private List<MaxValue> maxValue = new ArrayList<MaxValue>();
    @JsonProperty("minValue")
    private List<MinValue> minValue = new ArrayList<MinValue>();
    @JsonProperty("avgValue")
    private Double avgValue;
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
     *     The maxValue
     */
    @JsonProperty("maxValue")
    public List<MaxValue> getMaxValue() {
        return maxValue;
    }

    /**
     *
     * @param maxValue
     *     The maxValue
     */
    @JsonProperty("maxValue")
    public void setMaxValue(List<MaxValue> maxValue) {
        this.maxValue = maxValue;
    }

    /**
     *
     * @return
     *     The minValue
     */
    @JsonProperty("minValue")
    public List<MinValue> getMinValue() {
        return minValue;
    }

    /**
     * 
     * @param minValue
     *     The minValue
     */
    @JsonProperty("minValue")
    public void setMinValue(List<MinValue> minValue) {
        this.minValue = minValue;
    }

    /**
     * 
     * @return
     *     The avgValue
     */
    @JsonProperty("avgValue")
    public Double getAvgValue() {
        return avgValue;
    }

    /**
     * 
     * @param avgValue
     *     The avgValue
     */
    @JsonProperty("avgValue")
    public void setAvgValue(Double avgValue) {
        this.avgValue = avgValue;
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
