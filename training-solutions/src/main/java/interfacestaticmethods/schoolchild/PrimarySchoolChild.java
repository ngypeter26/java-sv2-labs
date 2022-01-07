package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {

    static PrimarySchoolChild of(int age){
        if (6<=age && age <=10){
            return new LowerClassSchoolChild();
        }else if (11<=age && age <=14){
            return new UpperClassSchoolChild();
        }else{
            throw new IllegalArgumentException("It's not a schoolchild with this age!");
        }
    }

}
