package app.orbitahealth.sdk.responsemodel.getinsights;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("journeyId")
    @Expose
    private String journeyId;
    @SerializedName("pathwayId")
    @Expose
    private String pathwayId;
    @SerializedName("goalId")
    @Expose
    private String goalId;
    @SerializedName("notificationId")
    @Expose
    private String notificationId;

    public String getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    public String getPathwayId() {
        return pathwayId;
    }

    public void setPathwayId(String pathwayId) {
        this.pathwayId = pathwayId;
    }

    public String getGoalId() {
        return goalId;
    }

    public void setGoalId(String goalId) {
        this.goalId = goalId;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

}
