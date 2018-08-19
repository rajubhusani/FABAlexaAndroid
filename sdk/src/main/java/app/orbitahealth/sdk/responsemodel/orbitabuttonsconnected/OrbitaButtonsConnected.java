
package app.orbitahealth.sdk.responsemodel.orbitabuttonsconnected;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "orbitaButtons",
    "paging"
})
public class OrbitaButtonsConnected {

    @JsonProperty("orbitaButtons")
    private List<OrbitaButton> orbitaButtons = new ArrayList<OrbitaButton>();
    @JsonProperty("paging")
    private Paging paging;

    /**
     * 
     * @return
     *     The orbitaButtons
     */
    @JsonProperty("orbitaButtons")
    public List<OrbitaButton> getOrbitaButtons() {
        return orbitaButtons;
    }

    /**
     * 
     * @param orbitaButtons
     *     The orbitaButtons
     */
    @JsonProperty("orbitaButtons")
    public void setOrbitaButtons(List<OrbitaButton> orbitaButtons) {
        this.orbitaButtons = orbitaButtons;
    }

    /**
     * 
     * @return
     *     The paging
     */
    @JsonProperty("paging")
    public Paging getPaging() {
        return paging;
    }

    /**
     * 
     * @param paging
     *     The paging
     */
    @JsonProperty("paging")
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}
