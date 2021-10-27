package composition.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public void moveTo(Address address) {
        this.address = address;
    }

    public String personToString(){
        return "Név: " + name + "\n" + "Azonosító: " + identificationCard + "\n" ;
    }

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public Address getAddress(){
        return address;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }
}
