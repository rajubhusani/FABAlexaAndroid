package app.orbitahealth.sdk.responsemodel.getassignedtasks;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category implements Parcelable {

    @SerializedName("categoryType")
    @Expose
    private String categoryType;
    @SerializedName("refs")
    @Expose
    private List<Ref> refs = null;

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public List<Ref> getRefs() {
        return refs;
    }

    public void setRefs(List<Ref> refs) {
        this.refs = refs;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.categoryType);
        dest.writeTypedList(this.refs);
    }

    public Category() {
    }

    protected Category(Parcel in) {
        this.categoryType = in.readString();
        this.refs = in.createTypedArrayList(Ref.CREATOR);
    }

    public static final Parcelable.Creator<Category> CREATOR = new Parcelable.Creator<Category>() {
        @Override
        public Category createFromParcel(Parcel source) {
            return new Category(source);
        }

        @Override
        public Category[] newArray(int size) {
            return new Category[size];
        }
    };
}
