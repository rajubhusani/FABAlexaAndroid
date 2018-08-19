package app.orbitahealth.sdk;

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
        "__v",
        "displayName",
        "modifiedAt",
        "createdAt",
        "name",
        "createdUser",
        "_id",
        "isDeleted",
        "member",
        "owner",
        "requestNotification",
        "postApproval",
        "postingPermission",
        "memberApproval",
        "privacySetting",
        "tags",
        "memberCount",
        "id"
})
public class CreateCareCircleResponse {

    @JsonProperty("__v")
    private Integer V;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("modifiedAt")
    private String modifiedAt;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("name")
    private String name;
    @JsonProperty("createdUser")
    private String createdUser;
    @JsonProperty("_id")
    private String Id;
    @JsonProperty("isDeleted")
    private Boolean isDeleted;
    @JsonProperty("member")
    private List<Member> member = new ArrayList<Member>();
    @JsonProperty("owner")
    private List<String> owner = new ArrayList<String>();
    @JsonProperty("requestNotification")
    private List<Object> requestNotification = new ArrayList<Object>();
    @JsonProperty("postApproval")
    private String postApproval;
    @JsonProperty("postingPermission")
    private String postingPermission;
    @JsonProperty("memberApproval")
    private String memberApproval;
    @JsonProperty("privacySetting")
    private String privacySetting;
    @JsonProperty("tags")
    private List<Object> tags = new ArrayList<Object>();
    @JsonProperty("memberCount")
    private Integer memberCount;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The V
     */
    @JsonProperty("__v")
    public Integer getV() {
        return V;
    }

    /**
     *
     * @param V
     * The __v
     */
    @JsonProperty("__v")
    public void setV(Integer V) {
        this.V = V;
    }

    /**
     *
     * @return
     * The displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     *
     * @param displayName
     * The displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     *
     * @return
     * The modifiedAt
     */
    @JsonProperty("modifiedAt")
    public String getModifiedAt() {
        return modifiedAt;
    }

    /**
     *
     * @param modifiedAt
     * The modifiedAt
     */
    @JsonProperty("modifiedAt")
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     *
     * @return
     * The createdAt
     */
    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The createdUser
     */
    @JsonProperty("createdUser")
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     *
     * @param createdUser
     * The createdUser
     */
    @JsonProperty("createdUser")
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }


    /**
     *
     * @param Id
     * The _id
     */
    @JsonProperty("_id")
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     * The isDeleted
     */
    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     *
     * @param isDeleted
     * The isDeleted
     */
    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     *
     * @return
     * The member
     */
    @JsonProperty("member")
    public List<Member> getMember() {
        return member;
    }

    /**
     *
     * @param member
     * The member
     */
    @JsonProperty("member")
    public void setMember(List<Member> member) {
        this.member = member;
    }

    /**
     *
     * @return
     * The owner
     */
    @JsonProperty("owner")
    public List<String> getOwner() {
        return owner;
    }

    /**
     *
     * @param owner
     * The owner
     */
    @JsonProperty("owner")
    public void setOwner(List<String> owner) {
        this.owner = owner;
    }

    /**
     *
     * @return
     * The requestNotification
     */
    @JsonProperty("requestNotification")
    public List<Object> getRequestNotification() {
        return requestNotification;
    }

    /**
     *
     * @param requestNotification
     * The requestNotification
     */
    @JsonProperty("requestNotification")
    public void setRequestNotification(List<Object> requestNotification) {
        this.requestNotification = requestNotification;
    }

    /**
     *
     * @return
     * The postApproval
     */
    @JsonProperty("postApproval")
    public String getPostApproval() {
        return postApproval;
    }

    /**
     *
     * @param postApproval
     * The postApproval
     */
    @JsonProperty("postApproval")
    public void setPostApproval(String postApproval) {
        this.postApproval = postApproval;
    }

    /**
     *
     * @return
     * The postingPermission
     */
    @JsonProperty("postingPermission")
    public String getPostingPermission() {
        return postingPermission;
    }

    /**
     *
     * @param postingPermission
     * The postingPermission
     */
    @JsonProperty("postingPermission")
    public void setPostingPermission(String postingPermission) {
        this.postingPermission = postingPermission;
    }

    /**
     *
     * @return
     * The memberApproval
     */
    @JsonProperty("memberApproval")
    public String getMemberApproval() {
        return memberApproval;
    }

    /**
     *
     * @param memberApproval
     * The memberApproval
     */
    @JsonProperty("memberApproval")
    public void setMemberApproval(String memberApproval) {
        this.memberApproval = memberApproval;
    }

    /**
     *
     * @return
     * The privacySetting
     */
    @JsonProperty("privacySetting")
    public String getPrivacySetting() {
        return privacySetting;
    }

    /**
     *
     * @param privacySetting
     * The privacySetting
     */
    @JsonProperty("privacySetting")
    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    /**
     *
     * @return
     * The tags
     */
    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     * The memberCount
     */
    @JsonProperty("memberCount")
    public Integer getMemberCount() {
        return memberCount;
    }

    /**
     *
     * @param memberCount
     * The memberCount
     */
    @JsonProperty("memberCount")
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)

    @JsonPropertyOrder({
            "user",
            "type",
            "status"
    })

    public class Member {

        @JsonProperty("user")
        private String user;
        @JsonProperty("type")
        private String type;
        @JsonProperty("status")
        private String status;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The user
         */
        @JsonProperty("user")
        public String getUser() {
            return user;
        }

        /**
         *
         * @param user
         * The user
         */
        @JsonProperty("user")
        public void setUser(String user) {
            this.user = user;
        }

        /**
         *
         * @return
         * The type
         */
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         *
         * @param type
         * The type
         */
        @JsonProperty("type")
        public void setType(String type) {
            this.type = type;
        }

        /**
         *
         * @return
         * The status
         */
        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        /**
         *
         * @param status
         * The status
         */
        @JsonProperty("status")
        public void setStatus(String status) {
            this.status = status;
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

}

