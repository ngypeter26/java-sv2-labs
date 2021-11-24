package algorithmssum;

import java.util.List;

public class AgeSumCalculator {
    public int suMAges(List<Trainer> trainers){
        int sum = 0;
        for (Trainer trainer : trainers){
            sum += trainer.getAge();
        }
        return sum;
    }
}
