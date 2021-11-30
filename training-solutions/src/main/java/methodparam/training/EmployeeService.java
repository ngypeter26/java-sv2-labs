package methodparam.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {

//    public void createEmployee(String name, int yearOfBirth,boolean fullTime){ //ez nehezen olvasható
    public void createEmployee(String name, int yearOfBirth,EmployeeType employeeType){  //ez jobbabn olvasható
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid name");
        }
        if (yearOfBirth <1900 || yearOfBirth > 2021){
            throw new IllegalArgumentException("Invalid year");
        }
    }
//// Így csak név
//    public String findEmployee(String prefix, List<String> names){
//        for (int i = 0; i<names.size();i++){
//            if (names.get(i).startsWith(prefix)){
//                return names.get(i);
//            }
//        }
//        throw new IllegalArgumentException("Can not find employee");
//    }

    // Így index is
    public Result findEmployee(String prefix, List<String> names){
        for (int i = 0; i<names.size();i++){
            if (names.get(i).startsWith(prefix)){
                return new Result(names.get(i),i);
            }
        }
        throw new IllegalArgumentException("Can not find employee");
    }

    public List<String> listNames() {
//        return  Arrays.asList("John Doe","Jane Doe","Jack Doe");
        return  new ArrayList<>();
    }
}
