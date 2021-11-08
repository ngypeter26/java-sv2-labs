package controlselection.week;

import java.util.Locale;

public class DayOfWeeks {

    public String weekDays(String day){
        String typeOfDay;
        switch (day.toLowerCase()) {
            case "hétfő":
                typeOfDay = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                typeOfDay="hét közepe";
                break;
            case "péntek":
                typeOfDay="majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                typeOfDay="hét vége";
                break;
            default:
                throw new IllegalArgumentException("Unknown day");
        }
            return typeOfDay;
    }

    public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();

        System.out.println(dayOfWeeks.weekDays("hétfő"));
        System.out.println(dayOfWeeks.weekDays("kedd"));
        System.out.println(dayOfWeeks.weekDays("szerda"));
        System.out.println(dayOfWeeks.weekDays("csütörtök"));
        System.out.println(dayOfWeeks.weekDays("péntek"));
        System.out.println(dayOfWeeks.weekDays("szombat"));
        System.out.println(dayOfWeeks.weekDays("vasárnap"));
    }
}
