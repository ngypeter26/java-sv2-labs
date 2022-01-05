package interfaces.animal;

public class Lion implements Animal{
    private final String name = "Lion";
    private final int numberofLegs = 4;
    @Override
    public int getNumberofLegs() {
        return numberofLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
