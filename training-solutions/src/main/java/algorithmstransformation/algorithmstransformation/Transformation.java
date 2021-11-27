package algorithmstransformation.algorithmstransformation;

import java.util.ArrayList;
import java.util.List;
public class Transformation {
    public List<String> toNames (List<Trainer> trainers){
        List<String> names = new ArrayList<>();
        for (Trainer trainer : trainers){
            names.add(trainer.getName());
        }
        return names;
    }

    public List<String> toNamesYearOfBirthBefore (List<Trainer> trainers,int year){
        List<String> names = new ArrayList<>();
        for (Trainer trainer : trainers){
            if (trainer.getYearOfBirth()<year) {
                names.add(trainer.getName());
            }
        }
        return names;
    }
}
