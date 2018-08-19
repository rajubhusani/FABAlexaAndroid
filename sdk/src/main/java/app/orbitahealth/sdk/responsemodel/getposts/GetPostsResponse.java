package app.orbitahealth.sdk.responsemodel.getposts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import app.orbitahealth.sdk.responsemodel.activityresponse.Paging;

public class GetPostsResponse {

    @SerializedName("conversation")
    @Expose
    private Conversation conversation;
    @SerializedName("paging")
    @Expose
    private Paging paging;

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}
