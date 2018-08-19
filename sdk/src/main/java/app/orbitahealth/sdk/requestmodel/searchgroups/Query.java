package app.orbitahealth.sdk.requestmodel.searchgroups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Query {

    @SerializedName("member")
    @Expose
    private Member member;
    @SerializedName("privacySetting")
    @Expose
    private String privacySetting;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getPrivacySetting() {
        return privacySetting;
    }

    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

}
