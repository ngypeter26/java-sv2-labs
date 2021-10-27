package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {
    public static void main(String[] args) {

        LocalDate startTime = LocalDate.of(2022, 10, 26);

        CyclingTour tour = new CyclingTour("Biciklitúra",startTime);

        System.out.println("Leírás: " + tour.getDescription());
        System.out.println("Kezdés: " + tour.getStartTime());
        System.out.println("Létszám: " + tour.getNumberOfPeople());
        System.out.println("Km: " + tour.getKms());

        tour.setKms(10.5);
        tour.setNumberOfPeople(10);

        System.out.println("Leírás: " + tour.getDescription());
        System.out.println("Kezdés: " + tour.getStartTime());
        System.out.println("Létszám: " + tour.getNumberOfPeople());
        System.out.println("Km: " + tour.getKms());
    }
}
