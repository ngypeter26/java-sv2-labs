package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine{
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> vaccineNotNeeded = new ArrayList<>();
        for (Person p : registrated){
            if (p.isPregnant() == Pregnancy.YES || p.hasChronic()==ChronicDisease.YES){
                vaccineNotNeeded.add(p);
            }
        }
        registrated.removeAll(vaccineNotNeeded);
        for (Person p : registrated){
            if (p.getAge()<=65){
                vaccinationList.add(p);
                vaccineNotNeeded.add(p);
            }
        }
        registrated.removeAll(vaccineNotNeeded);
        for (Person p : registrated){
            vaccinationList.add(p);
            vaccineNotNeeded.add(p);
        }
        registrated.removeAll(vaccineNotNeeded);
    }
}
