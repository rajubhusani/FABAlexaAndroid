
package app.orbitahealth.sdk.responsemodel.patientheightresponse;

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
    "BodyHeight",
    "paging"
})
public class PatientHeightResponse {

    @JsonProperty("BodyHeight")
    private List<BodyHeight> BodyHeight = new ArrayList<BodyHeight>();
    @JsonProperty("paging")
    private Paging paging;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The bodyHeight
     */
    @JsonProperty("BodyHeight")
    public List<BodyHeight> getBodyHeight() {
        return BodyHeight;
    }

    /**
     * 
     * @param BodyHeight
     *     The BodyHeight
     */
    @JsonProperty("BodyHeight")
    public void setBodyHeight(List<BodyHeight> BodyHeight) {
        this.BodyHeight = BodyHeight;
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
