package inheritancemethods.cars;

public class Jeep extends Car{
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel){
        double fuelConsummptionExtra = Math.min(-fuel,extraFuel);  // pozitív
        double fuelConsummptionTank = -fuel - fuelConsummptionExtra; //
        extraFuel-=fuelConsummptionExtra;
        super.modifyFuelAmount(-fuelConsummptionTank);
    }
    @Override
    public void drive(int km){
        double fuelConsumption = -km*super.getFuelRate()/100.0;
        if (!isEnoughFuel(fuelConsumption)){
            throw new IllegalArgumentException("Not enough fuel available!");
        }else{
            modifyFuelAmount(fuelConsumption);
        }
    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!

    @Override
    public double calculateRefillAmount(){
        return super.getTankCapacity()+extraCapacity - super.getFuel() - extraFuel;
    } //kiszámolja, mennyit lehet tankolni

    @Override
    public boolean isEnoughFuel(double fuelConsumption) {
        double requiredFuel = -fuelConsumption;
        double actualFuel = super.getFuel() + extraFuel;
        return actualFuel >= requiredFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
