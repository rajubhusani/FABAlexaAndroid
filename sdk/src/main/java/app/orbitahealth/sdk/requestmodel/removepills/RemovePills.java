
package app.orbitahealth.sdk.requestmodel.removepills;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "action",
    "slotid",
    "pillid"
})
public class RemovePills {

    @JsonProperty("action")
    private String action;
    @JsonProperty("slotid")
    private String slotid;
    @JsonProperty("pillid")
    private String pillid;


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
     *     The pillid
     */
    @JsonProperty("pillid")
    public String getPillid() {
        return pillid;
    }

    /**
     * 
     * @param pillid
     *     The pillid
     */
    @JsonProperty("pillid")
    public void setPillid(String pillid) {
        this.pillid = pillid;
    }



}
