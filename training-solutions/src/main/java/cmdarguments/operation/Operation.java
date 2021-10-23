package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (String arg : args){
            if ("/list".equals(arg)){
                System.out.println("Listázás");
            }
            else if ("/add".equals(arg)){
                System.out.println("Hozzáadás");
            }
            else if ("/delete".equals(arg)){
                System.out.println("Törlés");
            }
            else  {
                System.out.println("Ismeretlen művelet");
            }
        }
        ///  "/delete" /add "/list" valami
    }
}
