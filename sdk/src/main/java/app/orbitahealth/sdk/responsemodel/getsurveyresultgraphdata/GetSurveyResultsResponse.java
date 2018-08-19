package app.orbitahealth.sdk.responsemodel.getsurveyresultgraphdata;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.activityresponse.Paging;

public class GetSurveyResultsResponse implements Parcelable {

    @SerializedName("result")
    @Expose
    private List<SurveyData> result = null;
    @SerializedName("paging")
    @Expose
    private Paging paging;

    public List<SurveyData> getResult() {
        return result;
    }

    public void setResult(List<SurveyData> result) {
        this.result = result;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.result);
        dest.writeParcelable(this.paging, flags);
    }

    public GetSurveyResultsResponse() {
    }

    protected GetSurveyResultsResponse(Parcel in) {
        this.result = in.createTypedArrayList(SurveyData.CREATOR);
        this.paging = in.readParcelable(Paging.class.getClassLoader());
    }

    public static final Parcelable.Creator<GetSurveyResultsResponse> CREATOR = new Parcelable.Creator<GetSurveyResultsResponse>() {
        @Override
        public GetSurveyResultsResponse createFromParcel(Parcel source) {
            return new GetSurveyResultsResponse(source);
        }

        @Override
        public GetSurveyResultsResponse[] newArray(int size) {
            return new GetSurveyResultsResponse[size];
        }
    };

}
