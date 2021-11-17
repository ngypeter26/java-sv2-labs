package introexceptionthrowjunit4;

public class Tank {
    private int angle;

    void modifyAngle(int angleNumber){
        angle += angleNumber;
        if (angle<0 || angle > 80){
            throw new IllegalArgumentException("Ide nem tud forogni");
        }
    }

}
