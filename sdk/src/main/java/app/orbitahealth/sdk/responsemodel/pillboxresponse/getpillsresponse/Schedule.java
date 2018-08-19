
package app.orbitahealth.sdk.responsemodel.pillboxresponse.getpillsresponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "slotType",
    "_id",
    "pill",
    "interval"
})
public class Schedule implements Serializable,Parcelable {

    @JsonProperty("slotType")
    private String slotType;
    @JsonProperty("_id")
    private String _id;
    @JsonProperty("pill")
    private List<Pill> pill = new ArrayList<Pill>();
    @JsonProperty("interval")
    private Interval interval;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Schedule(Parcel in) {
        slotType = in.readString();
        _id = in.readString();
        pill = in.createTypedArrayList(Pill.CREATOR);
    }

    public static final Creator<Schedule> CREATOR = new Creator<Schedule>() {
        @Override
        public Schedule createFromParcel(Parcel in) {
            return new Schedule(in);
        }

        @Override
        public Schedule[] newArray(int size) {
            return new Schedule[size];
        }
    };

    public Schedule() {

    }

    /**
     * 
     * @return
     *     The slotType
     */
    @JsonProperty("slotType")
    public String getSlotType() {
        return slotType;
    }

    /**
     * 
     * @param slotType
     *     The slotType
     */
    @JsonProperty("slotType")
    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }

    /**
     * 
     * @return
     *     The _id
     */
    @JsonProperty("_id")
    public String getId() {
        return _id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String id) {
        this._id = id;
    }

    /**
     * 
     * @return
     *     The pill
     */
    @JsonProperty("pill")
    public List<Pill> getPill() {
        return pill;
    }

    /**
     * 
     * @param pill
     *     The pill
     */
    @JsonProperty("pill")
    public void setPill(List<Pill> pill) {
        this.pill = pill;
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
        dest.writeString(slotType);
        dest.writeString(_id);
        dest.writeTypedList(pill);
    }
}
