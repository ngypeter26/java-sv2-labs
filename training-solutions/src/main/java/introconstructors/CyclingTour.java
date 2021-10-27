package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person){
        numberOfPeople += person;
    }

    public void  ride(double km){
        kms += km;
    }


    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }
}
