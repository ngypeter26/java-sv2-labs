package enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {
        for (University i : University.values()){

            System.out.println(i.ordinal()+1 + ". egyetem: " +
                    i + " : " +
                    i.getName());
        }

    }
}
