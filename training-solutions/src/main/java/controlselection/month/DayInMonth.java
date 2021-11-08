package controlselection.month;

import java.time.LocalDate;
import java.util.Locale;

public class DayInMonth {

    public int numberOfDays(int year, String month) {
        month = month.trim().toLowerCase();
        int output;
        switch (month) {
            case "január":
                output = 31;
                break;
            case "február":
                output = year%400 ==0 | !(year%4 ==0) ? 28 : 29;
                break;
            case "március":
                output = 31;
                break;
            case "április":
                output = 30;
                break;
            case "május":
                output = 31;
                break;
            case "június":
                output = 30;
                break;
            case "július":
                output = 31;
                break;
            case "augusztus":
                output = 31;
                break;
            case "szeptember":
                output = 30;
                break;
            case "október":
                output = 31;
                break;
            case "november":
                output = 30;
                break;
            case "december":
                output = 31;
                break;
            default:
                output = 0;
                System.out.println("nincs ilyen hónap");
        }
        return output;
    }
}


