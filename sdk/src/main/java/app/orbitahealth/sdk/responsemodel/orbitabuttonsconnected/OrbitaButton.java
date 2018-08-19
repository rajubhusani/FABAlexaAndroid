
package app.orbitahealth.sdk.responsemodel.orbitabuttonsconnected;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "modifiedAt",
    "createdAt",
    "buttonId",
    "buttonName",
    "user",
    "createdBy",
    "__v",
    "orbitaEvents"
})
public class OrbitaButton {

    @JsonProperty("_id")
    private String _id;
    @JsonProperty("modifiedAt")
    private String modifiedAt;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("buttonId")
    private String buttonId;
    @JsonProperty("buttonName")
    private String buttonName;
    @JsonProperty("user")
    private String user;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("orbitaEvents")
    private OrbitaEvents orbitaEvents;

    /**
     * 
     * @return
     *     The _id
     */
    @JsonProperty("_id")
    public String getId() {
        return _id;
    }

    /**
     * 
     * @param _id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String _id) {
        this._id = _id;
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
     *     The buttonId
     */
    @JsonProperty("buttonId")
    public String getButtonId() {
        return buttonId;
    }

    /**
     * 
     * @param buttonId
     *     The buttonId
     */
    @JsonProperty("buttonId")
    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }

    /**
     * 
     * @return
     *     The buttonName
     */
    @JsonProperty("buttonName")
    public String getButtonName() {
        return buttonName;
    }

    /**
     * 
     * @param buttonName
     *     The buttonName
     */
    @JsonProperty("buttonName")
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The createdBy
     */
    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
     *     The orbitaEvents
     */
    @JsonProperty("orbitaEvents")
    public OrbitaEvents getOrbitaEvents() {
        return orbitaEvents;
    }

    /**
     * 
     * @param orbitaEvents
     *     The orbitaEvents
     */
    @JsonProperty("orbitaEvents")
    public void setOrbitaEvents(OrbitaEvents orbitaEvents) {
        this.orbitaEvents = orbitaEvents;
    }

}
