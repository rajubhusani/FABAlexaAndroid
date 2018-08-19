
package app.orbitahealth.sdk.responsemodel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User {

    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("avatarSrc")
    @Expose
    private String avatarSrc;

    @SerializedName("phone")
    @Expose
    private String phone;



    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The avatarSrc
     */
    public String getAvatarSrc() {
        return avatarSrc;
    }

    /**
     * 
     * @param avatarSrc
     *     The avatarSrc
     */
    public void setAvatarSrc(String avatarSrc) {
        this.avatarSrc = avatarSrc;
    }



    /**
     *
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     *     The phone
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
