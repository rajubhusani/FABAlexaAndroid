package app.orbitahealth.sdk.responsemodel.healthdataresponse;
import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MaxValue {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("recordDate")
    @Expose
    private String recordDate;
    @SerializedName("recordValue")
    @Expose
    private JsonElement recordValue;
    @SerializedName("recordUnit")
    @Expose
    private String recordUnit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public JsonElement getRecordValue() {
        return recordValue;
    }

    public void setRecordValue(JsonElement recordValue) {
        this.recordValue = recordValue;
    }

    public String getRecordUnit() {
        return recordUnit;
    }

    public void setRecordUnit(String recordUnit) {
        this.recordUnit = recordUnit;
    }

}
