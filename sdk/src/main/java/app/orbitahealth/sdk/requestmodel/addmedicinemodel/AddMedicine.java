
package app.orbitahealth.sdk.requestmodel.addmedicinemodel;

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
    "name",
    "information",
    "descriptions",
    "instructions",
    "refill"
})
public class AddMedicine {

    @JsonProperty("name")
    private String name;
    @JsonProperty("information")
    private String information;
    @JsonProperty("descriptions")
    private String descriptions;
    @JsonProperty("instructions")
    private String instructions;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("refill")
    private Refill refill;


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


    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
