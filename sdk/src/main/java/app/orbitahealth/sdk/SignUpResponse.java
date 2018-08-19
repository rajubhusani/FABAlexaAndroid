package app.orbitahealth.sdk;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SignUpResponse {





        @JsonProperty("tokenExpires")
        private String tokenExpires;
        @JsonProperty("__v")
        private Integer V;
        @JsonProperty("modifiedAt")
        private String modifiedAt;
        @JsonProperty("createdAt")
        private String createdAt;
        @JsonProperty("username")
        private String username;
        @JsonProperty("salt")
        private String salt;
        @JsonProperty("hashedPwd")
        private String hashedPwd;
        @JsonProperty("loginAttempts")
        private Integer loginAttempts;
        @JsonProperty("_id")
        private String Id;
        @JsonProperty("deviceTokens")
        private List<Object> deviceTokens = new ArrayList<Object>();
        @JsonProperty("apiKey")
        private String apiKey;
        @JsonProperty("token")
        private String token;
        @JsonProperty("provider")
        private String provider;
        @JsonProperty("suspended")
        private Boolean suspended;
        @JsonProperty("roles")
        private List<Object> roles = new ArrayList<Object>();
        @JsonProperty("avatarSrc")
        private String avatarSrc;
        @JsonProperty("indexName")
        private String indexName;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The tokenExpires
         */
        @JsonProperty("tokenExpires")
        public String getTokenExpires() {
            return tokenExpires;
        }

        /**
         *
         * @param tokenExpires
         * The tokenExpires
         */
        @JsonProperty("tokenExpires")
        public void setTokenExpires(String tokenExpires) {
            this.tokenExpires = tokenExpires;
        }

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
         * The username
         */
        @JsonProperty("username")
        public String getUsername() {
            return username;
        }

        /**
         *
         * @param username
         * The username
         */
        @JsonProperty("username")
        public void setUsername(String username) {
            this.username = username;
        }

        /**
         *
         * @return
         * The salt
         */
        @JsonProperty("salt")
        public String getSalt() {
            return salt;
        }

        /**
         *
         * @param salt
         * The salt
         */
        @JsonProperty("salt")
        public void setSalt(String salt) {
            this.salt = salt;
        }

        /**
         *
         * @return
         * The hashedPwd
         */
        @JsonProperty("hashedPwd")
        public String getHashedPwd() {
            return hashedPwd;
        }

        /**
         *
         * @param hashedPwd
         * The hashedPwd
         */
        @JsonProperty("hashedPwd")
        public void setHashedPwd(String hashedPwd) {
            this.hashedPwd = hashedPwd;
        }

        /**
         *
         * @return
         * The loginAttempts
         */
        @JsonProperty("loginAttempts")
        public Integer getLoginAttempts() {
            return loginAttempts;
        }

        /**
         *
         * @param loginAttempts
         * The loginAttempts
         */
        @JsonProperty("loginAttempts")
        public void setLoginAttempts(Integer loginAttempts) {
            this.loginAttempts = loginAttempts;
        }

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
         * The deviceTokens
         */
        @JsonProperty("deviceTokens")
        public List<Object> getDeviceTokens() {
            return deviceTokens;
        }

        /**
         *
         * @param deviceTokens
         * The deviceTokens
         */
        @JsonProperty("deviceTokens")
        public void setDeviceTokens(List<Object> deviceTokens) {
            this.deviceTokens = deviceTokens;
        }

        /**
         *
         * @return
         * The apiKey
         */
        @JsonProperty("apiKey")
        public String getApiKey() {
            return apiKey;
        }

        /**
         *
         * @param apiKey
         * The apiKey
         */
        @JsonProperty("apiKey")
        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
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
         * The provider
         */
        @JsonProperty("provider")
        public String getProvider() {
            return provider;
        }

        /**
         *
         * @param provider
         * The provider
         */
        @JsonProperty("provider")
        public void setProvider(String provider) {
            this.provider = provider;
        }

        /**
         *
         * @return
         * The suspended
         */
        @JsonProperty("suspended")
        public Boolean getSuspended() {
            return suspended;
        }

        /**
         *
         * @param suspended
         * The suspended
         */
        @JsonProperty("suspended")
        public void setSuspended(Boolean suspended) {
            this.suspended = suspended;
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
         * The indexName
         */
        @JsonProperty("indexName")
        public String getIndexName() {
            return indexName;
        }

        /**
         *
         * @param indexName
         * The indexName
         */
        @JsonProperty("indexName")
        public void setIndexName(String indexName) {
            this.indexName = indexName;
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
