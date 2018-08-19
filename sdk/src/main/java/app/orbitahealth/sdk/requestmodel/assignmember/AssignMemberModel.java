
package app.orbitahealth.sdk.requestmodel.assignmember;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "member"
})
public class AssignMemberModel {
    @JsonProperty("member")
    private List<Member> member = new ArrayList<Member>();
    //@JsonIgnore
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public void setMember(List<Member> member) {
        this.member = member;
    }

    public void addMember(Member memberType) {
        if (null == member) {
            member = new ArrayList<>();
        }
        if (null == memberType)
            return;
        try {
            member.add(memberType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*@JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/

}
