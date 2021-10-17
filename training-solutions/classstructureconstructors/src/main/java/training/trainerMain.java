package training;

public class trainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("John doe", 1980);

        System.out.println(trainer.getName());
        System.out.println(trainer.getYearOfBirth());

        Trainer anotherTrainer = new Trainer("Jack doe", 1981);
        System.out.println(anotherTrainer.getName());
        System.out.println(anotherTrainer.getYearOfBirth());


    }
}
