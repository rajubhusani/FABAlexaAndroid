
package app.orbitahealth.sdk.requestmodel.createactivity;

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
    "text",
    "type",
    "images",
    "files",
    "taggedUsers"
})
public class CreateActivity {

    @JsonProperty("text")
    private String text;
    @JsonProperty("type")
    private String type;
    @JsonProperty("images")
    private List<Image> images = new ArrayList<Image>();
    @JsonProperty("files")
    private List<File> files = new ArrayList<File>();
    @JsonProperty("taggedUsers")
    private List<String> taggedUsers = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public void addImage(Image image) {
        if (null==images) {
            images = new ArrayList<>();
        }
        if (null==image) {
            return;
        }
        images.add(image);
    }

    public void addFile(File file) {
        if (null==images) {
            files = new ArrayList<>();
        }
        if (null==file) {
            return;
        }
        files.add(file);
    }

    /**
     * 
     * @return
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The images
     */
    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The files
     */
    @JsonProperty("files")
    public List<File> getFiles() {
        return files;
    }

    /**
     * 
     * @param files
     *     The files
     */
    @JsonProperty("files")
    public void setFiles(List<File> files) {
        this.files = files;
    }

    /**
     * 
     * @return
     *     The taggedUsers
     */
    @JsonProperty("taggedUsers")
    public List<String> getTaggedUsers() {
        return taggedUsers;
    }

    /**
     * 
     * @param taggedUsers
     *     The taggedUsers
     */
    @JsonProperty("taggedUsers")
    public void setTaggedUsers(List<String> taggedUsers) {
        this.taggedUsers = taggedUsers;
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
