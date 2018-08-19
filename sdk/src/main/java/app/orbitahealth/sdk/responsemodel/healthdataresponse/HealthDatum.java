package app.orbitahealth.sdk.responsemodel.healthdataresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HealthDatum {

    @SerializedName("dateValue")
    @Expose
    private String dateValue;
    @SerializedName("healthData")
    @Expose
    private List<HealthDatum_> healthData = null;
    @SerializedName("_id")
    @Expose
    private String id;

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public List<HealthDatum_> getHealthData() {
        return healthData;
    }

    public void setHealthData(List<HealthDatum_> healthData) {
        this.healthData = healthData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
