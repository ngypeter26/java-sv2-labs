package interfaces.animal;

public class Duck implements Animal{
    private final String name = "Duck";
    private final int numberofLegs = 2;
    @Override
    public int getNumberofLegs() {
        return numberofLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
