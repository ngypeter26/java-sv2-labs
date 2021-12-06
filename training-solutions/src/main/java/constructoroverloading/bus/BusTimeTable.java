package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable){
        this.timeTable = timeTable;
    }
    public BusTimeTable(int firstHour, int lastHour, int everyMinute){
        List<SimpleTime> timeTable = new ArrayList<>();
        int minutes = everyMinute;

        for (int hours = firstHour; hours < lastHour; hours++){
            while (minutes < 60){
                timeTable.add(new SimpleTime(hours, minutes));
                minutes += everyMinute;
            }
            minutes = minutes%60;
        }
        this.timeTable = timeTable;
    }

    public List<SimpleTime> getTimeTable(){
        return timeTable;
    }
    public SimpleTime getNextBus(SimpleTime actual){
        for (SimpleTime time : timeTable){
            if (time.getDifference(actual)>0){
                return time;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }

}
