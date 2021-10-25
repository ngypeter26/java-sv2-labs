package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circleCalculator = new CircleCalculator();
        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();

        double r = 9.5;
        double h = 2.2;

        System.out.println("A PI értéke: " + circleCalculator.PI);
        System.out.println("A kör területe: " + circleCalculator.calculateArea(r));
        System.out.println("A kör kerülete: " + circleCalculator.calculatePerimeter(r));
        System.out.println("A henger területe: " + cylinderCalculator.calculateVolume(r,h));
        System.out.println("A henger felülete: " + cylinderCalculator.calculateSurfaceArea(r,h));
        System.out.println("A henger területe: " + cylinderCalculatorBasedOnCircle.calculateVolume(r,h));
        System.out.println("A henger felülete: " + cylinderCalculatorBasedOnCircle.calculateSurfaceArea(r,h));
    }
}
