package exceptionclass.course;

import java.time.LocalTime;

public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        hourValidator(hour);
        minuteValidator(minute);
        this.hour = hour;
        this.minute = minute;
    }
    public SimpleTime(String timeString) {
        stringValidator(timeString);
        hourValidator(hour);
        minuteValidator(minute);
    }

    private void hourValidator(int hour){
        if (hour<0 || hour>23){
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
    }
    private void minuteValidator(int minute){
        if (minute<0 || minute>59){
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
    }

    private void stringValidator(String str){
        if (str ==null){
            throw new InvalidTimeException("Time is null");
        }

            String[] strArray = str.split(":");
//            if (strArray.length !=2 | strArray[1].length()!=2 | strArray[0].length()!=2){
//                throw new InvalidTimeException("Time is not hh:mm");
//            }
            try{
                hour =Integer.parseInt(strArray[0]);
                minute =Integer.parseInt(strArray[1]);
            }catch(NumberFormatException  | ArrayIndexOutOfBoundsException e){
                throw new InvalidTimeException("Time is not hh:mm");
            }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}
