package app.orbitahealth.sdk.requestmodel.carenotes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CareNotesListRequest {

    @SerializedName("q")
    @Expose
    private Object q;
    @SerializedName("defaultExclude")
    @Expose
    private Boolean defaultExclude;

    public Object getQ() {
        return q;
    }

    public void setQ(Object q) {
        this.q = q;
    }

    public Boolean getDefaultExclude() {
        return defaultExclude;
    }

    public void setDefaultExclude(Boolean defaultExclude) {
        this.defaultExclude = defaultExclude;
    }
}
