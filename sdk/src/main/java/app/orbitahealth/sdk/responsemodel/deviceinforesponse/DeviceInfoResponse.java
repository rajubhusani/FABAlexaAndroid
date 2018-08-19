package app.orbitahealth.sdk.responsemodel.deviceinforesponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.activityresponse.Paging;

public class DeviceInfoResponse {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("paging")
    @Expose
    private Paging paging;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}
