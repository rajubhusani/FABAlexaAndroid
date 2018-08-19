
package app.orbitahealth.sdk.responsemodel;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Users {

    @SerializedName("_id")
    @Expose
    private String memberId;
    @SerializedName("member")
    @Expose
    private List<Member> member = new ArrayList<Member>();
    @SerializedName("memberCount")
    @Expose
    private long memberCount;
    @SerializedName("id")
    @Expose
    private String id;

    /**
     * 
     * @return
     *     The memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    public void setMemberId(String Id) {
        this.memberId = Id;
    }

    /**
     * 
     * @return
     *     The member
     */
    public List<Member> getMember() {
        return member;
    }

    /**
     * 
     * @param member
     *     The member
     */
    public void setMember(List<Member> member) {
        this.member = member;
    }

    /**
     * 
     * @return
     *     The memberCount
     */
    public long getMemberCount() {
        return memberCount;
    }

    /**
     * 
     * @param memberCount
     *     The memberCount
     */
    public void setMemberCount(long memberCount) {
        this.memberCount = memberCount;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

}
