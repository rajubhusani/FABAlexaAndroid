
package app.orbitahealth.sdk.responsemodel.pillboxresponse.getpillsresponse;

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
    "hasPrevious",
    "hasNext"
})
public class HasMore {

    @JsonProperty("hasPrevious")
    private Boolean hasPrevious;
    @JsonProperty("hasNext")
    private Boolean hasNext;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The hasPrevious
     */
    @JsonProperty("hasPrevious")
    public Boolean getHasPrevious() {
        return hasPrevious;
    }

    /**
     * 
     * @param hasPrevious
     *     The hasPrevious
     */
    @JsonProperty("hasPrevious")
    public void setHasPrevious(Boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }

    /**
     * 
     * @return
     *     The hasNext
     */
    @JsonProperty("hasNext")
    public Boolean getHasNext() {
        return hasNext;
    }

    /**
     * 
     * @param hasNext
     *     The hasNext
     */
    @JsonProperty("hasNext")
    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
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
