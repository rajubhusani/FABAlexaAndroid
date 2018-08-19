package app.orbitahealth.sdk;

public class UpdateUserModel {

    private String firstName;
    private String lastName;
    private String avatarSrc;

    private Attributes attributes;

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAvatarPath() {
        return avatarSrc;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarSrc = avatarPath;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
