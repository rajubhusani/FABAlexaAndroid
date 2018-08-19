package app.orbitahealth.sdk.responsemodel.conversationlistresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Conversation {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("lastUserSent")
    @Expose
    private String lastUserSent;
    @SerializedName("conversationCreator")
    @Expose
    private String conversationCreator;
    @SerializedName("group")
    @Expose
    private List<Group> group = null;
    @SerializedName("teaserFiles")
    @Expose
    private List<Object> teaserFiles = null;
    @SerializedName("teaserImages")
    @Expose
    private List<Object> teaserImages = null;
    @SerializedName("users")
    @Expose
    private List<User> users = null;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("teaser")
    @Expose
    private String teaser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
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

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    public List<Object> getTeaserFiles() {
        return teaserFiles;
    }

    public void setTeaserFiles(List<Object> teaserFiles) {
        this.teaserFiles = teaserFiles;
    }

    public List<Object> getTeaserImages() {
        return teaserImages;
    }

    public void setTeaserImages(List<Object> teaserImages) {
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

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

}
