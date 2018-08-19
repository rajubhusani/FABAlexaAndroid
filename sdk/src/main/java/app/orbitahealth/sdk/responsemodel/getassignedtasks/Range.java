package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Range implements Parcelable {

    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("endTime")
    @Expose
    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.startTime);
        dest.writeString(this.endTime);
    }

    public Range() {
    }

    protected Range(Parcel in) {
        this.startTime = in.readString();
        this.endTime = in.readString();
    }

    public static final Parcelable.Creator<Range> CREATOR = new Parcelable.Creator<Range>() {
        @Override
        public Range createFromParcel(Parcel source) {
            return new Range(source);
        }

        @Override
        public Range[] newArray(int size) {
            return new Range[size];
        }
    };
}
