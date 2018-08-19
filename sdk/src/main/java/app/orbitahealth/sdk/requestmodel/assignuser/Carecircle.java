package app.orbitahealth.sdk.requestmodel.assignuser;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({

        "caregiver"
})

public class Carecircle {


    @JsonProperty("caregiver")
    Caregiver caregiver;

    @JsonProperty("caregiver")
    public Caregiver getCaregiver() {
        return caregiver;
    }

    @JsonProperty("caregiver")
    public void setCaregiver(Caregiver caregiver) {
        this.caregiver = caregiver;
    }


}
