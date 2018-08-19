package app.orbitahealth.sdk.requestmodel.updatetask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import app.orbitahealth.sdk.responsemodel.getassignedtasks.Category;

public class UpdateTaskRequest {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("comments")
    @Expose
    private String comments;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
