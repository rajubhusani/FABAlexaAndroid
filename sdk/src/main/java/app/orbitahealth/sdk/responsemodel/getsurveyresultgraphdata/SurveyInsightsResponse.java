package app.orbitahealth.sdk.responsemodel.getsurveyresultgraphdata;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import app.orbitahealth.sdk.responsemodel.getassignedtasks.SurveyTaskSchemaResponse;

public class SurveyInsightsResponse {

    @SerializedName("customData")
    @Expose
    private JsonElement customData;
    @SerializedName("survey")
    @Expose
    private SurveyTaskSchemaResponse survey;

    public JsonElement getCustomData() {
        return customData;
    }

    public void setCustomData(JsonElement customData) {
        this.customData = customData;
    }

    public SurveyTaskSchemaResponse getSurvey() {
        return survey;
    }

    public void setSurvey(SurveyTaskSchemaResponse survey) {
        this.survey = survey;
    }

}
