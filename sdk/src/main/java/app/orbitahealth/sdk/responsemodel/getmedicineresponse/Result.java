
package app.orbitahealth.sdk.responsemodel.getmedicineresponse;

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
    "patientId",
    "avatar",
    "refill",
    "instructions",
    "descriptions",
    "information",
    "name"
})
public class Result implements Serializable,Parcelable {

    @JsonProperty("_id")
    private String _id;
    @JsonProperty("patientId")
    private String patientId;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("refill")
    private Refill refill;
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

    public Result(Parcel in) {
        _id = in.readString();
        patientId = in.readString();
        avatar = in.readString();
        instructions = in.readString();
        descriptions = in.readString();
        information = in.readString();
        name = in.readString();
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

    public Result() {

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
     *     The avatar
     */
    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    /**
     * 
     * @param avatar
     *     The avatar
     */
    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 
     * @return
     *     The refill
     */
    @JsonProperty("refill")
    public Refill getRefill() {
        return refill;
    }

    /**
     * 
     * @param refill
     *     The refill
     */
    @JsonProperty("refill")
    public void setRefill(Refill refill) {
        this.refill = refill;
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
        dest.writeString(patientId);
        dest.writeString(avatar);
        dest.writeString(instructions);
        dest.writeString(descriptions);
        dest.writeString(information);
        dest.writeString(name);
    }
}
