package app.orbitahealth.sdk.responsemodel.getinsights;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.activityresponse.Paging;

public class GetInsightsResponse {

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
