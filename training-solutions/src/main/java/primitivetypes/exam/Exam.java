package primitivetypes.exam;

import java.util.List;
import java.util.ArrayList;

public class Exam {
    private List<Person> personList = new ArrayList<>();;

    public List<Person> getPersonList() {
        return personList;
    }

    public void addPerson(Person person){
        personList.add(person);
    }
}
