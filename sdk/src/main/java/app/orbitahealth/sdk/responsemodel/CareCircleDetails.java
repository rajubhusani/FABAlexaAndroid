
package app.orbitahealth.sdk.responsemodel;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CareCircleDetails {

    @SerializedName("users")
    @Expose
    private Users users;
    @SerializedName("paging")
    @Expose
    private Paging paging;

    /**
     * 
     * @return
     *     The users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * 
     * @param users
     *     The users
     */
    public void setUsers(Users users) {
        this.users = users;
    }

    /**
     * 
     * @return
     *     The paging
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * 
     * @param paging
     *     The paging
     */
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}
