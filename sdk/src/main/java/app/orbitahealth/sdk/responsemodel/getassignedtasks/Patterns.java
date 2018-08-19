package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Patterns implements Parcelable {

    @SerializedName("dayOfMonth")
    @Expose
    private Integer dayOfMonth;
    @SerializedName("weekOfMonth")
    @Expose
    private Integer weekOfMonth;
    @SerializedName("dayOfWeek")
    @Expose
    private Integer dayOfWeek;
    @SerializedName("daysInWeek")
    @Expose
    private List<Integer> daysInWeek;
    @SerializedName("monthInYear")
    @Expose
    private Integer monthInYear;
    @SerializedName("interval")
    @Expose
    private Integer interval;
    @SerializedName("recurrenceType")
    @Expose
    private String recurrenceType;

    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public Integer getWeekOfMonth() {
        return weekOfMonth;
    }

    public void setWeekOfMonth(Integer weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public List<Integer> getDaysInWeek() {
        return daysInWeek;
    }

    public void setDaysInWeek(List<Integer> daysInWeek) {
        this.daysInWeek = daysInWeek;
    }

    public Integer getMonthInYear() {
        return monthInYear;
    }

    public void setMonthInYear(Integer monthInYear) {
        this.monthInYear = monthInYear;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getRecurrenceType() {
        return recurrenceType;
    }

    public void setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.dayOfMonth);
        dest.writeValue(this.weekOfMonth);
        dest.writeValue(this.dayOfWeek);
        dest.writeList(this.daysInWeek);
        dest.writeValue(this.monthInYear);
        dest.writeValue(this.interval);
        dest.writeString(this.recurrenceType);
    }

    public Patterns() {
    }

    protected Patterns(Parcel in) {
        this.dayOfMonth = (Integer) in.readValue(Integer.class.getClassLoader());
        this.weekOfMonth = (Integer) in.readValue(Integer.class.getClassLoader());
        this.dayOfWeek = (Integer) in.readValue(Integer.class.getClassLoader());
        this.daysInWeek = new ArrayList<Integer>();
        in.readList(this.daysInWeek, Integer.class.getClassLoader());
        this.monthInYear = (Integer) in.readValue(Integer.class.getClassLoader());
        this.interval = (Integer) in.readValue(Integer.class.getClassLoader());
        this.recurrenceType = in.readString();
    }

    public static final Parcelable.Creator<Patterns> CREATOR = new Parcelable.Creator<Patterns>() {
        @Override
        public Patterns createFromParcel(Parcel source) {
            return new Patterns(source);
        }

        @Override
        public Patterns[] newArray(int size) {
            return new Patterns[size];
        }
    };
}
