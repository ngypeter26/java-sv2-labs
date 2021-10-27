package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Bp","1112","Fehérvári", 12);
        Details details = new Details("nagyon menő",address,50,4 );
        RealEstate realEstate = new RealEstate("Ékszerdoboz",20000000,details);

        System.out.println(realEstate.toString());
        System.out.println();
        System.out.println(realEstate.getDetails().toString());
        System.out.println();
        System.out.println(realEstate.getDetails().getAddress().toString());
    }
}
