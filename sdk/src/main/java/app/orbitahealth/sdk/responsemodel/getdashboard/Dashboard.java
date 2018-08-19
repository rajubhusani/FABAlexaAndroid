
package app.orbitahealth.sdk.responsemodel.getdashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dashboard {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("hasData")
    @Expose
    private Boolean hasData;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("filterRange")
    @Expose
    private String filterRange;
    @SerializedName("Data")
    @Expose
    private Data data;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The hasData
     */
    public Boolean getHasData() {
        return hasData;
    }

    /**
     * 
     * @param hasData
     *     The hasData
     */
    public void setHasData(Boolean hasData) {
        this.hasData = hasData;
    }

    /**
     *
     * @return
     *     The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     *
     * @param displayName
     *     The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The filterRange
     */
    public String getFilterRange() {
        return filterRange;
    }

    /**
     * 
     * @param filterRange
     *     The filterRange
     */
    public void setFilterRange(String filterRange) {
        this.filterRange = filterRange;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The Data
     */
    public void setData(Data data) {
        this.data = data;
    }

}
