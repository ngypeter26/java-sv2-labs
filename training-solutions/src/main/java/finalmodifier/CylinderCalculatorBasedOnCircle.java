package finalmodifier;


public class CylinderCalculatorBasedOnCircle {
    double calculateVolume(double r,double h){
        return new CircleCalculator().calculateArea(r) * h;
    }

    double calculateSurfaceArea(double r,double h){
        return new CircleCalculator().calculatePerimeter(r) * h + 2 * new CircleCalculator().calculateArea(r);
    }
}
