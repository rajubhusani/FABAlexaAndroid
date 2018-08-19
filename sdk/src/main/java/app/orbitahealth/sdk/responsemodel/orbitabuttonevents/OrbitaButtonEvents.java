
package app.orbitahealth.sdk.responsemodel.orbitabuttonevents;

public class OrbitaButtonEvents {

    private String id;
    private String modifiedAt;
    private String createdAt;
    private String buttonId;
    private String buttonName;
    private String user;
    private String createdBy;
    private Integer v;
    private OrbitaEvents orbitaEvents;

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
     *     The _id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The modifiedAt
     */
    public String getModifiedAt() {
        return modifiedAt;
    }

    /**
     * 
     * @param modifiedAt
     *     The modifiedAt
     */
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The buttonId
     */
    public String getButtonId() {
        return buttonId;
    }

    /**
     * 
     * @param buttonId
     *     The buttonId
     */
    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }

    /**
     * 
     * @return
     *     The buttonName
     */
    public String getButtonName() {
        return buttonName;
    }

    /**
     * 
     * @param buttonName
     *     The buttonName
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    /**
     * 
     * @return
     *     The user
     */
    public String getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 
     * @return
     *     The v
     */
    public Integer getV() {
        return v;
    }

    /**
     * 
     * @param v
     *     The __v
     */
    public void setV(Integer v) {
        this.v = v;
    }

    /**
     * 
     * @return
     *     The orbitaEvents
     */
    public OrbitaEvents getOrbitaEvents() {
        return orbitaEvents;
    }

    /**
     * 
     * @param orbitaEvents
     *     The orbitaEvents
     */
    public void setOrbitaEvents(OrbitaEvents orbitaEvents) {
        this.orbitaEvents = orbitaEvents;
    }

}
