package algorithmsdecision.trainers;

import java.util.List;


public class TrainerDecisionMaker {
    public boolean containElderThan(List<Trainer> trainers, int min){
        for (Trainer trainer : trainers){
            if (trainer.getAge()>min){
                return true;
            }
        }
        return false;
    }

}
