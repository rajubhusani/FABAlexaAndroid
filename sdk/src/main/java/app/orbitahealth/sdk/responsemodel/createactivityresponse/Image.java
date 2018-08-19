
package app.orbitahealth.sdk.responsemodel.createactivityresponse;

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
    "attributes",
    "_id",
    "imgSrcThumb",
    "imgSrc"
})
public class Image {

    @JsonProperty("attributes")
    private Object attributes;
    @JsonProperty("_id")
    private String Id;
    @JsonProperty("imgSrcThumb")
    private String imgSrcThumb;
    @JsonProperty("imgSrc")
    private String imgSrc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public Object getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("_id")
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The imgSrcThumb
     */
    @JsonProperty("imgSrcThumb")
    public String getImgSrcThumb() {
        return imgSrcThumb;
    }

    /**
     * 
     * @param imgSrcThumb
     *     The imgSrcThumb
     */
    @JsonProperty("imgSrcThumb")
    public void setImgSrcThumb(String imgSrcThumb) {
        this.imgSrcThumb = imgSrcThumb;
    }

    /**
     * 
     * @return
     *     The imgSrc
     */
    @JsonProperty("imgSrc")
    public String getImgSrc() {
        return imgSrc;
    }

    /**
     * 
     * @param imgSrc
     *     The imgSrc
     */
    @JsonProperty("imgSrc")
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
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
