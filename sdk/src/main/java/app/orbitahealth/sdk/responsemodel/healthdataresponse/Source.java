package app.orbitahealth.sdk.responsemodel.healthdataresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

    @SerializedName("modality")
    @Expose
    private String modality;
    @SerializedName("name")
    @Expose
    private String name;

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}