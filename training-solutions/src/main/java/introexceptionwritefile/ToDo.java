package introexceptionwritefile;

import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ToDo {
    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        String actTodo = "";

        while (!("x".equals(actTodo.toLowerCase()))){
            actTodo = toDo.getData();
        }


        String fileName = "src/main/java/introexceptionwritefile/toDoList.txt";
        try {
            System.out.println(toDo.getToDoList());
            Files.write(Paths.get(fileName),toDo.getToDoList());
        }catch (IOException ioe){
            System.out.println("Nem sikerült a mentés ");
            ioe.printStackTrace();
        }


    }

    private List<String> toDoList = new ArrayList<>();

    public String getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a következő feladatot! Ha végeztél, nyomj x-et!");
        String actTodo = scanner.nextLine();
        if (!("x".equals(actTodo.toLowerCase()))){
            addToDo(actTodo);
        }
        return actTodo;
    }

    public void addToDo(String toDo) {
        toDoList.add(toDo);
    }
    public List<String> getToDoList() {
        return toDoList;
    }
}
