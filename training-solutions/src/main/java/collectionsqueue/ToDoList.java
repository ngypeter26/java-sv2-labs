package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos =new ArrayList<>();

    public void addToDo(ToDo todo){
        todos.add(todo);
    }

    public Deque<ToDo> getTodosInUrgencyOrder(){
        ArrayDeque<ToDo> todosInUrgencyOrder = new ArrayDeque<>();

        for (ToDo td : todos){
            if (td.isUrgent()){
                todosInUrgencyOrder.addFirst(td);
            }else{
                todosInUrgencyOrder.addLast(td);
            }
        }
        return todosInUrgencyOrder;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo(new ToDo("kenyeret venni", false));
        toDoList.addToDo(new ToDo("varrónő", true));
        toDoList.addToDo(new ToDo("gyereknek télikabát", false));
        toDoList.addToDo(new ToDo("autó olajcsere", true));

        Deque<ToDo> result = toDoList.getTodosInUrgencyOrder();
        System.out.println(result);
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
    }

}
