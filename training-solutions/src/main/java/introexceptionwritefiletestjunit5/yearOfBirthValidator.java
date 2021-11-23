package introexceptionwritefiletestjunit5;

import java.time.LocalDate;

public class yearOfBirthValidator {
    public boolean isYearOfBirthValid(int yearOfBirth){
        if((LocalDate.now().getYear() - yearOfBirth)<120){
            return true;
        }else{
            throw new IllegalArgumentException("Year is invalid");
        }
    }
}
