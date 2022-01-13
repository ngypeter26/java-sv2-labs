package collectionsset;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuestionGame {
    List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners(){

        HashSet<String> winners = new HashSet<>();
        Random random = new Random();
        int index;
        while (winners.size()<5){
            if (rightAnswers.size() == 0) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            index = random.nextInt(rightAnswers.size());
            winners.add(rightAnswers.get(index).getName());
            rightAnswers.remove(rightAnswers.get(index));
        }
        return winners;
    }
}
