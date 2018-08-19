
package app.orbitahealth.sdk.requestmodel.assignpatient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import app.orbitahealth.sdk.MemberType;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "member"
})
public class AssignPatientModel {

    @JsonProperty("member")
    private ArrayList<Member> member;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The member
     */
    @JsonProperty("member")
    public List<Member> getMember() {
        return member;
    }

    /**
     * 
     * @param member
     *     The member
     */
    @JsonProperty("member")
    public void setMember(ArrayList<Member> member) {
        this.member = member;
    }
    public void addMember(Member memberType) {
        if (null == member) {
            member = new ArrayList<>();
        }
        if (null == memberType)
            return;
        member.add(memberType);
    }

    public void deleteMember(Member memberType) {
        if (null == member || memberType == null || !member.contains(member)) {
            return;
        }
        member.remove(memberType);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
