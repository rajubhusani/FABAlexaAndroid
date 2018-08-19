package app.orbitahealth.sdk.responsemodel.healthdataresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MetaResponse {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("unitOfMeasurement")
    @Expose
    private String unitOfMeasurement;
    @SerializedName("result")
    @Expose
    private List<String> result = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

}
