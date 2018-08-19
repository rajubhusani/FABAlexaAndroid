package app.orbitahealth.sdk.responsemodel.getposts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.conversationlistresponse.User_;


public class Post {

    @SerializedName("userSent")
    @Expose
    private User_ userSent;
    @SerializedName("attributes")
    @Expose
    private Object attributes;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("subPostsCount")
    @Expose
    private Integer subPostsCount;
    @SerializedName("urlPreview")
    @Expose
    private List<UrlPreview> urlPreview = null;
    @SerializedName("files")
    @Expose
    private List<File> files = null;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("users")
    @Expose
    private List<User_> users = null;
    @SerializedName("body")
    @Expose
    private String body;

    public User_ getUserSent() {
        return userSent;
    }

    public void setUserSent(User_ userSent) {
        this.userSent = userSent;
    }

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSubPostsCount() {
        return subPostsCount;
    }

    public void setSubPostsCount(Integer subPostsCount) {
        this.subPostsCount = subPostsCount;
    }

    public List<UrlPreview> getUrlPreview() {
        return urlPreview;
    }

    public void setUrlPreview(List<UrlPreview> urlPreview) {
        this.urlPreview = urlPreview;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public List<User_> getUsers() {
        return users;
    }

    public void setUsers(List<User_> users) {
        this.users = users;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
