package app.orbitahealth.sdk.responsemodel.messagesrecipientsearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipientSearchResponse {

    @SerializedName("groups")
    @Expose
    private List<Group> groups = null;
    @SerializedName("users")
    @Expose
    private List<User> users = null;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
