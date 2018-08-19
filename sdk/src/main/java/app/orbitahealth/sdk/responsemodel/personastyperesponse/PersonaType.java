package app.orbitahealth.sdk.responsemodel.personastyperesponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PersonaType implements Parcelable {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("isDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("isDefault")
    @Expose
    private Boolean isDefault;
    @SerializedName("fields")
    @Expose
    private List<Field> fields = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.modifiedAt);
        dest.writeString(this.createdAt);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.avatar);
        dest.writeValue(this.v);
        dest.writeValue(this.isDeleted);
        dest.writeValue(this.isDefault);
        dest.writeTypedList(this.fields);
    }

    public PersonaType() {
    }

    protected PersonaType(Parcel in) {
        this.id = in.readString();
        this.modifiedAt = in.readString();
        this.createdAt = in.readString();
        this.name = in.readString();
        this.description = in.readString();
        this.avatar = in.readString();
        this.v = (Integer) in.readValue(Integer.class.getClassLoader());
        this.isDeleted = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isDefault = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.fields = in.createTypedArrayList(Field.CREATOR);
    }

    public static final Parcelable.Creator<PersonaType> CREATOR = new Parcelable.Creator<PersonaType>() {
        @Override
        public PersonaType createFromParcel(Parcel source) {
            return new PersonaType(source);
        }

        @Override
        public PersonaType[] newArray(int size) {
            return new PersonaType[size];
        }
    };

}
