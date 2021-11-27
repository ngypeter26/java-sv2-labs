package algorithmstransformation.family;

public class FamilyMember {
    private String name;
    private int age;

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }
}
