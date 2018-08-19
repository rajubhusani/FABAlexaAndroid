package com.willblaschko.android.alexa.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlexaCardImageModel {

    @SerializedName("smallImageUrl")
    @Expose
    private String smallImageUrl;
    @SerializedName("largeImageUrl")
    @Expose
    private String largeImageUrl;

    public AlexaCardImageModel() {
        this.smallImageUrl = null;
        this.largeImageUrl = null;
    }

    public AlexaCardImageModel(String smallImageUrl, String largeImageUrl) {
        this.smallImageUrl = smallImageUrl;
        this.largeImageUrl = largeImageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

}
