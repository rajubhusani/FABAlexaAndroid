package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ref implements Parcelable {

    @SerializedName("refType")
    @Expose
    private String refType;
    @SerializedName("refName")
    @Expose
    private String refName;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("refData")
    @Expose
    private String refData;

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRefData() {
        return refData;
    }

    public void setRefData(String refData) {
        this.refData = refData;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.refType);
        dest.writeString(this.refName);
        dest.writeString(this.id);
        dest.writeString(this.refData);
    }

    public Ref() {
    }

    protected Ref(Parcel in) {
        this.refType = in.readString();
        this.refName = in.readString();
        this.id = in.readString();
        this.refData = in.readString();
    }

    public static final Parcelable.Creator<Ref> CREATOR = new Parcelable.Creator<Ref>() {
        @Override
        public Ref createFromParcel(Parcel source) {
            return new Ref(source);
        }

        @Override
        public Ref[] newArray(int size) {
            return new Ref[size];
        }
    };
}
