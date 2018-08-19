package app.orbitahealth.sdk.responsemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrganizationResponse {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tokenExpiration")
    @Expose
    private Integer tokenExpiration;
    @SerializedName("likesPageSize")
    @Expose
    private Integer likesPageSize;
    @SerializedName("commentsPageSize")
    @Expose
    private Integer commentsPageSize;
    @SerializedName("pagingPageSize")
    @Expose
    private Integer pagingPageSize;
    @SerializedName("logoUrl")
    @Expose
    private String logoUrl;
    @SerializedName("description")
    @Expose
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTokenExpiration() {
        return tokenExpiration;
    }

    public void setTokenExpiration(Integer tokenExpiration) {
        this.tokenExpiration = tokenExpiration;
    }

    public Integer getLikesPageSize() {
        return likesPageSize;
    }

    public void setLikesPageSize(Integer likesPageSize) {
        this.likesPageSize = likesPageSize;
    }

    public Integer getCommentsPageSize() {
        return commentsPageSize;
    }

    public void setCommentsPageSize(Integer commentsPageSize) {
        this.commentsPageSize = commentsPageSize;
    }

    public Integer getPagingPageSize() {
        return pagingPageSize;
    }

    public void setPagingPageSize(Integer pagingPageSize) {
        this.pagingPageSize = pagingPageSize;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
