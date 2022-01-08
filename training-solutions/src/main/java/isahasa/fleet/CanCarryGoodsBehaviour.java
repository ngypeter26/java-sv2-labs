package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods{
    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight){
        int loadWeight = Math.min(cargoWeight,maxCargoWeight-this.cargoWeight);
        this.cargoWeight += loadWeight;
        return cargoWeight - loadWeight;
    }
}
