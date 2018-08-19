
package app.orbitahealth.sdk.responsemodel.getuserprofile;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import app.orbitahealth.sdk.DeviceToken;
import app.orbitahealth.sdk.responsemodel.devicestatusresponse.Attributes;
import app.orbitahealth.sdk.responsemodel.personastyperesponse.PersonaType;

public class GetUserResponse {

    @SerializedName("following")
    @Expose
    private Boolean following;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("personaType")
    @Expose
    private PersonaType personaType;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("tokenExpires")
    @Expose
    private String tokenExpires;
    @SerializedName("loginAttempts")
    @Expose
    private Integer loginAttempts;
    @SerializedName("personaProfile")
    @Expose
    private Map<String, Object> personaProfile;
    @SerializedName("dateOfBirth")
    @Expose
    private Object dateOfBirth;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("deviceTokens")
    @Expose
    private List<DeviceToken> deviceTokens = null;
    @SerializedName("apiKey")
    @Expose
    private String apiKey;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("suspended")
    @Expose
    private Boolean suspended;
    @SerializedName("roles")
    @Expose
    private List<Object> roles = null;
    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("avatarSrc")
    @Expose
    private String avatarSrc;
    @SerializedName("indexName")
    @Expose
    private String indexName;

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public PersonaType getPersonaType() {
        return personaType;
    }

    public void setPersonaType(PersonaType personaType) {
        this.personaType = personaType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getTokenExpires() {
        return tokenExpires;
    }

    public void setTokenExpires(String tokenExpires) {
        this.tokenExpires = tokenExpires;
    }

    public Integer getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(Integer loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public Map<String, Object> getPersonaProfile() {
        return personaProfile;
    }

    public void setPersonaProfile(Map<String, Object> personaProfile) {
        this.personaProfile = personaProfile;
    }

    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<DeviceToken> getDeviceTokens() {
        return deviceTokens;
    }

    public void setDeviceTokens(List<DeviceToken> deviceTokens) {
        this.deviceTokens = deviceTokens;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public List<Object> getRoles() {
        return roles;
    }

    public void setRoles(List<Object> roles) {
        this.roles = roles;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getAvatarSrc() {
        return avatarSrc;
    }

    public void setAvatarSrc(String avatarSrc) {
        this.avatarSrc = avatarSrc;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

}
