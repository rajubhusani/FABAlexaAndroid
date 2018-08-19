
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
    "_id",
    "instructions",
    "descriptions",
    "information",
    "name"
})
public class PillMedicine implements Parcelable,Serializable {

    @JsonProperty("_id")
    private String _id;
    @JsonProperty("instructions")
    private String instructions;
    @JsonProperty("descriptions")
    private String descriptions;
    @JsonProperty("information")
    private String information;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    protected PillMedicine(Parcel in) {
        _id = in.readString();
        instructions = in.readString();
        descriptions = in.readString();
        information = in.readString();
        name = in.readString();
    }

    public static final Creator<PillMedicine> CREATOR = new Creator<PillMedicine>() {
        @Override
        public PillMedicine createFromParcel(Parcel in) {
            return new PillMedicine(in);
        }

        @Override
        public PillMedicine[] newArray(int size) {
            return new PillMedicine[size];
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
     *     The instructions
     */
    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    /**
     * 
     * @param instructions
     *     The instructions
     */
    @JsonProperty("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * 
     * @return
     *     The descriptions
     */
    @JsonProperty("descriptions")
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * 
     * @param descriptions
     *     The descriptions
     */
    @JsonProperty("descriptions")
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * 
     * @return
     *     The information
     */
    @JsonProperty("information")
    public String getInformation() {
        return information;
    }

    /**
     * 
     * @param information
     *     The information
     */
    @JsonProperty("information")
    public void setInformation(String information) {
        this.information = information;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
        dest.writeString(instructions);
        dest.writeString(descriptions);
        dest.writeString(information);
        dest.writeString(name);
    }
}
