
package app.orbitahealth.sdk.responsemodel.bodyweightresponse;

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
    "dateValue",
    "healthData"
})
public class HealthDatum {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("dateValue")
    private String dateValue;
    @JsonProperty("healthData")
    private List<HealthDatum_> healthData = new ArrayList<HealthDatum_>();
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
     *     The dateValue
     */
    @JsonProperty("dateValue")
    public String getDateValue() {
        return dateValue;
    }

    /**
     * 
     * @param dateValue
     *     The dateValue
     */
    @JsonProperty("dateValue")
    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * 
     * @return
     *     The healthData
     */
    @JsonProperty("healthData")
    public List<HealthDatum_> getHealthData() {
        return healthData;
    }

    /**
     * 
     * @param healthData
     *     The healthData
     */
    @JsonProperty("healthData")
    public void setHealthData(List<HealthDatum_> healthData) {
        this.healthData = healthData;
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
