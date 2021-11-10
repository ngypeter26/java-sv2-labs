package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private List<Hour> hoursOfDay = new ArrayList<>();

    public void addHour(Hour hour){
        hoursOfDay.add(hour);
    }

    public void setDayPeriod(){
        for (Hour i : hoursOfDay){
            if (i.getHourNumber()>6 && i.getHourNumber()<22) {
                i.setPeriod(DayPeriod.DAYTIME);
            }else{
                i.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }
}
