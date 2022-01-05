package interfaces.animal;

public class Worm implements Animal{
    private final String name = "Worm";
    private final int numberofLegs = 0;
    @Override
    public int getNumberofLegs() {
        return numberofLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}