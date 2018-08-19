package app.orbitahealth.sdk.responsemodel.healthdataresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JournalHealthDataResponse {

    @SerializedName("healthData")
    @Expose
    private List<HealthDatum> healthData = null;
    @SerializedName("avgHealthData")
    @Expose
    private List<AvgHealthDatum> avgHealthData = null;

    public List<HealthDatum> getHealthData() {
        return healthData;
    }

    public void setHealthData(List<HealthDatum> healthData) {
        this.healthData = healthData;
    }

    public List<AvgHealthDatum> getAvgHealthData() {
        return avgHealthData;
    }

    public void setAvgHealthData(List<AvgHealthDatum> avgHealthData) {
        this.avgHealthData = avgHealthData;
    }

}
