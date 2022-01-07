package interfacestaticmethods.vehicle;

public class Bicycle implements Vehicle{
    private int numberOfWheels;

    public Bicycle() {
        this.numberOfWheels = 2;
    }
    public Bicycle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
