
package app.orbitahealth.sdk.responsemodel.orbitabuttonsconnected;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carecircleId",
    "pillBoxId",
    "pillSlotId",
    "text",
    "taggedUsers",
    "type",
    "images",
    "files"
})
public class PayLoad__ {

    @JsonProperty("carecircleId")
    private String carecircleId;
    @JsonProperty("pillBoxId")
    private String pillBoxId;
    @JsonProperty("pillSlotId")
    private String pillSlotId;
    @JsonProperty("text")
    private String text;
    @JsonProperty("taggedUsers")
    private List<Object> taggedUsers = new ArrayList<Object>();
    @JsonProperty("type")
    private String type;
    @JsonProperty("images")
    private List<Object> images = new ArrayList<Object>();
    @JsonProperty("files")
    private List<Object> files = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The carecircleId
     */
    @JsonProperty("carecircleId")
    public String getCarecircleId() {
        return carecircleId;
    }

    /**
     * 
     * @param carecircleId
     *     The carecircleId
     */
    @JsonProperty("carecircleId")
    public void setCarecircleId(String carecircleId) {
        this.carecircleId = carecircleId;
    }

    /**
     * 
     * @return
     *     The pillBoxId
     */
    @JsonProperty("pillBoxId")
    public String getPillBoxId() {
        return pillBoxId;
    }

    /**
     * 
     * @param pillBoxId
     *     The pillBoxId
     */
    @JsonProperty("pillBoxId")
    public void setPillBoxId(String pillBoxId) {
        this.pillBoxId = pillBoxId;
    }

    /**
     * 
     * @return
     *     The pillSlotId
     */
    @JsonProperty("pillSlotId")
    public String getPillSlotId() {
        return pillSlotId;
    }

    /**
     * 
     * @param pillSlotId
     *     The pillSlotId
     */
    @JsonProperty("pillSlotId")
    public void setPillSlotId(String pillSlotId) {
        this.pillSlotId = pillSlotId;
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
     *     The taggedUsers
     */
    @JsonProperty("taggedUsers")
    public List<Object> getTaggedUsers() {
        return taggedUsers;
    }

    /**
     * 
     * @param taggedUsers
     *     The taggedUsers
     */
    @JsonProperty("taggedUsers")
    public void setTaggedUsers(List<Object> taggedUsers) {
        this.taggedUsers = taggedUsers;
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
    public List<Object> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    @JsonProperty("images")
    public void setImages(List<Object> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The files
     */
    @JsonProperty("files")
    public List<Object> getFiles() {
        return files;
    }

    /**
     * 
     * @param files
     *     The files
     */
    @JsonProperty("files")
    public void setFiles(List<Object> files) {
        this.files = files;
    }

}
