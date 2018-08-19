package app.orbitahealth.sdk;

import java.util.ArrayList;


public class Assignee {

    private ArrayList<MemberType>  member;

    public ArrayList<MemberType> getMember() {
        return member;
    }

    public void setMember(ArrayList<MemberType> member) {
        this.member = member;
    }
    public void addMember(MemberType memberType) {
        if (null == member) {
            member = new ArrayList<>();
        }
        if (null == memberType)
            return;
        member.add(memberType);
    }

    public void deleteMember(MemberType memberType) {
        if (null == member || memberType == null || !member.contains(memberType)) {
            return;
        }
        member.remove(memberType);
    }
}
