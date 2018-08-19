
package app.orbitahealth.sdk.responsemodel.getdashboard;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("maxValue")
    @Expose
    private JsonElement maxValue;
    @SerializedName("minValue")
    @Expose
    private JsonElement minValue;
    @SerializedName("unitOfValue")
    @Expose
    private String unitOfValue;
    @SerializedName("recentData")
    @Expose
    private RecentData recentData;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The maxValue
     */
    public JsonElement getMaxValue() {
        return maxValue;
    }

    /**
     * 
     * @param maxValue
     *     The maxValue
     */
    public void setMaxValue(JsonElement maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 
     * @return
     *     The minValue
     */
    public JsonElement getMinValue() {
        return minValue;
    }

    /**
     * 
     * @param minValue
     *     The minValue
     */
    public void setMinValue(JsonElement minValue) {
        this.minValue = minValue;
    }

    /**
     * 
     * @return
     *     The unitOfValue
     */
    public String getUnitOfValue() {
        return unitOfValue;
    }

    /**
     * 
     * @param unitOfValue
     *     The unitOfValue
     */
    public void setUnitOfValue(String unitOfValue) {
        this.unitOfValue = unitOfValue;
    }

    /**
     * 
     * @return
     *     The recentData
     */
    public RecentData getRecentData() {
        return recentData;
    }

    /**
     * 
     * @param recentData
     *     The recentData
     */
    public void setRecentData(RecentData recentData) {
        this.recentData = recentData;
    }

}
