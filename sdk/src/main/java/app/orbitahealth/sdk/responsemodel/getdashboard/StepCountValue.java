package app.orbitahealth.sdk.responsemodel.getdashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StepCountValue {

    @SerializedName("count")
    @Expose
    private String count;
    @SerializedName("distanceTraveled")
    @Expose
    private String distanceTraveled;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(String distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

}
