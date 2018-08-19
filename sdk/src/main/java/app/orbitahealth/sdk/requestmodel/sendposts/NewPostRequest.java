package app.orbitahealth.sdk.requestmodel.sendposts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.getposts.File;
import app.orbitahealth.sdk.responsemodel.getposts.Image;

public class NewPostRequest {

    @SerializedName("toUsers")
    @Expose
    private List<String> toUsers = null;
    @SerializedName("postContent")
    @Expose
    private String postContent;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("files")
    @Expose
    private List<File> files = null;
    @SerializedName("conversationId")
    @Expose
    private String conversationId;
    @SerializedName("group")
    @Expose
    private List<String> group = null;

    public List<String> getToUsers() {
        return toUsers;
    }

    public void setToUsers(List<String> toUsers) {
        this.toUsers = toUsers;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }

}
