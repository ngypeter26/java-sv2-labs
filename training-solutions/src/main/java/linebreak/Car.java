package linebreak;

public class Car {
    public String getBrandAndTypeInSeparateLines(String brand, String type){
        return brand + "\n" + type;
    }
    public static void main(String[] args) {

        Car car = new Car();

        String valami = car.getBrandAndTypeInSeparateLines("Opel","Astra");
        System.out.println(valami);
    }


}
