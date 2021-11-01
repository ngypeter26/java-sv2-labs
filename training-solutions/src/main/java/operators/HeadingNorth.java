package operators;

public class HeadingNorth {
    int getNumberOfNewDirections() {
        int position = 0;
        int NumberOfNewDirections = 0;
        position += 10;
        NumberOfNewDirections += 1;
        position += 20;
        NumberOfNewDirections += 1;

        while (position < 360) {
            position += 10;
            NumberOfNewDirections += 1;
        }
        return NumberOfNewDirections;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println("NumberOfNewDirections: " + headingNorth.getNumberOfNewDirections());
    }
}
