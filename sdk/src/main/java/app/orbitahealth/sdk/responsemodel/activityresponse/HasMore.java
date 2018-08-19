
package app.orbitahealth.sdk.responsemodel.activityresponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hasPrevious",
    "hasNext"
})
public class HasMore implements Parcelable {

    @JsonProperty("hasPrevious")
    private Boolean hasPrevious;
    @JsonProperty("hasNext")
    private Boolean hasNext;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The hasPrevious
     */
    @JsonProperty("hasPrevious")
    public Boolean getHasPrevious() {
        return hasPrevious;
    }

    /**
     * 
     * @param hasPrevious
     *     The hasPrevious
     */
    @JsonProperty("hasPrevious")
    public void setHasPrevious(Boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }

    /**
     * 
     * @return
     *     The hasNext
     */
    @JsonProperty("hasNext")
    public Boolean getHasNext() {
        return hasNext;
    }

    /**
     * 
     * @param hasNext
     *     The hasNext
     */
    @JsonProperty("hasNext")
    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
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
        dest.writeValue(this.hasPrevious);
        dest.writeValue(this.hasNext);
    }

    public HasMore() {
    }

    protected HasMore(Parcel in) {
        this.hasPrevious = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.hasNext = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<HasMore> CREATOR = new Parcelable.Creator<HasMore>() {
        @Override
        public HasMore createFromParcel(Parcel source) {
            return new HasMore(source);
        }

        @Override
        public HasMore[] newArray(int size) {
            return new HasMore[size];
        }
    };
}
