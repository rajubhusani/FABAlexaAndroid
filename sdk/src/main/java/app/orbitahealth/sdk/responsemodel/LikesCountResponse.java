
package app.orbitahealth.sdk.responsemodel;

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
    "likeStatus",
    "likesCount"
})
public class LikesCountResponse {

    @JsonProperty("likeStatus")
    private Boolean likeStatus;
    @JsonProperty("likesCount")
    private Integer likesCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The likeStatus
     */
    @JsonProperty("likeStatus")
    public Boolean getLikeStatus() {
        return likeStatus;
    }

    /**
     * 
     * @param likeStatus
     *     The likeStatus
     */
    @JsonProperty("likeStatus")
    public void setLikeStatus(Boolean likeStatus) {
        this.likeStatus = likeStatus;
    }

    /**
     * 
     * @return
     *     The likesCount
     */
    @JsonProperty("likesCount")
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     * 
     * @param likesCount
     *     The likesCount
     */
    @JsonProperty("likesCount")
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
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
