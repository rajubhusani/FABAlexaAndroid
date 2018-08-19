package app.orbitahealth.sdk.responsemodel.getdashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BloodPressureValue {

    @SerializedName("systolic")
    @Expose
    private Integer systolic;
    @SerializedName("diastolic")
    @Expose
    private Integer diastolic;

    public Integer getSystolic() {
        return systolic;
    }

    public void setSystolic(Integer systolic) {
        this.systolic = systolic;
    }

    public Integer getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(Integer diastolic) {
        this.diastolic = diastolic;
    }

}
