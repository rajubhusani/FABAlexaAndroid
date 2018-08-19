
package app.orbitahealth.sdk.responsemodel;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;


public class HasMore {

    @SerializedName("hasPrevious")
    @Expose
    private boolean hasPrevious;
    @SerializedName("hasNext")
    @Expose
    private boolean hasNext;

    /**
     * 
     * @return
     *     The hasPrevious
     */
    public boolean isHasPrevious() {
        return hasPrevious;
    }

    /**
     * 
     * @param hasPrevious
     *     The hasPrevious
     */
    public void setHasPrevious(boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }

    /**
     * 
     * @return
     *     The hasNext
     */
    public boolean isHasNext() {
        return hasNext;
    }

    /**
     * 
     * @param hasNext
     *     The hasNext
     */
    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "likeStatus"
    })
    public static class GetLikeResponse {

        @JsonProperty("likeStatus")
        private Boolean likeStatus;
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

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
}
