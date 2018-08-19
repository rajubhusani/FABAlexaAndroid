
package app.orbitahealth.sdk.requestmodel.assignmember;

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
    "lat",
    "long"
})
public class Loc {

    @JsonProperty("lat")
    private String lat;
    @JsonProperty("long")
    private String _long;
    //@JsonIgnore
   // private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The lat
     */
    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The _long
     */
    @JsonProperty("long")
    public String getLong() {
        return _long;
    }

    /**
     * 
     * @param _long
     *     The long
     */
    @JsonProperty("long")
    public void setLong(String _long) {
        this._long = _long;
    }

 /*   @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/

}
