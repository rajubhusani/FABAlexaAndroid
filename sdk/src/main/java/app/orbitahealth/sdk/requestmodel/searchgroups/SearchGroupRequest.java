package app.orbitahealth.sdk.requestmodel.searchgroups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchGroupRequest {

    @SerializedName("query")
    @Expose
    private Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
