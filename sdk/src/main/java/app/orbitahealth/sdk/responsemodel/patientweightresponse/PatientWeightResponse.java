
package app.orbitahealth.sdk.responsemodel.patientweightresponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BodyWeight",
    "paging"
})
public class PatientWeightResponse {

    @JsonProperty("BodyWeight")
    private List<BodyWeight> BodyWeight = new ArrayList<BodyWeight>();
    @JsonProperty("paging")
    private Paging paging;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The BodyWeight
     */
    @JsonProperty("BodyWeight")
    public List<BodyWeight> getBodyWeight() {
        return BodyWeight;
    }

    /**
     * 
     * @param BodyWeight
     *     The BodyWeight
     */
    @JsonProperty("BodyWeight")
    public void setBodyWeight(List<BodyWeight> BodyWeight) {
        this.BodyWeight = BodyWeight;
    }

    /**
     * 
     * @return
     *     The paging
     */
    @JsonProperty("paging")
    public Paging getPaging() {
        return paging;
    }

    /**
     * 
     * @param paging
     *     The paging
     */
    @JsonProperty("paging")
    public void setPaging(Paging paging) {
        this.paging = paging;
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
