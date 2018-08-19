
package app.orbitahealth.sdk.responsemodel.activityresponse;

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
    "_id",
    "modifiedAt",
    "createdAt",
    "type",
    "user",
    "attributes",
    "__v",
    "files",
    "images",
    "taggedUsers",
    "likes",
    "likesCount",
    "commentsCount",
    "text"
})
public class Activity {

    @JsonProperty("_id")
    private String _id;
    @JsonProperty("modifiedAt")
    private String modifiedAt;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("type")
    private String type;
    @JsonProperty("user")
    private User user;
    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonProperty("__v")
    private Integer V;
    @JsonProperty("files")
    private List<Object> files = new ArrayList<Object>();
    @JsonProperty("images")
    private List<Image> images = new ArrayList<Image>();
    @JsonProperty("taggedUsers")
    private List<Object> taggedUsers = new ArrayList<Object>();
    @JsonProperty("likes")
    private List<Object> likes = new ArrayList<Object>();
    @JsonProperty("likesCount")
    private Integer likesCount;
    @JsonProperty("commentsCount")
    private Integer commentsCount;
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("_id")
    public String getId() {
        return _id;
    }

    /**
     * 
     * @param _id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String _id) {
        this._id = _id;
    }

    /**
     * 
     * @return
     *     The modifiedAt
     */
    @JsonProperty("modifiedAt")
    public String getModifiedAt() {
        return modifiedAt;
    }

    /**
     * 
     * @param modifiedAt
     *     The modifiedAt
     */
    @JsonProperty("modifiedAt")
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
     *     The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The V
     */
    @JsonProperty("__v")
    public Integer getV() {
        return V;
    }

    /**
     * 
     * @param V
     *     The __v
     */
    @JsonProperty("__v")
    public void setV(Integer V) {
        this.V = V;
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
     *     The likes
     */
    @JsonProperty("likes")
    public List<Object> getLikes() {
        return likes;
    }

    /**
     * 
     * @param likes
     *     The likes
     */
    @JsonProperty("likes")
    public void setLikes(List<Object> likes) {
        this.likes = likes;
    }

    /**
     * 
     * @return
     *     The likesCount
     */
    @JsonProperty("likesCount")
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     * 
     * @param likesCount
     *     The likesCount
     */
    @JsonProperty("likesCount")
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     * 
     * @return
     *     The commentsCount
     */
    @JsonProperty("commentsCount")
    public Integer getCommentsCount() {
        return commentsCount;
    }

    /**
     * 
     * @param commentsCount
     *     The commentsCount
     */
    @JsonProperty("commentsCount")
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
