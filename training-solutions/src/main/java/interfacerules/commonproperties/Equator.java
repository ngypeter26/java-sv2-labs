package interfacerules.commonproperties;

public class Equator implements Length, Name{
    private static final String NAME = "Equator";
    private static final double LENGTH = 40075;

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
