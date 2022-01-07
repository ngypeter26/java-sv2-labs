package virtualmethod.vehicle;

public class Van extends Car{
    private int cargoWeight;

    public Van(int numberOfPassenger, int vehicleWeight,  int cargoWeight ) {
        super(vehicleWeight, numberOfPassenger);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + cargoWeight;
    }

    @Override
    public String toString() {
        return "Van{cargoWeight=" + cargoWeight
                + ", numberOfPassenger=" + super.getNumberOfPassenger()
                + ", vehicleWeight=" + super.getVehicleWeight() + "}";
    }

    public int getCargoWeight() {
        return cargoWeight;
    }
}
