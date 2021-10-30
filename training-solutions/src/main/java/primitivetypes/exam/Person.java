package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String personName;
    private LocalDate birthDay;
    private int postCode;
    private double averageDouble;

    public Person(String personName, LocalDate birthDay, int postCode, double averageDouble) {
        this.personName = personName;
        this.birthDay = birthDay;
        this.postCode = postCode;
        this.averageDouble = averageDouble;
    }

    public String getPersonName() {
        return personName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getpostCode() {
        return postCode;
    }

    public double getAverageDouble() {
        return averageDouble;
    }

    @Override
    public String toString() {
        return  "personName=" + personName + "\n" +
                "birthDay=" + birthDay  + "\n" +
                "postCode=" + postCode  + "\n" +
                "averageDouble=" + averageDouble;
    }
}
