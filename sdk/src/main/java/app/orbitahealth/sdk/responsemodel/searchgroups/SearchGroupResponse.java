package app.orbitahealth.sdk.responsemodel.searchgroups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.orbitahealth.sdk.responsemodel.pillboxresponse.getpillsresponse.Paging;

public class SearchGroupResponse {

    @SerializedName("groups")
    @Expose
    private List<Group> groups = null;
    @SerializedName("paging")
    @Expose
    private Paging paging;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}
