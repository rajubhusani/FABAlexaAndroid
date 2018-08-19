
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
    "careCircles",
    "personaRole",
    "defaultRole"
})
public class GetPersona {

    @JsonProperty("_id")
    private List<String> _id = new ArrayList<String>();
    @JsonProperty("careCircles")
    private List<CareCircle> careCircles = new ArrayList<CareCircle>();
    @JsonProperty("personaRole")
    private List<String> personaRole = new ArrayList<String>();
    @JsonProperty("defaultRole")
    private String defaultRole;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _id
     */
    @JsonProperty("_id")
    public List<String> getId() {
        return _id;
    }

    /**
     * 
     * @param _id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(List<String> _id) {
        this._id = _id;
    }

    /**
     * 
     * @return
     *     The careCircles
     */
    @JsonProperty("careCircles")
    public List<CareCircle> getCareCircles() {
        return careCircles;
    }

    /**
     * 
     * @param careCircles
     *     The careCircles
     */
    @JsonProperty("careCircles")
    public void setCareCircles(List<CareCircle> careCircles) {
        this.careCircles = careCircles;
    }

    /**
     * 
     * @return
     *     The personaRole
     */
    @JsonProperty("personaRole")
    public List<String> getPersonaRole() {
        return personaRole;
    }

    /**
     * 
     * @param personaRole
     *     The personaRole
     */
    @JsonProperty("personaRole")
    public void setPersonaRole(List<String> personaRole) {
        this.personaRole = personaRole;
    }

    /**
     * 
     * @return
     *     The defaultRole
     */
    @JsonProperty("defaultRole")
    public String getDefaultRole() {
        return defaultRole;
    }

    /**
     * 
     * @param defaultRole
     *     The defaultRole
     */
    @JsonProperty("defaultRole")
    public void setDefaultRole(String defaultRole) {
        this.defaultRole = defaultRole;
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
