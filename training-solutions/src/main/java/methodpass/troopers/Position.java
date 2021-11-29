package methodpass.troopers;

public class Position {

    private double posX;
    private double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position){
        if (position == null){
            throw new IllegalArgumentException("The  position is null!");
        }else {
            double dx2 = Math.pow(posX - position.getPosX(), 2);
            double dy2 = Math.pow(posY - position.getPosY(), 2);
            return Math.sqrt(dx2 + dy2);
        }
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
