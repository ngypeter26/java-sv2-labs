package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Kiss Béla",2020,400000);

        System.out.println(employee.toString());
        employee.raiseSalary(50000);
        System.out.println(employee.toString());

    }
}
