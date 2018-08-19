package app.orbitahealth.sdk.requestmodel.addhealthdata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import app.orbitahealth.sdk.responsemodel.healthdataresponse.Source;

public class AddHealthDataRequest {

    @SerializedName("measurementValue")
    @Expose
    private Object measurementValue;
    @SerializedName("unitOfMeasurement")
    @Expose
    private String unitOfMeasurement;
    @SerializedName("recordedTime")
    @Expose
    private String recordedTime;
    @SerializedName("source")
    @Expose
    private Source source;

    public Object getMeasurementValue() {
        return measurementValue;
    }

    public void setMeasurementValue(Object measurementValue) {
        this.measurementValue = measurementValue;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String getRecordedTime() {
        return recordedTime;
    }

    public void setRecordedTime(String recordedTime) {
        this.recordedTime = recordedTime;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

}
