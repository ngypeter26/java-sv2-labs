package clone.timesheet;

import statements.Time;

import java.time.LocalDateTime;

public class TimeSheetItem {
    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }
    public TimeSheetItem(TimeSheetItem timeSheetItem) {
        this.employee =timeSheetItem.employee;
        this.project = timeSheetItem.project;
        this.from = timeSheetItem.from;
        this.to = timeSheetItem.to;
    }

    public TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem, String newEmployee){
        TimeSheetItem tsi = new TimeSheetItem(timeSheetItem);
        tsi.setEmployee(newEmployee);
        return tsi;
    }
    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
