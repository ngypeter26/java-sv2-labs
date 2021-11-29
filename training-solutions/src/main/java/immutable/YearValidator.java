package immutable;

import java.time.LocalDate;

public class YearValidator {
    public boolean isYearValid(int year){
        int actualYear = LocalDate.now().getYear();
        if (year > actualYear){
            throw new IllegalArgumentException("Invalid year");
        }else {
            return true;
        }
    }
}
