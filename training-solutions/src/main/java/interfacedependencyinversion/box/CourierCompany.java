package interfacedependencyinversion.box;

public class CourierCompany {
    public static void main(String[] args) {
        Box boxS = new SmallBox();
        Box boxM = new MediumBox();
        Box boxL = new LargeBox();
        Box boxXL = new ExtraLargeBox();
        System.out.println(boxS.getSize());
        System.out.println(boxS.getPrice());

        System.out.println(boxM.getSize());
        System.out.println(boxM.getPrice());
        System.out.println(boxL.getSize());
        System.out.println(boxL.getPrice());
        System.out.println(boxXL.getSize());
        System.out.println(boxXL.getPrice());
    }
}
