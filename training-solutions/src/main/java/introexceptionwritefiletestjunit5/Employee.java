package introexceptionwritefiletestjunit5;

public class Employee {
    private String name;
    private int yearOfBirth;

    public int getAge(int year){
        return year-yearOfBirth;
    }

    public Employee(String name, int yearOfBirth) {
        NameValidator nV = new NameValidator();
        yearOfBirthValidator yOBV = new yearOfBirthValidator();
        if (nV.isNameValid(name) && yOBV.isYearOfBirthValid(yearOfBirth)) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
