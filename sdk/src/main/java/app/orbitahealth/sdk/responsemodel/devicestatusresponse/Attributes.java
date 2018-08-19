
package app.orbitahealth.sdk.responsemodel.devicestatusresponse;

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
    "gender",
    "oauthSettings"
})
public class Attributes {

    @JsonProperty("gender")
    private String gender;
    @JsonProperty("oauthSettings")
    private OauthSettings oauthSettings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The oauthSettings
     */
    @JsonProperty("oauthSettings")
    public OauthSettings getOauthSettings() {
        return oauthSettings;
    }

    /**
     * 
     * @param oauthSettings
     *     The oauthSettings
     */
    @JsonProperty("oauthSettings")
    public void setOauthSettings(OauthSettings oauthSettings) {
        this.oauthSettings = oauthSettings;
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
