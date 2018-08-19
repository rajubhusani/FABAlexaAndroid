package app.orbitahealth.sdk;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PasswordValidateResponse {

    @JsonProperty("strong")
    private Boolean strong;
    @JsonProperty("reason")
    private List<String> reason = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The strong
     */
    @JsonProperty("strong")
    public Boolean getStrong() {
        return strong;
    }

    /**
     *
     * @param strong
     * The strong
     */
    @JsonProperty("strong")
    public void setStrong(Boolean strong) {
        this.strong = strong;
    }

    /**
     *
     * @return
     * The reason
     */
    @JsonProperty("reason")
    public List<String> getReason() {
        return reason;
    }

    /**
     *
     * @param reason
     * The reason
     */
    @JsonProperty("reason")
    public void setReason(List<String> reason) {
        this.reason = reason;
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