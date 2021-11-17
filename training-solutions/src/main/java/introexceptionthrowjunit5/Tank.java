package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    void modifyAngle(int angleNumber){
        angle += angleNumber;
        if (angle<0 ){
            throw new IllegalArgumentException("Bal oldalt ütközik");
        }else if  (angle > 80){
            throw new IllegalArgumentException("Jobb oldalt ütközik");
        }

    }

    public int getAngle() {
        return angle;
    }
}
