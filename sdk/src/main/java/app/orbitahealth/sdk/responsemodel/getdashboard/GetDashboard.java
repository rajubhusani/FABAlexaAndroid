
package app.orbitahealth.sdk.responsemodel.getdashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetDashboard {

    @SerializedName("dashboard")
    @Expose
    private List<Dashboard> dashboard = null;
    @SerializedName("patientUser")
    @Expose
    private PatientUser patientUser;

    /**
     * 
     * @return
     *     The dashboard
     */
    public List<Dashboard> getDashboard() {
        return dashboard;
    }

    /**
     * 
     * @param dashboard
     *     The dashboard
     */
    public void setDashboard(List<Dashboard> dashboard) {
        this.dashboard = dashboard;
    }

    /**
     *
     * @return
     *     The patientUser
     */
    public PatientUser getPatientUser() {
        return patientUser;
    }

    /**
     *
     * @param patientUser
     *     The patientUser
     */
    public void setPatientUser(PatientUser patientUser) {
        this.patientUser = patientUser;
    }

}
