package app.orbitahealth.sdk.requestmodel.updateuserprofile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class UpdateUserProfileRequest {

    @SerializedName("personaProfile")
    @Expose
    private Map<String, String> personaProfile;
    @SerializedName("personaType")
    @Expose
    private String personaType;

    public Map<String, String> getPersonaProfile() {
        return personaProfile;
    }

    public void setPersonaProfile(Map<String, String> personaProfile) {
        this.personaProfile = personaProfile;
    }

    public String getPersonaType() {
        return personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

}
