
package app.orbitahealth.sdk.requestmodel.assignuser;

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
    "loc",
    "address"
})
public class Location {

    @JsonProperty("loc")
    private List<Double> loc = new ArrayList<Double>();
    @JsonProperty("address")
    private String address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The loc
     */
    @JsonProperty("loc")
    public List<Double> getLoc() {
        return loc;
    }

    /**
     * 
     * @param loc
     *     The loc
     */
    @JsonProperty("loc")
    public void setLoc(List<Double> loc) {
        this.loc = loc;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void addLoc(Double latLong) {
        if (null==loc) {
            loc = new ArrayList<>();
        }
        if (null==latLong) {
            return;
        }
        loc.add(latLong);
    }

}
