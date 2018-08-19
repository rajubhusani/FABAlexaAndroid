
package app.orbitahealth.sdk.responsemodel.orbitabuttonsconnected;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "uriPath",
    "uriVerb",
    "payLoad"
})
public class PressedHold {

    @JsonProperty("name")
    private String name;
    @JsonProperty("uriPath")
    private String uriPath;
    @JsonProperty("uriVerb")
    private String uriVerb;
    @JsonProperty("payLoad")
    private PayLoad__ payLoad;

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

    /**
     * 
     * @return
     *     The uriPath
     */
    @JsonProperty("uriPath")
    public String getUriPath() {
        return uriPath;
    }

    /**
     * 
     * @param uriPath
     *     The uriPath
     */
    @JsonProperty("uriPath")
    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    /**
     * 
     * @return
     *     The uriVerb
     */
    @JsonProperty("uriVerb")
    public String getUriVerb() {
        return uriVerb;
    }

    /**
     * 
     * @param uriVerb
     *     The uriVerb
     */
    @JsonProperty("uriVerb")
    public void setUriVerb(String uriVerb) {
        this.uriVerb = uriVerb;
    }

    /**
     * 
     * @return
     *     The payLoad
     */
    @JsonProperty("payLoad")
    public PayLoad__ getPayLoad() {
        return payLoad;
    }

    /**
     * 
     * @param payLoad
     *     The payLoad
     */
    @JsonProperty("payLoad")
    public void setPayLoad(PayLoad__ payLoad) {
        this.payLoad = payLoad;
    }

}
