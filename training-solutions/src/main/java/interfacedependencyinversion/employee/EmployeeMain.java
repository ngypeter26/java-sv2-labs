package interfacedependencyinversion.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1000,new FixedBonusCalculator() );
        System.out.println(employee.getBonus());

        Employee employee2 = new Employee(1000,new PercentBonusCalculator() );
        System.out.println(employee2.getBonus());
    }


}
