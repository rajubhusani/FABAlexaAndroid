package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Task implements Parcelable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("isAllDay")
    @Expose
    private Boolean isAllDay;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("reminder")
    @Expose
    private List<String> reminder = null;
    @SerializedName("frequency")
    @Expose
    private Frequency frequency;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("isDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("patientId")
    @Expose
    private String patientId;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants = null;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("percentageOfComplete")
    @Expose
    private Integer percentageOfComplete;
    @SerializedName("keepMeInTask")
    @Expose
    private Boolean keepMeInTask;
    @SerializedName("keepUpdatesOfCompletion")
    @Expose
    private Boolean keepUpdatesOfCompletion;
    @SerializedName("ancestorId")
    @Expose
    private String ancestorId;
    @SerializedName("taskTemplateId")
    @Expose
    private String taskTemplateId;
    @SerializedName("range")
    @Expose
    private Range range;
    @SerializedName("comments")
    @Expose
    private String comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getIsAllDay() {
        return isAllDay;
    }

    public void setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getReminder() {
        return reminder;
    }

    public void setReminder(List<String> reminder) {
        this.reminder = reminder;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Integer getPercentageOfComplete() {
        return percentageOfComplete;
    }

    public void setPercentageOfComplete(Integer percentageOfComplete) {
        this.percentageOfComplete = percentageOfComplete;
    }

    public Boolean getKeepMeInTask() {
        return keepMeInTask;
    }

    public void setKeepMeInTask(Boolean keepMeInTask) {
        this.keepMeInTask = keepMeInTask;
    }

    public Boolean getKeepUpdatesOfCompletion() {
        return keepUpdatesOfCompletion;
    }

    public void setKeepUpdatesOfCompletion(Boolean keepUpdatesOfCompletion) {
        this.keepUpdatesOfCompletion = keepUpdatesOfCompletion;
    }

    public String getAncestorId() {
        return ancestorId;
    }

    public void setAncestorId(String ancestorId) {
        this.ancestorId = ancestorId;
    }

    public String getTaskTemplateId() {
        return taskTemplateId;
    }

    public void setTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
        dest.writeValue(this.isAllDay);
        dest.writeString(this.location);
        dest.writeStringList(this.reminder);
        dest.writeParcelable(this.frequency, flags);
        dest.writeParcelable(this.category, flags);
        dest.writeValue(this.isDeleted);
        dest.writeString(this.createdBy);
        dest.writeString(this.patientId);
        dest.writeTypedList(this.participants);
        dest.writeString(this.status);
        dest.writeString(this.priority);
        dest.writeValue(this.percentageOfComplete);
        dest.writeValue(this.keepMeInTask);
        dest.writeValue(this.keepUpdatesOfCompletion);
        dest.writeString(this.ancestorId);
        dest.writeString(this.taskTemplateId);
        dest.writeParcelable(this.range, flags);
        dest.writeString(this.comments);
    }

    public Task() {
    }

    protected Task(Parcel in) {
        this.id = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.startDate = in.readString();
        this.endDate = in.readString();
        this.isAllDay = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.location = in.readString();
        this.reminder = in.createStringArrayList();
        this.frequency = in.readParcelable(Frequency.class.getClassLoader());
        this.category = in.readParcelable(Category.class.getClassLoader());
        this.isDeleted = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.createdBy = in.readString();
        this.patientId = in.readString();
        this.participants = in.createTypedArrayList(Participant.CREATOR);
        this.status = in.readString();
        this.priority = in.readString();
        this.percentageOfComplete = (Integer) in.readValue(Integer.class.getClassLoader());
        this.keepMeInTask = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.keepUpdatesOfCompletion = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.ancestorId = in.readString();
        this.taskTemplateId = in.readString();
        this.range = in.readParcelable(Range.class.getClassLoader());
        this.comments = in.readString();
    }

    public static final Parcelable.Creator<Task> CREATOR = new Parcelable.Creator<Task>() {
        @Override
        public Task createFromParcel(Parcel source) {
            return new Task(source);
        }

        @Override
        public Task[] newArray(int size) {
            return new Task[size];
        }
    };
}
