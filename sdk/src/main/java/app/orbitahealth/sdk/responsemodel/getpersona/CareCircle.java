
package app.orbitahealth.sdk.responsemodel.getpersona;

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
    "_id",
    "carecircleMember"
})
public class CareCircle {

    @JsonProperty("_id")
    private String _id;
    @JsonProperty("carecircleMember")
    private List<CarecircleMember> carecircleMember = new ArrayList<CarecircleMember>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _id
     */
    @JsonProperty("_id")
    public String getId() {
        return _id;
    }

    /**
     * 
     * @param _id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String _id) {
        this._id = _id;
    }

    /**
     * 
     * @return
     *     The carecircleMember
     */
    @JsonProperty("carecircleMember")
    public List<CarecircleMember> getCarecircleMember() {
        return carecircleMember;
    }

    /**
     * 
     * @param carecircleMember
     *     The carecircleMember
     */
    @JsonProperty("carecircleMember")
    public void setCarecircleMember(List<CarecircleMember> carecircleMember) {
        this.carecircleMember = carecircleMember;
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
