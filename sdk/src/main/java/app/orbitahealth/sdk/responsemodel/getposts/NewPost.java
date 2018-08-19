package app.orbitahealth.sdk.responsemodel.getposts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.conversationlistresponse.Group;

public class NewPost {

    @SerializedName("post")
    @Expose
    private Post post;
    @SerializedName("conversationId")
    @Expose
    private String conversationId;
    @SerializedName("group")
    @Expose
    private List<Group> group = null;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

}
