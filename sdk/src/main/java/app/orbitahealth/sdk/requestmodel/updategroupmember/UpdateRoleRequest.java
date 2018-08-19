package app.orbitahealth.sdk.requestmodel.updategroupmember;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateRoleRequest {

    @SerializedName("member")
    @Expose
    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

}
