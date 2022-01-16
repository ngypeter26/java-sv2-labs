package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {
    private List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return this.lessons;
    }

    public void addNewLesson(OnlineLesson lesson){
        int numberOfAfter = 0;
        Iterator<OnlineLesson> it = lessons.iterator();
        while(it.hasNext()){
            OnlineLesson actual = it.next();
            if(actual.getStartTime().isAfter(lesson.getStartTime())){
                numberOfAfter++;
            }
        }
        lessons.add(lessons.size()-numberOfAfter,lesson);
    }
    public List<OnlineLesson> getLessonsByTitle(String title){
        List<OnlineLesson> onlineLessons = new ArrayList<>();
        Iterator<OnlineLesson> it = lessons.iterator();
        while(it.hasNext()){
            OnlineLesson actual = it.next();
            if (actual.getLessonTitle().equals(title)){
                onlineLessons.add(actual);
            }
        }
        return onlineLessons;
    }

    public void removeLesson(LocalDateTime startTime){
        for (Iterator<OnlineLesson> it = lessons.iterator();it.hasNext();){
            OnlineLesson actual = it.next();
            if (actual.getStartTime().equals(startTime)){
                System.out.println(actual);
                lessons.remove(actual);
            }
        }
    }
}
