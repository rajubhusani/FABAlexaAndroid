
package app.orbitahealth.sdk.responsemodel.postcommentsresponse;

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
    "__v",
    "modifiedAt",
    "createdAt",
    "_id",
    "rootId",
    "user",
    "objectId",
    "commentsCount",
    "comments",
    "likes",
    "likesCount",
    "commentText"
})
public class PostCommentResponse {

    @JsonProperty("__v")
    private Integer V;
    @JsonProperty("modifiedAt")
    private String modifiedAt;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("_id")
    private String Id;
    @JsonProperty("rootId")
    private String rootId;
    @JsonProperty("user")
    private User user;
    @JsonProperty("objectId")
    private String objectId;
    @JsonProperty("commentsCount")
    private Integer commentsCount;
    @JsonProperty("comments")
    private List<Object> comments = new ArrayList<Object>();
    @JsonProperty("likes")
    private List<Object> likes = new ArrayList<Object>();
    @JsonProperty("likesCount")
    private Integer likesCount;
    @JsonProperty("commentText")
    private String commentText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The rootId
     */
    @JsonProperty("rootId")
    public String getRootId() {
        return rootId;
    }

    /**
     * 
     * @param rootId
     *     The rootId
     */
    @JsonProperty("rootId")
    public void setRootId(String rootId) {
        this.rootId = rootId;
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
     *     The objectId
     */
    @JsonProperty("objectId")
    public String getObjectId() {
        return objectId;
    }

    /**
     * 
     * @param objectId
     *     The objectId
     */
    @JsonProperty("objectId")
    public void setObjectId(String objectId) {
        this.objectId = objectId;
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
     *     The comments
     */
    @JsonProperty("comments")
    public List<Object> getComments() {
        return comments;
    }

    /**
     * 
     * @param comments
     *     The comments
     */
    @JsonProperty("comments")
    public void setComments(List<Object> comments) {
        this.comments = comments;
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
     *     The commentText
     */
    @JsonProperty("commentText")
    public String getCommentText() {
        return commentText;
    }

    /**
     * 
     * @param commentText
     *     The commentText
     */
    @JsonProperty("commentText")
    public void setCommentText(String commentText) {
        this.commentText = commentText;
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
