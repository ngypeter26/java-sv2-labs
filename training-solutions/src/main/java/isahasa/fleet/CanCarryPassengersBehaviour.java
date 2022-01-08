package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers  {
    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int load = Math.min(passengers,maxPassengers);
        System.out.println(load);
        this.passengers +=  load;
        return passengers - load;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
