package app.orbitahealth.sdk.responsemodel.getsurveyresultgraphdata;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatedBy implements Parcelable {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
    }

    public CreatedBy() {
    }

    protected CreatedBy(Parcel in) {
        this.id = in.readString();
        this.firstName = in.readString();
        this.lastName = in.readString();
    }

    public static final Parcelable.Creator<CreatedBy> CREATOR = new Parcelable.Creator<CreatedBy>() {
        @Override
        public CreatedBy createFromParcel(Parcel source) {
            return new CreatedBy(source);
        }

        @Override
        public CreatedBy[] newArray(int size) {
            return new CreatedBy[size];
        }
    };

}
