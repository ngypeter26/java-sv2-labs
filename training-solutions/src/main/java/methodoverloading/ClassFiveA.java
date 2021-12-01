package methodoverloading;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClassFiveA {
    private List<String> names = new ArrayList<>();


    public void addClassMember(String name){
        names.add(name);
    }


    public String getTodayReferringStudent(int number){
        return names.get(number-1);
    }
    public String getTodayReferringStudent(Number number){
        return names.get(number.getValue()-1);
    }
    public String getTodayReferringStudent(String numberName){
        return names.get(Number.valueOf(numberName.toUpperCase()).getValue()-1);
    }


}
