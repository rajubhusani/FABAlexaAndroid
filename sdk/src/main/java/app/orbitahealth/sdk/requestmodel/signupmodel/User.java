package app.orbitahealth.sdk.requestmodel.signupmodel;


public class User {
    private String username;
    private String password;
    private app.orbitahealth.sdk.requestmodel.signupmodel.Attributes attributes;

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

