package streamsalgorithms;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe",1980));
        employees.add(new Employee("Jack Doe",1958));
        employees.add(new Employee("Jane Doe",1999));
        employees.add(new Employee("Kiss Pista",2002));
        employees.add(new Employee("Nagy Jóska",1972));
        employees.add(new Employee("Barba Negra",1918));

        int sumYears = employees.stream().mapToInt(Employee::getYearOfBirth).sum();
        int sumAge = employees.stream().mapToInt(employee -> 2022- employee.getYearOfBirth()).sum();
        long numberOfEmployees = employees.stream().mapToInt(employee -> 1).count();
        long numberOfOlds = employees.stream().mapToInt(employee -> employee.getYearOfBirth()).filter(age -> age<1990).count();
        int smallesYear = employees.stream().mapToInt(employee -> employee.getYearOfBirth()).min().orElseThrow(()-> new IllegalArgumentException("Empty"));
        String oldestName = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getYearOfBirth()-o2.getYearOfBirth();
            }
        }).map(employee -> employee.getName()).findFirst().orElseThrow(()-> new IllegalArgumentException("Empty"));;

        boolean allBefore = employees.stream().mapToInt(employee -> employee.getYearOfBirth()).filter(year -> year>1980).count()==0;
        boolean allBefore2 = employees.stream().allMatch(employee -> employee.getYearOfBirth()<1980);
        System.out.println(allBefore2);

        List<Employee> employees1 = employees.stream().filter(employee -> employee.getYearOfBirth()<1990).collect(Collectors.toList());
        List<String> names = employees.stream().filter(employee -> employee.getYearOfBirth()<1990).map(employee -> employee.getName()).collect(Collectors.toList());
        List<String> allNames = employees.stream().map(employee -> employee.getName()).collect(Collectors.toList());


        System.out.println(sumYears);
        System.out.println(sumAge);
        System.out.println(numberOfEmployees);
        System.out.println(numberOfOlds);
        System.out.println(smallesYear);
        System.out.println(oldestName);
        System.out.println(numberOfOlds);

    }
}
