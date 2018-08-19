
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
    "tokenSecret",
    "token",
    "expiresAt"
})
public class Access {

    @JsonProperty("tokenSecret")
    private Object tokenSecret;
    @JsonProperty("token")
    private Object token;
    @JsonProperty("expiresAt")
    private Object expiresAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tokenSecret
     */
    @JsonProperty("tokenSecret")
    public Object getTokenSecret() {
        return tokenSecret;
    }

    /**
     * 
     * @param tokenSecret
     *     The tokenSecret
     */
    @JsonProperty("tokenSecret")
    public void setTokenSecret(Object tokenSecret) {
        this.tokenSecret = tokenSecret;
    }

    /**
     * 
     * @return
     *     The token
     */
    @JsonProperty("token")
    public Object getToken() {
        return token;
    }

    /**
     * 
     * @param token
     *     The token
     */
    @JsonProperty("token")
    public void setToken(Object token) {
        this.token = token;
    }

    public Object getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Object expiresAt) {
        this.expiresAt = expiresAt;
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
