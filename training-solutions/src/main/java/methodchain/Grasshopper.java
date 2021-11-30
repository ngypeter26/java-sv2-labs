package methodchain;

public class Grasshopper {
    private int position = 0;

    public Grasshopper hopOnce(Direction direction){
        this.position = position + direction.getStep();
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops(){
        hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE).hopOnce(Direction.NEGATIVE);
    }

    public int getPosition() {
        return position;
    }
}
