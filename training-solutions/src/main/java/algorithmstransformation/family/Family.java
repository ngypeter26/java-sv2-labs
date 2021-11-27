package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> family;

    public Family() {
        this.family = new ArrayList<>();
    }

    public List<FamilyMember> getFamily() {
        return family;
    }
    public void addFamilyMember(FamilyMember familyMember){
        family.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String firstName){
        List<Integer> ages = new ArrayList<>();
        for (FamilyMember familyMember : family){
            if (familyMember.getName().contains(firstName)){
                ages.add(familyMember.getAge());
            }
        }
        return ages;
    }
}
