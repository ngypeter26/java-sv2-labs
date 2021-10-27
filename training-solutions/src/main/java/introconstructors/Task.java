package introconstructors;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;


public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private Duration duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void start(){
        startDateTime = LocalDateTime.now();
    }

    public void setDuration(Duration duration) {
        this.duration = duration;

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public Duration getDuration() {
        return duration;
    }
}
