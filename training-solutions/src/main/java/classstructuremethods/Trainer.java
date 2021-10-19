package classstructuremethods;

public class Trainer {
    private String name;

    private int yearOfBirth;

    public String getNameAndYearOfBirth(){      // getter, nincs paraméter, van kimenet
        return name + ": " + yearOfBirth;
    }

    public int getAge(int year) {
        return year - yearOfBirth;
    }

    public void changeName(String name){        //setter, van paraméter, nincs kimenet
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
}
