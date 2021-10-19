package conventions;

public class Car {
    private String carType;
    private String engineType;
    private int doors;
    private int persons;

    public Car(String carType, String engineType, int doors, int persons){
        this.carType = carType;
        this.engineType = engineType;
        this.doors = doors;
        this.persons = persons;
    }

    public int getPersons() {
        return persons;
    }
    public String getCarType() {
        return carType;
    }

    public String getEngineType() {
        return engineType; }

    public void setCarType(String carType){
        this.carType = carType;
    }
    public int getDoors() {
        return doors;
    }

}
