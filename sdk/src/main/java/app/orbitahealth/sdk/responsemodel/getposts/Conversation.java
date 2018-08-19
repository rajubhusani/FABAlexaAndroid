package app.orbitahealth.sdk.responsemodel.getposts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.conversationlistresponse.Group;
import app.orbitahealth.sdk.responsemodel.conversationlistresponse.User;
import app.orbitahealth.sdk.responsemodel.conversationlistresponse.User_;

public class Conversation {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("numberOfUsers")
    @Expose
    private Integer numberOfUsers;
    @SerializedName("lastUserSent")
    @Expose
    private String lastUserSent;
    @SerializedName("conversationCreator")
    @Expose
    private String conversationCreator;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("posts")
    @Expose
    private List<Post> posts = null;
    @SerializedName("group")
    @Expose
    private List<Group> group = null;
    @SerializedName("postsCount")
    @Expose
    private Integer postsCount;
    @SerializedName("indexName")
    @Expose
    private String indexName;
    @SerializedName("teaserFiles")
    @Expose
    private List<File> teaserFiles = null;
    @SerializedName("teaserImages")
    @Expose
    private List<Image> teaserImages = null;
    @SerializedName("users")
    @Expose
    private List<User> users = null;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("newTopic")
    @Expose
    private Boolean newTopic;
    @SerializedName("teaser")
    @Expose
    private String teaser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(Integer numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public String getLastUserSent() {
        return lastUserSent;
    }

    public void setLastUserSent(String lastUserSent) {
        this.lastUserSent = lastUserSent;
    }

    public String getConversationCreator() {
        return conversationCreator;
    }

    public void setConversationCreator(String conversationCreator) {
        this.conversationCreator = conversationCreator;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    public Integer getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public List<File> getTeaserFiles() {
        return teaserFiles;
    }

    public void setTeaserFiles(List<File> teaserFiles) {
        this.teaserFiles = teaserFiles;
    }

    public List<Image> getTeaserImages() {
        return teaserImages;
    }

    public void setTeaserImages(List<Image> teaserImages) {
        this.teaserImages = teaserImages;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Boolean getNewTopic() {
        return newTopic;
    }

    public void setNewTopic(Boolean newTopic) {
        this.newTopic = newTopic;
    }

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

}
