package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private MarkType markType;
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark){
        if (mark == null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage(){
//        if (marks.size()<1){
//            throw new ArithmeticException("No marks present, average calculation aborted!");
//        }
        double sum = 0;
        double count = marks.size();
        for (Mark mark : marks){
            sum += mark.getMarkType().getMarkInt();
        }
        return  (double) Math.round(sum / count*100)/100;
    }
    public double calculateSubjectAverage(Subject subject){
        double sum = 0;
        double count = 0;
        for (Mark mark : marks){
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += mark.getMarkType().getMarkInt();
                count += 1;
            }
        }
//        if (count==0){
//            throw new ArithmeticException("No marks present, average calculation aborted!");
//        }
        return (double) Math.round(sum / count*100)/100;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " marks: ");
        for (Mark mark : marks){
            sb.append(mark.getSubject().getSubjectName());
            sb.append(": ");
            sb.append(mark.toString());
        }
        return sb.toString();
    }
}
