package trainerapp;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer(); //Trainer objektum példányosítása (new Trainer())
        trainer.name = "Joe Doe";
        trainer.yearOfBirth = 1980;

        System.out.println(trainer.name );
        System.out.println(trainer.yearOfBirth );

        Trainer anotherTrainer = new Trainer();//másik Trainer objektum példányosítása
        anotherTrainer.name = "Jack Doe";

    }
}
