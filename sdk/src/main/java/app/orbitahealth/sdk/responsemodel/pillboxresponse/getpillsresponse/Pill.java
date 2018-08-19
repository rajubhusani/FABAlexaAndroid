
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
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pillMedicine",
    "pillCount",
    "_id"
})
public class Pill implements Serializable,Parcelable {

    @JsonProperty("pillMedicine")
    private PillMedicine pillMedicine;
    @JsonProperty("pillCount")
    private Integer pillCount;
    @JsonProperty("_id")
    private String _id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Pill() {
    }

    protected Pill(Parcel in) {
        _id = in.readString();
        pillCount=in.readInt();
        pillMedicine=in.readParcelable(PillMedicine.class.getClassLoader());
    }

    public static final Creator<Pill> CREATOR = new Creator<Pill>() {
        @Override
        public Pill createFromParcel(Parcel in) {
            return new Pill(in);
        }

        @Override
        public Pill[] newArray(int size) {
            return new Pill[size];
        }
    };

    /**
     * 
     * @return
     *     The pillMedicine
     */
    @JsonProperty("pillMedicine")
    public PillMedicine getPillMedicine() {
        return pillMedicine;
    }

    /**
     * 
     * @param pillMedicine
     *     The pillMedicine
     */
    @JsonProperty("pillMedicine")
    public void setPillMedicine(PillMedicine pillMedicine) {
        this.pillMedicine = pillMedicine;
    }

    /**
     * 
     * @return
     *     The pillCount
     */
    @JsonProperty("pillCount")
    public Integer getPillCount() {
        return pillCount;
    }

    /**
     * 
     * @param pillCount
     *     The pillCount
     */
    @JsonProperty("pillCount")
    public void setPillCount(Integer pillCount) {
        this.pillCount = pillCount;
    }

    /**
     * 
     * @return
     *     The id
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
        dest.writeInt(pillCount);
        dest.writeParcelable(pillMedicine, flags);
    }
}
