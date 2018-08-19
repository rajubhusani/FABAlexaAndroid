
package app.orbitahealth.sdk.responsemodel.devicestatusresponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "userId",
    "access"
})
public class Fitbit {

    @JsonProperty("userId")
    private Object userId;
    @JsonProperty("access")
    private Access access;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("userId")
    public Object getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The userId
     */
    @JsonProperty("userId")
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The access
     */
    @JsonProperty("access")
    public Access getAccess() {
        return access;
    }

    /**
     * 
     * @param access
     *     The access
     */
    @JsonProperty("access")
    public void setAccess(Access access) {
        this.access = access;
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
