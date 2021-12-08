package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school1 = new School("Suli",12);
        School school2 = new PrimarySchool("Suli",8);
        School school3 = new SecondarySchool("Suli",4);

        System.out.println(school1);
        System.out.println(school2);
        System.out.println(school3);

    }
}
