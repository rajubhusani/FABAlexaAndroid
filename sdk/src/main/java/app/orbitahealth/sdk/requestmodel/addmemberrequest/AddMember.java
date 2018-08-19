
package app.orbitahealth.sdk.requestmodel.addmemberrequest;

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
public class AddMember {

    @JsonProperty("member")
    private List<Member> member = new ArrayList<Member>();
    /*@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();*/

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

   /* @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/

    public void addMember(Member memberObj) {
        if (member==null) {
            member = new ArrayList<>();
        }
        if (memberObj==null) {
            return;
        }
        member.add(memberObj);
    }

}
