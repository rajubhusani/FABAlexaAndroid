package app.orbitahealth.sdk.responsemodel.getposts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("imgSrcThumb")
    @Expose
    private String imgSrcThumb;
    @SerializedName("imgSrc")
    @Expose
    private String imgSrc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgSrcThumb() {
        return imgSrcThumb;
    }

    public void setImgSrcThumb(String imgSrcThumb) {
        this.imgSrcThumb = imgSrcThumb;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

}
