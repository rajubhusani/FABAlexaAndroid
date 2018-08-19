
package app.orbitahealth.sdk.responsemodel.bloodpressureresponse;

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
    "healthData",
    "avgHealthData"
})
public class ResponseChartData {

    @JsonProperty("healthData")
    private List<HealthDatum> healthData = new ArrayList<HealthDatum>();
    @JsonProperty("avgHealthData")
    private List<AvgHealthDatum> avgHealthData = new ArrayList<AvgHealthDatum>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The healthData
     */
    @JsonProperty("healthData")
    public List<HealthDatum> getHealthData() {
        return healthData;
    }

    /**
     * 
     * @param healthData
     *     The healthData
     */
    @JsonProperty("healthData")
    public void setHealthData(List<HealthDatum> healthData) {
        this.healthData = healthData;
    }

    /**
     * 
     * @return
     *     The avgHealthData
     */
    @JsonProperty("avgHealthData")
    public List<AvgHealthDatum> getAvgHealthData() {
        return avgHealthData;
    }

    /**
     * 
     * @param avgHealthData
     *     The avgHealthData
     */
    @JsonProperty("avgHealthData")
    public void setAvgHealthData(List<AvgHealthDatum> avgHealthData) {
        this.avgHealthData = avgHealthData;
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
