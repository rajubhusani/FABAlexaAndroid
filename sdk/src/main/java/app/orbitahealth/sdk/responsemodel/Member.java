
package app.orbitahealth.sdk.responsemodel;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Member {

    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * 
     * @return
     *     The user
     */
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

}
