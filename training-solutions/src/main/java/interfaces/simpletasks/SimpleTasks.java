package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable{
    private List<String> tasks = new ArrayList<>();

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while(nextStep()){
            System.out.println(tasks);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep(){
        tasks.remove(tasks.size()-1);
        return tasks.size()>0;
    }
}
