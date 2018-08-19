package app.orbitahealth.sdk.responsemodel.devicestatusresponse;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tokenSecret",
        "token"
})
public class AccessW  {

    @JsonProperty("tokenSecret")
    private String tokenSecret;
    @JsonProperty("token")
    private String token;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The tokenSecret
     */
    @JsonProperty("tokenSecret")
    public String getTokenSecret() {
        return tokenSecret;
    }

    /**
     *
     * @param tokenSecret
     *     The tokenSecret
     */
    @JsonProperty("tokenSecret")
    public void setTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }

    /**
     *
     * @return
     *     The token
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     *
     * @param token
     *     The token
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
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
