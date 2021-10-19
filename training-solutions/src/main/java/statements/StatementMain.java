package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x = 5 + 6;
        System.out.println(x);
        int y = 11 - x;
        System.out.println(y);
        int z = 8;
        System.out.println(z);

        boolean b = x > y;
        System.out.println(b);
        boolean c = b == true | z > 5;
        System.out.println(c);

        z +=  1;
        System.out.println(z);

        System.out.println("hello" + z  + "world");

        StatementMain s = new StatementMain();

        System.out.println("aaa".equals("aaa"));
        System.out.println("aaa".equals("aa"));


        System.out.println(x = 8);

        System.out.println(!(x%2 == 0));

        System.out.println(x%2 == 0 ? "páros" : "páratlan");
    }
}
