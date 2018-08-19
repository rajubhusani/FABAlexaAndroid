
package app.orbitahealth.sdk.responsemodel.patientheightresponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pageCount",
    "currentPage",
    "itemCount",
    "resultsCount",
    "hasMore"
})
public class Paging {

    @JsonProperty("pageCount")
    private Integer pageCount;
    @JsonProperty("currentPage")
    private Integer currentPage;
    @JsonProperty("itemCount")
    private Integer itemCount;
    @JsonProperty("resultsCount")
    private Integer resultsCount;
    @JsonProperty("hasMore")
    private HasMore hasMore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The pageCount
     */
    @JsonProperty("pageCount")
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * 
     * @param pageCount
     *     The pageCount
     */
    @JsonProperty("pageCount")
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * 
     * @return
     *     The currentPage
     */
    @JsonProperty("currentPage")
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * 
     * @param currentPage
     *     The currentPage
     */
    @JsonProperty("currentPage")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 
     * @return
     *     The itemCount
     */
    @JsonProperty("itemCount")
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * 
     * @param itemCount
     *     The itemCount
     */
    @JsonProperty("itemCount")
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * 
     * @return
     *     The resultsCount
     */
    @JsonProperty("resultsCount")
    public Integer getResultsCount() {
        return resultsCount;
    }

    /**
     * 
     * @param resultsCount
     *     The resultsCount
     */
    @JsonProperty("resultsCount")
    public void setResultsCount(Integer resultsCount) {
        this.resultsCount = resultsCount;
    }

    /**
     * 
     * @return
     *     The hasMore
     */
    @JsonProperty("hasMore")
    public HasMore getHasMore() {
        return hasMore;
    }

    /**
     * 
     * @param hasMore
     *     The hasMore
     */
    @JsonProperty("hasMore")
    public void setHasMore(HasMore hasMore) {
        this.hasMore = hasMore;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
