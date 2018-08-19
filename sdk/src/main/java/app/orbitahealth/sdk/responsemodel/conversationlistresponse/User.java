package app.orbitahealth.sdk.responsemodel.conversationlistresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("user")
    @Expose
    private User_ user;
    @SerializedName("readAt")
    @Expose
    private String readAt;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("read")
    @Expose
    private Boolean read;

    public User_ getUser() {
        return user;
    }

    public void setUser(User_ user) {
        this.user = user;
    }

    public String getReadAt() {
        return readAt;
    }

    public void setReadAt(String readAt) {
        this.readAt = readAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

}
