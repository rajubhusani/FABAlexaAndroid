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
        "_id",
        "roles",
        "firstName",
        "lastName",
        "avatarSrc",
        "attributes",
        "token",
        "personaType",
        "personaProfile",
        "iat",
        "exp"
})
public class LoginTokenResponse {

    @JsonProperty("_id")
    private String Id;
    @JsonProperty("roles")
    private List<Object> roles = new ArrayList<Object>();
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("avatarSrc")
    private String avatarSrc;
    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonProperty("token")
    private String token;
    @JsonProperty("personaType")
    private String personaType;
    @JsonProperty("personaProfile")
    private Map<String, Object> personaProfile;
    @JsonProperty("iat")
    private Integer iat;
    @JsonProperty("exp")
    private Integer exp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Id
     */
    @JsonProperty("_id")
    public String getId() {
        return Id;
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
     * The roles
     */
    @JsonProperty("roles")
    public List<Object> getRoles() {
        return roles;
    }

    /**
     *
     * @param roles
     * The roles
     */
    @JsonProperty("roles")
    public void setRoles(List<Object> roles) {
        this.roles = roles;
    }

    /**
     *
     * @return
     * The firstName
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * The firstName
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     * The lastName
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     * The lastName
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     * The avatarSrc
     */
    @JsonProperty("avatarSrc")
    public String getAvatarSrc() {
        return avatarSrc;
    }

    /**
     *
     * @param avatarSrc
     * The avatarSrc
     */
    @JsonProperty("avatarSrc")
    public void setAvatarSrc(String avatarSrc) {
        this.avatarSrc = avatarSrc;
    }

    /**
     *
     * @return
     * The attributes
     */
    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     *
     * @param attributes
     * The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     *
     * @return
     * The token
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     *
     * @param token
     * The token
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     *
     * @return
     * The personaType
     */
    @JsonProperty("personaType")
    public String getPersonaType() {
        return personaType;
    }

    /**
     *
     * @param personaType
     * The personaType
     */
    @JsonProperty("personaType")
    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    /**
     *
     * @return
     * The personaProfile
     */
    @JsonProperty("personaProfile")
    public Map<String, Object> getPersonaProfile() {
        return personaProfile;
    }

    /**
     *
     * @param personaProfile
     * The personaProfile
     */
    @JsonProperty("personaProfile")
    public void setPersonaProfile(Map<String, Object> personaProfile) {
        this.personaProfile = personaProfile;
    }


    /**
     *
     * @return
     * The iat
     */
    @JsonProperty("iat")
    public Integer getIat() {
        return iat;
    }

    /**
     *
     * @param iat
     * The iat
     */
    @JsonProperty("iat")
    public void setIat(Integer iat) {
        this.iat = iat;
    }

    /**
     *
     * @return
     * The exp
     */
    @JsonProperty("exp")
    public Integer getExp() {
        return exp;
    }

    /**
     *
     * @param exp
     * The exp
     */
    @JsonProperty("exp")
    public void setExp(Integer exp) {
        this.exp = exp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    private static class Attributes {

        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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


