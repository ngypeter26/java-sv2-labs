package methodchain;

public enum  Direction {
    POSITIVE(1),NEGATIVE(-1);

    private final int step;

    Direction(int step) {
        this.step = step;
    }

    public int getStep() {
        return step;
    }
}
