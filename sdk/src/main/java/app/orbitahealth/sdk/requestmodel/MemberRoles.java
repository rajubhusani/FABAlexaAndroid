
package app.orbitahealth.sdk.requestmodel;

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
    "caregiver"
})
public class MemberRoles {

    @JsonProperty("caregiver")
    private MemberObject caregiver;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The caregiver
     */
    @JsonProperty("caregiver")
    public MemberObject getCaregiver() {
        return caregiver;
    }

    /**
     * 
     * @param caregiver
     *     The caregiver
     */
    @JsonProperty("caregiver")
    public void setCaregiver(MemberObject caregiver) {
        this.caregiver = caregiver;
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
