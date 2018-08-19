package app.orbitahealth.sdk.responsemodel.getposts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UrlPreview {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("pageTitle")
    @Expose
    private String pageTitle;
    @SerializedName("teaserImage")
    @Expose
    private String teaserImage;
    @SerializedName("teaser")
    @Expose
    private String teaser;
    @SerializedName("hyperlink")
    @Expose
    private String hyperlink;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getTeaserImage() {
        return teaserImage;
    }

    public void setTeaserImage(String teaserImage) {
        this.teaserImage = teaserImage;
    }

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

}
