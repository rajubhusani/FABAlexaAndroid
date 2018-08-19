package com.willblaschko.android.alexa.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlexaCardModel {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("richcontent")
    @Expose
    private String richcontent;
    @SerializedName("image")
    @Expose
    private AlexaCardImageModel image;
    @SerializedName("video")
    @Expose
    private AlexaCardVideoModel video;

    public AlexaCardModel() {
        this.type = null;
        this.title = null;
        this.text = null;
        this.content = null;
        this.richcontent = null;
        this.image = null;
        this.video = null;
    }

    public AlexaCardModel(String type, String title, String text, String content, String richcontent, AlexaCardImageModel image, AlexaCardVideoModel video) {
        this.type = type;
        this.title = title;
        this.text = text;
        this.content = content;
        this.richcontent = richcontent;
        this.image = image;
        this.video = video;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRichcontent() {
        return richcontent;
    }

    public void setRichcontent(String richcontent) {
        this.richcontent = richcontent;
    }

    public AlexaCardImageModel getImage() {
        return image;
    }

    public void setImage(AlexaCardImageModel image) {
        this.image = image;
    }

    public AlexaCardVideoModel getVideo() {
        return video;
    }

    public void setVideo(AlexaCardVideoModel video) {
        this.video = video;
    }

}
