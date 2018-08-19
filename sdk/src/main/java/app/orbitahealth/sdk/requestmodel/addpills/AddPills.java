
package app.orbitahealth.sdk.requestmodel.addpills;

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
    "action",
    "slotid",
    "pill"
})
public class AddPills {

    @JsonProperty("action")
    private String action;
    @JsonProperty("slotid")
    private String slotid;
    @JsonProperty("pill")
    private Pill pill;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * 
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 
     * @return
     *     The slotid
     */
    @JsonProperty("slotid")
    public String getSlotid() {
        return slotid;
    }

    /**
     * 
     * @param slotid
     *     The slotid
     */
    @JsonProperty("slotid")
    public void setSlotid(String slotid) {
        this.slotid = slotid;
    }

    /**
     * 
     * @return
     *     The pill
     */
    @JsonProperty("pill")
    public Pill getPill() {
        return pill;
    }

    /**
     * 
     * @param pill
     *     The pill
     */
    @JsonProperty("pill")
    public void setPill(Pill pill) {
        this.pill = pill;
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
