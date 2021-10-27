package intromethods.registration;

import java.time.LocalDate;

public class Person {
    String name; LocalDate dateOfBirth; String email;

    public String createFullName(String lastName, String firstName){
        return lastName + firstName;
    }

    public LocalDate createDate (int year, int month, int day){
        return LocalDate.of(year,month,day);
    }
    @Override
    public String toString(){
        return "Név: " + this.name +"\n " +
                "Születési év: " + dateOfBirth +"\n " +
                "Email: "+ email;
    }

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }
}
