package statements;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public Time( int hours,int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
        this.hours = hours;
    }

    public int getInMinutes() {
        return minutes + 60 * hours;
    }

    public int getInSeconds() {
        return seconds + 60*minutes + 3600 * hours ;
    }

    public boolean earlierThan(Time otherTime) {
        int actualTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = otherTime.getInSeconds();
        return actualTimeInSeconds < otherTimeInSeconds;
    }

    public String toString() {
        return hours +  ":" + minutes +  ":"  + seconds;
    }


}
