
package app.orbitahealth.sdk.responsemodel.multiplephotouploadresponse;

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
    "GPSVersionID"
})
public class Gps {

    @JsonProperty("GPSVersionID")
    private List<Integer> GPSVersionID = new ArrayList<Integer>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The GPSVersionID
     */
    @JsonProperty("GPSVersionID")
    public List<Integer> getGPSVersionID() {
        return GPSVersionID;
    }

    /**
     * 
     * @param GPSVersionID
     *     The GPSVersionID
     */
    @JsonProperty("GPSVersionID")
    public void setGPSVersionID(List<Integer> GPSVersionID) {
        this.GPSVersionID = GPSVersionID;
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
