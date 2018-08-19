
package app.orbitahealth.sdk.requestmodel.addpills;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pillMedicine",
    "pillCount"
})
public class Pill {

    @JsonProperty("pillMedicine")
    private String pillMedicine;
    @JsonProperty("pillCount")
    private Integer pillCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The pillMedicine
     */
    @JsonProperty("pillMedicine")
    public String getPillMedicine() {
        return pillMedicine;
    }

    /**
     * 
     * @param pillMedicine
     *     The pillMedicine
     */
    @JsonProperty("pillMedicine")
    public void setPillMedicine(String pillMedicine) {
        this.pillMedicine = pillMedicine;
    }

    /**
     * 
     * @return
     *     The pillCount
     */
    @JsonProperty("pillCount")
    public Integer getPillCount() {
        return pillCount;
    }

    /**
     * 
     * @param pillCount
     *     The pillCount
     */
    @JsonProperty("pillCount")
    public void setPillCount(Integer pillCount) {
        this.pillCount = pillCount;
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
