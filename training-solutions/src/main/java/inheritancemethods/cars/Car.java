package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel+=fuel;
    }
    public void drive(int km){
        double fuelConsumption = -km*fuelRate/100.0;
        if (!isEnoughFuel(fuelConsumption)){
            throw new IllegalArgumentException("Not enough fuel available!");
        }else{
            modifyFuelAmount(fuelConsumption);
        }
    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
    public double calculateRefillAmount(){
        return tankCapacity - fuel;
    } //kiszámolja, mennyit lehet tankolni

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public boolean isEnoughFuel(double fuelConsumption){
        double requiredFuel = -fuelConsumption ;
        double actualFuel = fuel;
        return actualFuel >= requiredFuel;
    }


}
