
package app.orbitahealth.sdk.responsemodel.getcommentsresponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "comments",
    "paging"
})
public class GetCommentsResponse {

    @JsonProperty("comments")
    private List<Comment> comments = new ArrayList<Comment>();
    @JsonProperty("paging")
    private Paging paging;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The comments
     */
    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * 
     * @param comments
     *     The comments
     */
    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    /**
     * 
     * @return
     *     The paging
     */
    @JsonProperty("paging")
    public Paging getPaging() {
        return paging;
    }

    public void addComment(Comment comment) {
        if (null==comments) {
            comments = new ArrayList<>();
        }
        if (null == comment) {
            return;
        }
        comments.add(comment);
    }

    /**
     * 
     * @param paging
     *     The paging
     */
    @JsonProperty("paging")
    public void setPaging(Paging paging) {
        this.paging = paging;
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
