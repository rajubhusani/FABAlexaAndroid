
package app.orbitahealth.sdk.responsemodel.patientpasswordchange;

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
    "carecircle",
    "gender"
})
public class Attributes {

    @JsonProperty("carecircle")
    private Carecircle carecircle;
    @JsonProperty("gender")
    private String gender;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The carecircle
     */
    @JsonProperty("carecircle")
    public Carecircle getCarecircle() {
        return carecircle;
    }

    /**
     * 
     * @param carecircle
     *     The carecircle
     */
    @JsonProperty("carecircle")
    public void setCarecircle(Carecircle carecircle) {
        this.carecircle = carecircle;
    }

    /**
     * 
     * @return
     *     The gender
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
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
