
package app.orbitahealth.sdk.responsemodel.devicestatusresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ihealth {

    @SerializedName("access")
    @Expose
    private Access access;
    @SerializedName("userId")
    @Expose
    private String userId;

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
