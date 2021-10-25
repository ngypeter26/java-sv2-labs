package math.math;

public class MathMethods {
    public static void main(String[] args) {

        System.out.println(Math.max(2 , 5));
        System.out.println(Math.max(5 , 2 ));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));

        double a = 1.234;
        System.out.println(Math.abs(a));
        System.out.println(Math.negateExact(-10));
        System.out.println(Math.addExact(3,5));

        System.out.println(Math.subtractExact(2, 1));
        System.out.println(Math.multiplyExact(-2, 3));

        System.out.println(Math.pow(a, 12*a));

        System.out.println(Math.incrementExact(9));

        System.out.println(Math.decrementExact(12));

        System.out.println(Math.random());

    }
}
