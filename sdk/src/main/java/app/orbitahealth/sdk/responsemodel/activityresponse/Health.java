
package app.orbitahealth.sdk.responsemodel.activityresponse;

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
    "collectionName",
    "docId"
})
public class Health {

    @JsonProperty("collectionName")
    private String collectionName;
    @JsonProperty("docId")
    private String docId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The collectionName
     */
    @JsonProperty("collectionName")
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * 
     * @param collectionName
     *     The collectionName
     */
    @JsonProperty("collectionName")
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * 
     * @return
     *     The docId
     */
    @JsonProperty("docId")
    public String getDocId() {
        return docId;
    }

    /**
     * 
     * @param docId
     *     The docId
     */
    @JsonProperty("docId")
    public void setDocId(String docId) {
        this.docId = docId;
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
