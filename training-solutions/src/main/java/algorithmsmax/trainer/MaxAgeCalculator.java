package algorithmsmax.trainer;

import java.util.List;
public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers){
        Trainer oldestTrainer = trainers.get(0);

        for (Trainer trainer : trainers){
            if (trainer.getAge()>oldestTrainer.getAge()){
                oldestTrainer = trainer;
            }
        }
        return oldestTrainer;
    }


}
