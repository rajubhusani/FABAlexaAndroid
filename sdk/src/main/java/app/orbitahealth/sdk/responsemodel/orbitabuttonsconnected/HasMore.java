
package app.orbitahealth.sdk.responsemodel.orbitabuttonsconnected;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

}
