
package app.orbitahealth.sdk.responsemodel.orbitabuttonevents;


public class PressedTwice {

    private String name;
    private String uriPath;
    private String uriVerb;
    private PayLoad_ payLoad;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The uriPath
     */
    public String getUriPath() {
        return uriPath;
    }

    /**
     * 
     * @param uriPath
     *     The uriPath
     */
    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    /**
     * 
     * @return
     *     The uriVerb
     */
    public String getUriVerb() {
        return uriVerb;
    }

    /**
     * 
     * @param uriVerb
     *     The uriVerb
     */
    public void setUriVerb(String uriVerb) {
        this.uriVerb = uriVerb;
    }

    /**
     * 
     * @return
     *     The payLoad
     */
    public PayLoad_ getPayLoad() {
        return payLoad;
    }

    /**
     * 
     * @param payLoad
     *     The payLoad
     */
    public void setPayLoad(PayLoad_ payLoad) {
        this.payLoad = payLoad;
    }

}
