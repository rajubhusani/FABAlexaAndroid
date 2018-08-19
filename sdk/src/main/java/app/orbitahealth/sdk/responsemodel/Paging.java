
package app.orbitahealth.sdk.responsemodel;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Paging {

    @SerializedName("pageCount")
    @Expose
    private long pageCount;
    @SerializedName("currentPage")
    @Expose
    private long currentPage;
    @SerializedName("resultsCount")
    @Expose
    private long resultsCount;
    @SerializedName("hasMore")
    @Expose
    private HasMore hasMore;

    /**
     * 
     * @return
     *     The pageCount
     */
    public long getPageCount() {
        return pageCount;
    }

    /**
     * 
     * @param pageCount
     *     The pageCount
     */
    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * 
     * @return
     *     The currentPage
     */
    public long getCurrentPage() {
        return currentPage;
    }

    /**
     * 
     * @param currentPage
     *     The currentPage
     */
    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 
     * @return
     *     The resultsCount
     */
    public long getResultsCount() {
        return resultsCount;
    }

    /**
     * 
     * @param resultsCount
     *     The resultsCount
     */
    public void setResultsCount(long resultsCount) {
        this.resultsCount = resultsCount;
    }

    /**
     * 
     * @return
     *     The hasMore
     */
    public HasMore getHasMore() {
        return hasMore;
    }

    /**
     * 
     * @param hasMore
     *     The hasMore
     */
    public void setHasMore(HasMore hasMore) {
        this.hasMore = hasMore;
    }

}
