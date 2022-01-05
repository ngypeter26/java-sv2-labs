package classstructureconstructors;

public class Trainer {
    private String name;

    private int yearOfBirth;

    // kezdő érték adás, így minden trainernek ezek leszenk a kezdeti adatai
//    public interfaces.video.Trainer() {
//        name = "John Doe";
//        yearOfBirth = 1980;
//    }

    //konstruktor írás
//        public interfaces.video.Trainer(String name, int yearOfBirth) {
//        this.name = name;   // így a változós name and birth-re vonatkozik
//        this.yearOfBirth = yearOfBirth;
//        }


    public Trainer(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getNameAndYearOfBirth() {
        return name + " " + yearOfBirth;
    }

    public void changeName(String newName) {
        name = newName;
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