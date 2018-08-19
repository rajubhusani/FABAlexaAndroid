package app.orbitahealth.sdk.responsemodel.healthdataresponse;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvgHealthDatum {

    @SerializedName("avgValue")
    @Expose
    private Object avgValue;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("maxValue")
    @Expose
    private List<MaxValue> maxValue = null;
    @SerializedName("minValue")
    @Expose
    private List<MinValue> minValue = null;

    public Object getAvgValue() {
        return avgValue;
    }

    public void setAvgValue(Object avgValue) {
        this.avgValue = avgValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<MaxValue> getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(List<MaxValue> maxValue) {
        this.maxValue = maxValue;
    }

    public List<MinValue> getMinValue() {
        return minValue;
    }

    public void setMinValue(List<MinValue> minValue) {
        this.minValue = minValue;
    }

}
