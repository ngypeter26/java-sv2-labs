package algorithmscount.trainers;

import algorithmssum.Trainer;

import java.util.List;

public class AgeConditionCounter {
    public int countElderly(List<algorithmssum.Trainer> trainers, int minAge){
        int count = 0;
        for (Trainer trainer : trainers){
            if (trainer.getAge() >= minAge)
                count++;
        }
        return count;
    }
}
