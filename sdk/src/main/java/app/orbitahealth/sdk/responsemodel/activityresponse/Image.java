package app.orbitahealth.sdk.responsemodel.activityresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Created by User on 5/20/2016.
 */
public class Image {

    private Objects attributes;
    private String _id;
    private String imgSrcThumb;
    private String imgSrc;
    @JsonProperty("attributes")
    public Objects getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Objects attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("_id")
    public String get_id() {
        return _id;
    }

    @JsonProperty("_id")
    public void set_id(String _id) {
        this._id = _id;
    }

    @JsonProperty("imgSrcThumb")
    public String getImgSrcThumb() {
        return imgSrcThumb;
    }

    @JsonProperty("imgSrcThumb")
    public void setImgSrcThumb(String imgSrcThumb) {
        this.imgSrcThumb = imgSrcThumb;
    }

    @JsonProperty("imgSrc")
    public String getImgSrc() {
        return imgSrc;
    }

    @JsonProperty("imgSrc")
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }
}
