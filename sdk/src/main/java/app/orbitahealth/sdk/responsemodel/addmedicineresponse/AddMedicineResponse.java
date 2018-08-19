
package app.orbitahealth.sdk.responsemodel.addmedicineresponse;

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
    "__v",
    "modifiedAt",
    "createdAt",
    "createdBy",
    "patientId",
    "_id",
    "isDeleted",
    "avatar",
    "refill",
    "instructions",
    "descriptions",
    "information",
    "name"
})
public class AddMedicineResponse {

    @JsonProperty("__v")
    private Integer V;
    @JsonProperty("modifiedAt")
    private String modifiedAt;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("patientId")
    private String patientId;
    @JsonProperty("_id")
    private String _id;
    @JsonProperty("isDeleted")
    private Boolean isDeleted;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("refill")
    private Refill refill;
    @JsonProperty("instructions")
    private String instructions;
    @JsonProperty("descriptions")
    private String descriptions;
    @JsonProperty("information")
    private String information;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The V
     */
    @JsonProperty("__v")
    public Integer getV() {
        return V;
    }

    /**
     * 
     * @param V
     *     The __v
     */
    @JsonProperty("__v")
    public void setV(Integer V) {
        this.V = V;
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
     *     The patientId
     */
    @JsonProperty("patientId")
    public String getPatientId() {
        return patientId;
    }

    /**
     * 
     * @param patientId
     *     The patientId
     */
    @JsonProperty("patientId")
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

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
     *     The avatar
     */
    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    /**
     * 
     * @param avatar
     *     The avatar
     */
    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 
     * @return
     *     The refill
     */
    @JsonProperty("refill")
    public Refill getRefill() {
        return refill;
    }

    /**
     * 
     * @param refill
     *     The refill
     */
    @JsonProperty("refill")
    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    /**
     * 
     * @return
     *     The instructions
     */
    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    /**
     * 
     * @param instructions
     *     The instructions
     */
    @JsonProperty("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * 
     * @return
     *     The descriptions
     */
    @JsonProperty("descriptions")
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * 
     * @param descriptions
     *     The descriptions
     */
    @JsonProperty("descriptions")
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * 
     * @return
     *     The information
     */
    @JsonProperty("information")
    public String getInformation() {
        return information;
    }

    /**
     * 
     * @param information
     *     The information
     */
    @JsonProperty("information")
    public void setInformation(String information) {
        this.information = information;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
