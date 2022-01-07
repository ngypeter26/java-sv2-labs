package interfacestaticmethods.vehicle;

public class Car implements Vehicle{


    private String brand;
    private int numberOfWheels;

    public Car(String brand, int numberOfWheels) {
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String brand) {
        this.brand = brand;
        this.numberOfWheels = 4;
    }
    public Car() {
        this.brand = "brand";
        this.numberOfWheels = 4;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
