
package app.orbitahealth.sdk.responsemodel.getmedicineresponse;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "interval",
    "reminder",
    "occurenceType"
})
public class Refill implements Serializable {

    @JsonProperty("interval")
    private Object interval;
    @JsonProperty("reminder")
    private Reminder reminder;
    @JsonProperty("occurenceType")
    private String occurenceType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The interval
     */
    @JsonProperty("interval")
    public Object getInterval() {
        return interval;
    }

    /**
     * 
     * @param interval
     *     The interval
     */
    @JsonProperty("interval")
    public void setInterval(Object interval) {
        this.interval = interval;
    }

    /**
     * 
     * @return
     *     The reminder
     */
    @JsonProperty("reminder")
    public Reminder getReminder() {
        return reminder;
    }

    /**
     * 
     * @param reminder
     *     The reminder
     */
    @JsonProperty("reminder")
    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

    /**
     * 
     * @return
     *     The occurenceType
     */
    @JsonProperty("occurenceType")
    public String getOccurenceType() {
        return occurenceType;
    }

    /**
     * 
     * @param occurenceType
     *     The occurenceType
     */
    @JsonProperty("occurenceType")
    public void setOccurenceType(String occurenceType) {
        this.occurenceType = occurenceType;
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
