package app.orbitahealth.sdk.responsemodel.personastyperesponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.pillboxresponse.getpillsresponse.Paging;

public class PersonaTypesResponse {

    @SerializedName("personaType")
    @Expose
    private List<PersonaType> personaType = null;
    @SerializedName("paging")
    @Expose
    private Paging paging;

    public List<PersonaType> getPersonaType() {
        return personaType;
    }

    public void setPersonaType(List<PersonaType> personaType) {
        this.personaType = personaType;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}
