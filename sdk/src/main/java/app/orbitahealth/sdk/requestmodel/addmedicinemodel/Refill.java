
package app.orbitahealth.sdk.requestmodel.addmedicinemodel;

import android.os.Parcel;
import android.os.Parcelable;

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
    "occurenceType",
    "reminder",
    "interval"
})
public class Refill implements Serializable,Parcelable {

    @JsonProperty("occurenceType")
    private String occurenceType;
    @JsonProperty("reminder")
    private Reminder reminder;
    @JsonProperty("interval")
    private Interval interval;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Refill() {
    }

    protected Refill(Parcel in) {
        occurenceType = in.readString();
        reminder = in.readParcelable(Reminder.class.getClassLoader());
    }

    public static final Creator<Refill> CREATOR = new Creator<Refill>() {
        @Override
        public Refill createFromParcel(Parcel in) {
            return new Refill(in);
        }

        @Override
        public Refill[] newArray(int size) {
            return new Refill[size];
        }
    };

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
     *     The interval
     */
    @JsonProperty("interval")
    public Interval getInterval() {
        return interval;
    }

    /**
     * 
     * @param interval
     *     The interval
     */
    @JsonProperty("interval")
    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(occurenceType);
        dest.writeParcelable(reminder, flags);
    }
}
