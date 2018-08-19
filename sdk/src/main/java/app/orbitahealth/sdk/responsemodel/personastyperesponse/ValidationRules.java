package app.orbitahealth.sdk.responsemodel.personastyperesponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValidationRules implements Parcelable {

    @SerializedName("required")
    @Expose
    private boolean isRequired;

    @SerializedName("pattern")
    @Expose
    private String pattern;

    @SerializedName("errorText")
    @Expose
    private String errorText;

    @SerializedName("isNumber")
    @Expose
    private boolean isNumber;

    public ValidationRules() {
        this.isNumber = false;
        this.pattern = "";
        this.errorText = "";
        this.isNumber = false;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public boolean isNumber() {
        return isNumber;
    }

    public void setNumber(boolean number) {
        isNumber = number;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.isRequired ? (byte) 1 : (byte) 0);
        dest.writeString(this.pattern);
        dest.writeString(this.errorText);
        dest.writeByte(this.isNumber ? (byte) 1 : (byte) 0);
    }

    protected ValidationRules(Parcel in) {
        this.isRequired = in.readByte() != 0;
        this.pattern = in.readString();
        this.errorText = in.readString();
        this.isNumber = in.readByte() != 0;
    }

    public static final Parcelable.Creator<ValidationRules> CREATOR = new Parcelable.Creator<ValidationRules>() {
        @Override
        public ValidationRules createFromParcel(Parcel source) {
            return new ValidationRules(source);
        }

        @Override
        public ValidationRules[] newArray(int size) {
            return new ValidationRules[size];
        }
    };
}
