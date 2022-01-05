package interfaces.video;

public class TrainerMain {
    public static void main(String[] args) {
//        Trainer trainer = new Trainer();
//        Human human = trainer;

       // Human human = new Trainer(); a hasname után már nem működik

        HasName trainer = new Trainer();
        trainer.getName();
//        trainer.getYear....   ez nem működik, mert a hasname-ben nincs benne

        HasName course = new Course();




    }
}
