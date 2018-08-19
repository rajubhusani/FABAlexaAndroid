package app.orbitahealth.sdk.responsemodel.personastyperesponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Field implements Parcelable {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("isDefault")
    @Expose
    private Boolean isDefault;
    @SerializedName("validation")
    @Expose
    private List<ValidationRules> validation = null;
    @SerializedName("options")
    @Expose
    private List<Option> options = null;
    @SerializedName("fieldType")
    @Expose
    private String fieldType;
    @SerializedName("type")
    @Expose
    private String type;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public List<ValidationRules> getValidation() {
        return validation;
    }

    public void setValidation(List<ValidationRules> validation) {
        this.validation = validation;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeString(this.label);
        dest.writeString(this.id);
        dest.writeValue(this.isDefault);
        dest.writeTypedList(this.validation);
        dest.writeTypedList(this.options);
        dest.writeString(this.fieldType);
        dest.writeString(this.type);
    }

    public Field() {
    }

    protected Field(Parcel in) {
        this.key = in.readString();
        this.label = in.readString();
        this.id = in.readString();
        this.isDefault = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.validation = in.createTypedArrayList(ValidationRules.CREATOR);
        this.options = in.createTypedArrayList(Option.CREATOR);
        this.fieldType = in.readString();
        this.type = in.readString();
    }

    public static final Parcelable.Creator<Field> CREATOR = new Parcelable.Creator<Field>() {
        @Override
        public Field createFromParcel(Parcel source) {
            return new Field(source);
        }

        @Override
        public Field[] newArray(int size) {
            return new Field[size];
        }
    };
}
