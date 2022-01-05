package interfaces.animalAbstract;

public  abstract class Animal {
    private String name;
    private int numberofLegs;

    public Animal(String name, int numberofLegs) {
        this.name = name;
        this.numberofLegs = numberofLegs;
    }

    public int getNumberofLegs() {
        return numberofLegs;
    }

    public String getName() {
        return name;
    }

}
