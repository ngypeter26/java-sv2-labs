package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;
//
//
    public SimpleTime(int hours, int minutes){
        this.hours=hours;
        this.minutes = minutes;
    }
    public SimpleTime(int hours){
        this.hours=hours;
        this.minutes = 0;
    }
    public SimpleTime(SimpleTime time){
        this.hours=time.getHours();
        this.minutes = time.getMinutes();
    }

    public int getDifference(SimpleTime time){
        return (hours - time.getHours())*60 - time.getMinutes() + minutes;

    }
    public String toString(){
        return hours + ":" + minutes;
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
