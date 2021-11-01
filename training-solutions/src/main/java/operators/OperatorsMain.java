package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(Integer.toBinaryString(a));

        Operators operators = new Operators();

        System.out.println("Even: " +  operators.isEven(a));
        System.out.println("Osztás eredménye: " +  operators.getResultOfDivision(16,3));

        String s1 = "";   // empty
        String s2 = null;   // null
        String s3 = "valami";   // null

        System.out.println("Null-e \"" + s1 + "\" "+ operators.isNull( s1 ));
        System.out.println("Null-e \"" + s2 + "\" "+ operators.isNull( s2 ));
        System.out.println("Null-e \"" + s3 + "\" "+ operators.isNull( s3 ));

        System.out.println("Epty-e \"" + s1 + "\" "+ operators.isEmpty( s1 ));
        System.out.println("Epty-e \"" + s2 + "\" "+ operators.isEmpty( s2 ));
        System.out.println("Epty-e \"" + s3 + "\" "+ operators.isEmpty( s3 ));



    }

}
