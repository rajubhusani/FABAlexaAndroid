package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FrequencyRange implements Parcelable {

    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("occurrencesCount")
    @Expose
    private Integer occurrencesCount;
    @SerializedName("rangeType")
    @Expose
    private String rangeType;

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

    public Integer getOccurrencesCount() {
        return occurrencesCount;
    }

    public void setOccurrencesCount(Integer occurrencesCount) {
        this.occurrencesCount = occurrencesCount;
    }

    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
        dest.writeValue(this.occurrencesCount);
        dest.writeString(this.rangeType);
    }

    public FrequencyRange() {
    }

    protected FrequencyRange(Parcel in) {
        this.startDate = in.readString();
        this.endDate = in.readString();
        this.occurrencesCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.rangeType = in.readString();
    }

    public static final Parcelable.Creator<FrequencyRange> CREATOR = new Parcelable.Creator<FrequencyRange>() {
        @Override
        public FrequencyRange createFromParcel(Parcel source) {
            return new FrequencyRange(source);
        }

        @Override
        public FrequencyRange[] newArray(int size) {
            return new FrequencyRange[size];
        }
    };
}
