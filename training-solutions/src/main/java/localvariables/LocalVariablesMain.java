package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(b);
        b = false;
        System.out.println(b);

        int a = 1000_000_000;
        double d = 3.14;
        a = (int) d;
        System.out.println(a);

      //  System.out.println(i); nem sikerül

        int i = 3;
        int j = 4;
        int k = i;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        String s = null;

        {
            int x = 0;

            System.out.println(x);

            System.out.println(a);
        }
      //  System.out.println(x); ez nem sikerül

    }
}
