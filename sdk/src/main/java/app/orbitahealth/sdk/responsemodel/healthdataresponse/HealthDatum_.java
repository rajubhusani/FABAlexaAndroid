package app.orbitahealth.sdk.responsemodel.healthdataresponse;
import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HealthDatum_ {

    @SerializedName("measuredTime")
    @Expose
    private String measuredTime;
    @SerializedName("measuredDateTime")
    @Expose
    private String measuredDateTime;
    @SerializedName("measuredValue")
    @Expose
    private JsonElement measuredValue;
    @SerializedName("measuredUnit")
    @Expose
    private String measuredUnit;

    public String getMeasuredTime() {
        return measuredTime;
    }

    public void setMeasuredTime(String measuredTime) {
        this.measuredTime = measuredTime;
    }

    public String getMeasuredDateTime() {
        return measuredDateTime;
    }

    public void setMeasuredDateTime(String measuredDateTime) {
        this.measuredDateTime = measuredDateTime;
    }

    public JsonElement getMeasuredValue() {
        return measuredValue;
    }

    public void setMeasuredValue(JsonElement measuredValue) {
        this.measuredValue = measuredValue;
    }

    public String getMeasuredUnit() {
        return measuredUnit;
    }

    public void setMeasuredUnit(String measuredUnit) {
        this.measuredUnit = measuredUnit;
    }

}
