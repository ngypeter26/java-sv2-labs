package interfacestaticmethods.vehicle;

public interface Vehicle {

    static Vehicle of(int numberOfWheels){
        if (numberOfWheels ==2){
            return new Bicycle();
        }else if(numberOfWheels ==4){
            return new Car();
        }else{
            throw new IllegalArgumentException("This is neither a bicycle nor a car.");
        }
    }

}
