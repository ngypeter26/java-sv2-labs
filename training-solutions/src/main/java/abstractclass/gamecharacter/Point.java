package abstractclass.gamecharacter;

final class Point {
    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
    public long getDistance(Point otherPoint) {
        System.out.println(otherPoint.getX());
        System.out.println(otherPoint.getY());
        System.out.println(x);
        System.out.println(y);
        System.out.println((x-otherPoint.getX()));
        System.out.println(Math.sqrt((x-otherPoint.getX())^2 + (getY()-otherPoint.getY())^2));
        System.out.println(Math.sqrt((getX()-otherPoint.getX())^2 + (getY()-otherPoint.getY())^2));
        return (long) Math.sqrt(Math.pow(x-otherPoint.getX(),2) +Math.pow (y-otherPoint.getY(),2));
    }
}
