
package app.orbitahealth.sdk.responsemodel.orbitabuttonevents;

import java.util.ArrayList;
import java.util.List;

public class PayLoad__ {

    private String carecircleId;
    private String pillBoxId;
    private String pillSlotId;
    private String text;
    private List<Object> taggedUsers = new ArrayList<Object>();
    private String type;
    private List<Object> images = new ArrayList<Object>();
    private List<Object> files = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The carecircleId
     */
    public String getCarecircleId() {
        return carecircleId;
    }

    /**
     * 
     * @param carecircleId
     *     The carecircleId
     */
    public void setCarecircleId(String carecircleId) {
        this.carecircleId = carecircleId;
    }

    /**
     * 
     * @return
     *     The pillBoxId
     */
    public String getPillBoxId() {
        return pillBoxId;
    }

    /**
     * 
     * @param pillBoxId
     *     The pillBoxId
     */
    public void setPillBoxId(String pillBoxId) {
        this.pillBoxId = pillBoxId;
    }

    /**
     * 
     * @return
     *     The pillSlotId
     */
    public String getPillSlotId() {
        return pillSlotId;
    }

    /**
     * 
     * @param pillSlotId
     *     The pillSlotId
     */
    public void setPillSlotId(String pillSlotId) {
        this.pillSlotId = pillSlotId;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The taggedUsers
     */
    public List<Object> getTaggedUsers() {
        return taggedUsers;
    }

    /**
     * 
     * @param taggedUsers
     *     The taggedUsers
     */
    public void setTaggedUsers(List<Object> taggedUsers) {
        this.taggedUsers = taggedUsers;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Object> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Object> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The files
     */
    public List<Object> getFiles() {
        return files;
    }

    /**
     * 
     * @param files
     *     The files
     */
    public void setFiles(List<Object> files) {
        this.files = files;
    }

}
