
package app.orbitahealth.sdk.responsemodel.orbitabuttonevents;


public class OrbitaEvents {

    private PressedOnce pressedOnce;
    private PressedTwice pressedTwice;
    private PressedHold pressedHold;

    /**
     * 
     * @return
     *     The pressedOnce
     */
    public PressedOnce getPressedOnce() {
        return pressedOnce;
    }

    /**
     * 
     * @param pressedOnce
     *     The pressedOnce
     */
    public void setPressedOnce(PressedOnce pressedOnce) {
        this.pressedOnce = pressedOnce;
    }

    /**
     * 
     * @return
     *     The pressedTwice
     */
    public PressedTwice getPressedTwice() {
        return pressedTwice;
    }

    /**
     * 
     * @param pressedTwice
     *     The pressedTwice
     */
    public void setPressedTwice(PressedTwice pressedTwice) {
        this.pressedTwice = pressedTwice;
    }

    /**
     * 
     * @return
     *     The pressedHold
     */
    public PressedHold getPressedHold() {
        return pressedHold;
    }

    /**
     * 
     * @param pressedHold
     *     The pressedHold
     */
    public void setPressedHold(PressedHold pressedHold) {
        this.pressedHold = pressedHold;
    }

}
