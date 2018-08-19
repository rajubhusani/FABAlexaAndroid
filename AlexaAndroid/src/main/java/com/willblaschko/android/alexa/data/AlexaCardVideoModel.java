package com.willblaschko.android.alexa.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlexaCardVideoModel {

    @SerializedName("videoUrl")
    @Expose
    private String videoUrl;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;

    public AlexaCardVideoModel() {
        this.videoUrl = null;
        this.thumbnailUrl = null;
    }

    public AlexaCardVideoModel(String videoUrl, String thumbnailUrl) {
        this.videoUrl = videoUrl;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

}
