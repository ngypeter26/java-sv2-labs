package formatlocaleprintf;

public class PrintFTest {
    public static void main(String[] args) {
        System.out.printf("Hello %s!","Jack");

        String s = String.format("Hello %s and %s","Jack","Jill");
        System.out.println(s);

        String s1 = String.format("THe value is %d",500);
        System.out.println(s1);

    }
}
