
package app.orbitahealth.sdk.responsemodel.wizardResponse;

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
    "carecircle",
    "gender",
    "birthday"
})
public class Attributes {

    @JsonProperty("carecircle")
    private Carecircle carecircle;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("birthday")
    private String birthday;
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

    /**
     * 
     * @return
     *     The birthday
     */
    @JsonProperty("birthday")
    public String getBirthday() {
        return birthday;
    }

    /**
     * 
     * @param birthday
     *     The birthday
     */
    @JsonProperty("birthday")
    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
