
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
    "_id",
    "patientId",
    "schedule",
    "medicine"
})
public class Result implements Serializable,Parcelable {

    @JsonProperty("_id")
    private String _id;
    @JsonProperty("patientId")
    private String patientId;
    @JsonProperty("schedule")
    private List<Schedule> schedule = new ArrayList<Schedule>();
    @JsonProperty("medicine")
    private List<String> medicine = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Result() {
    }

    protected Result(Parcel in) {
        _id = in.readString();
        patientId = in.readString();
        medicine = in.createStringArrayList();
    }

    public static final Creator<Result> CREATOR = new Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        @Override
        public Result[] newArray(int size) {
            return new Result[size];
        }
    };

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
     * @param _id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String _id) {
        this._id = _id;
    }

    /**
     * 
     * @return
     *     The patientId
     */
    @JsonProperty("patientId")
    public String getPatientId() {
        return patientId;
    }

    /**
     * 
     * @param patientId
     *     The patientId
     */
    @JsonProperty("patientId")
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * 
     * @return
     *     The schedule
     */
    @JsonProperty("schedule")
    public List<Schedule> getSchedule() {
        return schedule;
    }

    /**
     * 
     * @param schedule
     *     The schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    /**
     * 
     * @return
     *     The medicine
     */
    @JsonProperty("medicine")
    public List<String> getMedicine() {
        return medicine;
    }

    /**
     * 
     * @param medicine
     *     The medicine
     */
    @JsonProperty("medicine")
    public void setMedicine(List<String> medicine) {
        this.medicine = medicine;
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
        dest.writeString(_id);
        dest.writeString(patientId);
        dest.writeStringList(medicine);
    }
}
