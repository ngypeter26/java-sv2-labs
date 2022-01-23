package sorting;

import java.util.Collections;
import java.util.List;

public class MedicalSurgery {

    private List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Patient> getPatientsInTimeOrder(){
        List<Patient> sorted = patients;
        sorted.sort(new PatientComparator());
        return sorted;
    }
}
