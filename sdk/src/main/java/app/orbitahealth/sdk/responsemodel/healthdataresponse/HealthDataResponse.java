package app.orbitahealth.sdk.responsemodel.healthdataresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import app.orbitahealth.sdk.responsemodel.pillboxresponse.getpillsresponse.Paging;

public class HealthDataResponse {

    @SerializedName("pageData")
    @Expose
    private List<PageDatum> pageData = null;
    @SerializedName("paging")
    @Expose
    private Paging paging;

    public List<PageDatum> getPageData() {
        return pageData;
    }

    public void setPageData(List<PageDatum> pageData) {
        this.pageData = pageData;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}