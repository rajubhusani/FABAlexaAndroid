package app.orbitahealth.sdk.responsemodel.carecirclemembersearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Member extends app.orbitahealth.sdk.responsemodel.Member{

    @SerializedName("status")
    @Expose
    private String status;

    /**
     *
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
