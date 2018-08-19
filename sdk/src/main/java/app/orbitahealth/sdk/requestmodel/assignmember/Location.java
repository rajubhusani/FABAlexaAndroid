
package app.orbitahealth.sdk.requestmodel.assignmember;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "loc"
})
public class Location {

    @JsonProperty("address")
    private String address;
    @JsonProperty("loc")
    private Loc loc;
    private ArrayList<Double> locations;
    //@JsonIgnore
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    /**
     * 
     * @return
     *     The loc
     */
    @JsonProperty("loc")
    public Loc getLoc() {
        return loc;
    }

    /**
     * 
     * @param loc
     *     The loc
     */
    @JsonProperty("loc")
    public void setLoc(Loc loc) {
        this.loc = loc;
    }

    public void addLoc(Double latLong) {
        if (null==loc) {
            locations = new ArrayList<>();
        }
        if (null==latLong) {
            return;
        }
        locations.add(latLong);
    }

    /*@JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/

}
