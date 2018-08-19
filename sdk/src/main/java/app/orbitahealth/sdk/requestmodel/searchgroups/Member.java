package app.orbitahealth.sdk.requestmodel.searchgroups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Member {

    @SerializedName("$elemMatch")
    @Expose
    private Match $elemMatch;

    public Match get$elemMatch() {
        return $elemMatch;
    }

    public void set$elemMatch(Match $elemMatch) {
        this.$elemMatch = $elemMatch;
    }
}
