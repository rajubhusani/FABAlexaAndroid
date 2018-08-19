
package app.orbitahealth.sdk.responsemodel.orbitabuttonsconnected;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pressedOnce",
    "pressedTwice",
    "pressedHold"
})
public class OrbitaEvents {

    @JsonProperty("pressedOnce")
    private PressedOnce pressedOnce;
    @JsonProperty("pressedTwice")
    private PressedTwice pressedTwice;
    @JsonProperty("pressedHold")
    private PressedHold pressedHold;

    /**
     * 
     * @return
     *     The pressedOnce
     */
    @JsonProperty("pressedOnce")
    public PressedOnce getPressedOnce() {
        return pressedOnce;
    }

    /**
     * 
     * @param pressedOnce
     *     The pressedOnce
     */
    @JsonProperty("pressedOnce")
    public void setPressedOnce(PressedOnce pressedOnce) {
        this.pressedOnce = pressedOnce;
    }

    /**
     * 
     * @return
     *     The pressedTwice
     */
    @JsonProperty("pressedTwice")
    public PressedTwice getPressedTwice() {
        return pressedTwice;
    }

    /**
     * 
     * @param pressedTwice
     *     The pressedTwice
     */
    @JsonProperty("pressedTwice")
    public void setPressedTwice(PressedTwice pressedTwice) {
        this.pressedTwice = pressedTwice;
    }

    /**
     * 
     * @return
     *     The pressedHold
     */
    @JsonProperty("pressedHold")
    public PressedHold getPressedHold() {
        return pressedHold;
    }

    /**
     * 
     * @param pressedHold
     *     The pressedHold
     */
    @JsonProperty("pressedHold")
    public void setPressedHold(PressedHold pressedHold) {
        this.pressedHold = pressedHold;
    }

}
