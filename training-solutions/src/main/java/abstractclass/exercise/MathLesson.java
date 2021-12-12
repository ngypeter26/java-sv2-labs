package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise adder = new Adder();
        MathExercise subtracter = new Subtracter();
        MathExercise multiplier = new Multiplier();
        MathExercise divider = new Divisor();

        System.out.println(adder.getSolution(10,2));
        System.out.println(subtracter.getSolution(10,2));
        System.out.println(multiplier.getSolution(10,2));
        System.out.println(divider.getSolution(10,2));

    }
}
