package app.orbitahealth.sdk.responsemodel.getinsights;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Insights {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("shortDesc")
    @Expose
    private String shortDesc;
    @SerializedName("longDescLink")
    @Expose
    private String longDescLink;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDescLink() {
        return longDescLink;
    }

    public void setLongDescLink(String longDescLink) {
        this.longDescLink = longDescLink;
    }

}
