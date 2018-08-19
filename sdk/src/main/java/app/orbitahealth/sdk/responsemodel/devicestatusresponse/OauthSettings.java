
package app.orbitahealth.sdk.responsemodel.devicestatusresponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class OauthSettings {

    @JsonProperty("ihealth")
    private Ihealth ihealth;
    @JsonProperty("fitbit")
    private Fitbit fitbit;
    @JsonProperty("Microsoft")
    private app.orbitahealth.sdk.responsemodel.devicestatusresponse.Microsoft Microsoft;
    @JsonProperty("withings")
    private Withing withing;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The ihealth
     */
    @JsonProperty("ihealth")
    public Ihealth getIhealth() {
        return ihealth;
    }

    /**
     *
     * @param ihealth
     *     The ihealth
     */
    @JsonProperty("ihealth")
    public void setIhealth(Ihealth ihealth) {
        this.ihealth = ihealth;
    }


    /**
     * 
     * @return
     *     The fitbit
     */
    @JsonProperty("fitbit")
    public Fitbit getFitbit() {
        return fitbit;
    }

    /**
     * 
     * @param fitbit
     *     The fitbit
     */
    @JsonProperty("fitbit")
    public void setFitbit(Fitbit fitbit) {
        this.fitbit = fitbit;
    }

    /**
     * 
     * @return
     *     The Microsoft
     */
    @JsonProperty("Microsoft")
    public app.orbitahealth.sdk.responsemodel.devicestatusresponse.Microsoft getMicrosoft() {
        return Microsoft;
    }

    /**
     * 
     * @param Microsoft
     *     The Microsoft
     */
    @JsonProperty("Microsoft")
    public void setMicrosoft(app.orbitahealth.sdk.responsemodel.devicestatusresponse.Microsoft Microsoft) {
        this.Microsoft = Microsoft;
    }

    /**
     * 
     * @return
     *     The withing
     */
    @JsonProperty("withings")
    public Withing getWithings() {
        return withing;
    }

    /**
     * 
     * @param withing
     *     The withing
     */
    @JsonProperty("withings")
    public void setWithings(Withing withing) {
        this.withing = withing;
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
