package staticattrmeth.trainer;

public class Trainer {
    public static int numberOFTrainers;
    private String name;

    public Trainer(String name) {
        this.name = name;
        numberOFTrainers++;
    }

    public String getName() {
        return name;
    }
    public static int getNumberOFTrainers(){// statikus attributumhoz statikus metódus
        return numberOFTrainers;
    }
}
