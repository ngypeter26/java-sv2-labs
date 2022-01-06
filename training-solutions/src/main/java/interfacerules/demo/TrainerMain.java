package interfacerules.demo;

public class TrainerMain {
    public static void main(String[] args) {
        HasName hasName = new Trainer();

        CanWork canWork = new Trainer();
//        HasName hasName1 = new HasName(); ez nem működik

        canWork.doWork();
        hasName.getName();

        System.out.println(EmployeeType.FULL_TIME);

    }
}
