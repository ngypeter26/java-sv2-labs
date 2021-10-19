package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(10.2,false);


        int approximateDistance;
        approximateDistance = (int) distance.getDistanceInKm();

        System.out.println("exact: " + distance.getDistanceInKm());
        System.out.println("exact: " + approximateDistance);


    }
}
