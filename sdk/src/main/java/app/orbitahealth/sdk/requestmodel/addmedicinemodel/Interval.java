
package app.orbitahealth.sdk.requestmodel.addmedicinemodel;

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
    "intervalType",
    "intervalCount"
})
public class Interval {

    @JsonProperty("intervalType")
    private String intervalType;
    @JsonProperty("intervalCount")
    private Integer intervalCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The intervalType
     */
    @JsonProperty("intervalType")
    public String getIntervalType() {
        return intervalType;
    }

    /**
     * 
     * @param intervalType
     *     The intervalType
     */
    @JsonProperty("intervalType")
    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    /**
     * 
     * @return
     *     The intervalCount
     */
    @JsonProperty("intervalCount")
    public Integer getIntervalCount() {
        return intervalCount;
    }

    /**
     * 
     * @param intervalCount
     *     The intervalCount
     */
    @JsonProperty("intervalCount")
    public void setIntervalCount(Integer intervalCount) {
        this.intervalCount = intervalCount;
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
