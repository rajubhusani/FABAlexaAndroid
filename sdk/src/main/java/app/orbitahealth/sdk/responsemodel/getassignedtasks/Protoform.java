package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Protoform {

    @SerializedName("keyname")
    @Expose
    private String keyname;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("reps")
    @Expose
    private String reps;
    @SerializedName("sets")
    @Expose
    private String sets;

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getReps() {
        return reps;
    }

    public void setReps(String reps) {
        this.reps = reps;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

}
