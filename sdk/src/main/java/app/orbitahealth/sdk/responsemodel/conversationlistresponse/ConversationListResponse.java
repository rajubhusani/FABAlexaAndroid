package app.orbitahealth.sdk.responsemodel.conversationlistresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.activityresponse.Paging;

public class ConversationListResponse {

    @SerializedName("conversations")
    @Expose
    private List<Conversation> conversations = null;
    @SerializedName("paging")
    @Expose
    private Paging paging;

    public List<Conversation> getConversations() {
        return conversations;
    }

    public void setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}
