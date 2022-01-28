package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {
    private List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<ExamResult> getExamResults() {
        return new ArrayList<>(examResults);
    }

    public List<String> getNamesOfSucceededPeople(int places){
        List<ExamResult> examResultsOrder = examResults;
        Collections.sort(examResultsOrder, new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return o1.getPoints()-o2.getPoints();
            }
        });
        Collections.reverse(examResultsOrder);
        if (places > examResultsOrder.size()){
            places = examResultsOrder.size();
        }
        List<String> names = new ArrayList<>();
        for (int i = 0; i < places; i++) {
            names.add(examResultsOrder.get(i).getNameOfPerson());
        }
        return names;

    }
}
