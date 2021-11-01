package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    List<Flight> flights = new ArrayList<>();

   public void addFlight(Flight flight){
       flights.add(flight);
   }

    public String  getDeletedFlights(){
        StringBuilder sb = new StringBuilder();
        for (Flight i : flights){
//            System.out.println(i.getStatus());
//            System.out.println("DELETED".equals(i.getStatus().name()));
//            System.out.println(Status.valueOf("DELETED") == i.getStatus());
            if (Status.valueOf("DELETED") == i.getStatus()) {
                sb.append(i.getFlightNumber());
                sb.append("\n");
            }
        }
//        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        Flight flightToBombay = new Flight("B-2351", Status.DELETED);
        Flight flightToParis = new Flight("P-626783", Status.ACTIVE);
        Flight flightToFrankfurt = new Flight("F-24671", Status.ACTIVE);
        Flight flightToNewYork = new Flight("N-312561", Status.DELETED);
        Flight flightToSydney = new Flight("S-35", Status.DELETED);

        Airport airport = new Airport();
        airport.addFlight(flightToBombay);
        airport.addFlight(flightToParis);
        airport.addFlight(flightToFrankfurt);
        airport.addFlight(flightToNewYork);
        airport.addFlight(flightToSydney);

        String deletedFlights = airport.getDeletedFlights();

        System.out.println(deletedFlights);
    }
}
