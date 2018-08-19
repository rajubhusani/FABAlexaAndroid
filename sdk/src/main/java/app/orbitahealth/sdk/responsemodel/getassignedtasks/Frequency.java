package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Frequency implements Parcelable {

    @SerializedName("patterns")
    @Expose
    private Patterns patterns;
    @SerializedName("range")
    @Expose
    private FrequencyRange range;

    public Patterns getPatterns() {
        return patterns;
    }

    public void setPatterns(Patterns patterns) {
        this.patterns = patterns;
    }

    public FrequencyRange getRange() {
        return range;
    }

    public void setRange(FrequencyRange range) {
        this.range = range;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.patterns, flags);
        dest.writeParcelable(this.range, flags);
    }

    public Frequency() {
    }

    protected Frequency(Parcel in) {
        this.patterns = in.readParcelable(Patterns.class.getClassLoader());
        this.range = in.readParcelable(FrequencyRange.class.getClassLoader());
    }

    public static final Parcelable.Creator<Frequency> CREATOR = new Parcelable.Creator<Frequency>() {
        @Override
        public Frequency createFromParcel(Parcel source) {
            return new Frequency(source);
        }

        @Override
        public Frequency[] newArray(int size) {
            return new Frequency[size];
        }
    };
}
