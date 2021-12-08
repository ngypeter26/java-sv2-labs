package dynamictypes;

public class DynamicTypesMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe");
        Human human = new Trainer("John Doe");

        System.out.println(trainer.getDescription());
        System.out.println(human.getDescription());

        Trainer trainerNew = new Trainer("John Doe");
        Human human1 = trainerNew;

        System.out.println(trainerNew.getDescription());
        System.out.println(human1.getDescription());

        Human human2 = new Human("John Doe");
        System.out.println(human2.getDescription());
        human2 = new Trainer("John Doe");
        System.out.println(human2.getDescription());

    }

}
