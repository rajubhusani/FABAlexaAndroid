
package app.orbitahealth.sdk.responsemodel.carecircleinvitedetails;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "displayName",
    "modifiedAt",
    "createdAt",
    "name",
    "createdUser",
    "__v",
    "isDeleted",
    "privacySetting",
    "memberCount"
})
public class CareCircleInviteDetails {

    @JsonProperty("_id")
    private String id;
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
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("isDeleted")
    private Boolean isDeleted;
    @JsonProperty("privacySetting")
    private String privacySetting;
    @JsonProperty("memberCount")
    private Integer memberCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The modifiedAt
     */
    @JsonProperty("modifiedAt")
    public String getModifiedAt() {
        return modifiedAt;
    }

    /**
     * 
     * @param modifiedAt
     *     The modifiedAt
     */
    @JsonProperty("modifiedAt")
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The createdUser
     */
    @JsonProperty("createdUser")
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 
     * @param createdUser
     *     The createdUser
     */
    @JsonProperty("createdUser")
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 
     * @return
     *     The v
     */
    @JsonProperty("__v")
    public Integer getV() {
        return v;
    }

    /**
     * 
     * @param v
     *     The __v
     */
    @JsonProperty("__v")
    public void setV(Integer v) {
        this.v = v;
    }

    /**
     * 
     * @return
     *     The isDeleted
     */
    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 
     * @param isDeleted
     *     The isDeleted
     */
    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 
     * @return
     *     The privacySetting
     */
    @JsonProperty("privacySetting")
    public String getPrivacySetting() {
        return privacySetting;
    }

    /**
     * 
     * @param privacySetting
     *     The privacySetting
     */
    @JsonProperty("privacySetting")
    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    /**
     * 
     * @return
     *     The memberCount
     */
    @JsonProperty("memberCount")
    public Integer getMemberCount() {
        return memberCount;
    }

    /**
     * 
     * @param memberCount
     *     The memberCount
     */
    @JsonProperty("memberCount")
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
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
