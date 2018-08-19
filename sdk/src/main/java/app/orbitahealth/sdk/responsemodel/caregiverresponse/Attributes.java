package app.orbitahealth.sdk.responsemodel.caregiverresponse;

/**
 * MemberRoles containing extra data regarding the each entities(MemberObject, Patient).
 */
public class Attributes {
    private String birthday="";
    private String gender="";


    public String getBirthday() {

        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
