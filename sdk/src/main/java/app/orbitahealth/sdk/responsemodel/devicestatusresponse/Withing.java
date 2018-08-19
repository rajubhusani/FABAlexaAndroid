
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
    "request",
    "userId",
    "access",
    "name"
})
public class Withing {

    @JsonProperty("request")
    private Request request;
    @JsonProperty("userId")
    private Object userId;
    @JsonProperty("access")
    private AccessW access;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The request
     */
    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

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
     * @return the access
     */
    @JsonProperty("access")
    public AccessW getAccess() {
        return access;
    }

    /**
     *
     * @param access
     */
    @JsonProperty("access")
    public void setAccess(AccessW access) {
        this.access = access;
    }

    /**
     * 
     * @return
     *     The name
     */

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
