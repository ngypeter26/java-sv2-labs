package conventions;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("Opel Astra","A20DTH ",5,5);

        String newLine = System.lineSeparator();

        System.out.println("car type: " + car.getCarType()  + newLine +
                "engine type: " + car.getEngineType()  + newLine +
                "number of doors: " + car.getDoors()  + newLine +
                "number of persons: " + car.getPersons());
        car.setCarType("Skoda Fabia");
        System.out.println("car type: " + car.getCarType()  + newLine +
                "engine type: " + car.getEngineType()  + newLine +
                "number of doors: " + car.getDoors()  + newLine +
                "number of persons: " + car.getPersons());
    }
}
