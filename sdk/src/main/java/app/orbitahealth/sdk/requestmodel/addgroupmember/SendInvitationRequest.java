package app.orbitahealth.sdk.requestmodel.addgroupmember;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class SendInvitationRequest {

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("personaType")
    @Expose
    private String personaType;

    @SerializedName("personaProfile")
    @Expose
    private Map<String, String> personaProfile;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonaType() {
        return personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    public Map<String, String> getPersonaProfile() {
        return personaProfile;
    }

    public void setPersonaProfile(Map<String, String> personaProfile) {
        this.personaProfile = personaProfile;
    }

}
