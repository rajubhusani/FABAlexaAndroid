
package app.orbitahealth.sdk.responsemodel.bloodpressureresponse;

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
    "systolic",
    "diastolic"
})
public class RecordValue {

    @JsonProperty("systolic")
    private Integer systolic;
    @JsonProperty("diastolic")
    private Integer diastolic;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The systolic
     */
    @JsonProperty("systolic")
    public Integer getSystolic() {
        return systolic;
    }

    /**
     * 
     * @param systolic
     *     The systolic
     */
    @JsonProperty("systolic")
    public void setSystolic(Integer systolic) {
        this.systolic = systolic;
    }

    /**
     * 
     * @return
     *     The diastolic
     */
    @JsonProperty("diastolic")
    public Integer getDiastolic() {
        return diastolic;
    }

    /**
     * 
     * @param diastolic
     *     The diastolic
     */
    @JsonProperty("diastolic")
    public void setDiastolic(Integer diastolic) {
        this.diastolic = diastolic;
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
