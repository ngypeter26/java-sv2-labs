package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Not valid name");
        }
        if (socialSecurityNumber.length() != 6){
            throw new IllegalArgumentException("TAY number must contains 6 digits");
        }
        if (yearOfBirth < 1900){
            throw new IllegalArgumentException("You are too old!");
        }

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
//        String name = null;
//        String name = "";
        String name = "John Doe";

        String socialSecurityNumber = "123456";
//        String socialSecurityNumber = "12345";
//        String socialSecurityNumber = "1234567";

//        int yearOfBirth = 1899;
//        int yearOfBirth = 1901;
        int yearOfBirth = 2000;

        Patient patient = new Patient(name, socialSecurityNumber, yearOfBirth);


    }
}
