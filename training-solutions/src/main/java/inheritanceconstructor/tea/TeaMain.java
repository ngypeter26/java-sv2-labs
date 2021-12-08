package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("valami",1000);
        System.out.println(tea.getName());
        System.out.println(tea.getPrice());

        HerbalTea herbalTea = new HerbalTea("valami2",4000);
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());

//        HerbalTea herbalTea2 = (HerbalTea) new Tea("rsra",20);
//        System.out.println(herbalTea2.getName());
//        System.out.println(herbalTea2.getPrice());

    }
}
