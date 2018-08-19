
package app.orbitahealth.sdk.responsemodel.createactivityresponse;

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
    "attributes",
    "_id",
    "fileName",
    "fileExt",
    "fileSrc"
})
public class File {

    @JsonProperty("attributes")
    private Object attributes;
    @JsonProperty("_id")
    private String Id;
    @JsonProperty("fileName")
    private String fileName;
    @JsonProperty("fileExt")
    private String fileExt;
    @JsonProperty("fileSrc")
    private String fileSrc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public Object getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("_id")
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The fileName
     */
    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    /**
     * 
     * @param fileName
     *     The fileName
     */
    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 
     * @return
     *     The fileExt
     */
    @JsonProperty("fileExt")
    public String getFileExt() {
        return fileExt;
    }

    /**
     * 
     * @param fileExt
     *     The fileExt
     */
    @JsonProperty("fileExt")
    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    /**
     * 
     * @return
     *     The fileSrc
     */
    @JsonProperty("fileSrc")
    public String getFileSrc() {
        return fileSrc;
    }

    /**
     * 
     * @param fileSrc
     *     The fileSrc
     */
    @JsonProperty("fileSrc")
    public void setFileSrc(String fileSrc) {
        this.fileSrc = fileSrc;
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
