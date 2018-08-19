package app.orbitahealth.sdk.responsemodel.searchgroups;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Group {

    @SerializedName("_id")
    @Expose
    private String uId;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("createdUser")
    @Expose
    private String createdUser;
    @SerializedName("member")
    @Expose
    private List<Member> member = null;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("isDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("privacySetting")
    @Expose
    private String privacySetting;
    @SerializedName("memberCount")
    @Expose
    private Integer memberCount;
    @SerializedName("id")
    @Expose
    private String id;
    
    public String getUId() {
        return uId;
    }

    public void setUId(String id) {
        this.uId = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getPrivacySetting() {
        return privacySetting;
    }

    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
