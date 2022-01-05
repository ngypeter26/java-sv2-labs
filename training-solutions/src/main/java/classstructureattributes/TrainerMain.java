package classstructureattributes;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer(); //interfaces.video.Trainer objektum példányosítása (new interfaces.video.Trainer())
        trainer.name = "Joe Doe";
        trainer.yearOfBirth = 1980;

        System.out.println(trainer.name );
        System.out.println(trainer.yearOfBirth );

        Trainer anotherTrainer = new Trainer();//másik interfaces.video.Trainer objektum példányosítása
        anotherTrainer.name = "Jack Doe";

    }
}
