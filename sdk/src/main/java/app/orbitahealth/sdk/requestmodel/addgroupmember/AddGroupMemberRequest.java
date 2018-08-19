package app.orbitahealth.sdk.requestmodel.addgroupmember;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class AddGroupMemberRequest {

    @SerializedName("member")
    @Expose
    private List<Map<String, String>> member = null;

    public List<Map<String, String>> getMember() {
        return member;
    }

    public void setMember(List<Map<String, String>> member) {
        this.member = member;
    }

}
