package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Jack", "12354IA");
        Address address = new Address("Hungary","Makó","Fő út","6900");

        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());  // person.getAddress addres típusú változó, ezten belül van a tostring metódus

        person.correctData("Jill","15687BA");
        person.getAddress().correctData("Hungary","Budapest","Ráday","1524");

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        Address newAddress = new Address("Hungary", "Szeged", "Kárász u ",  "6700");
        person.moveTo(newAddress);

        System.out.println(person.getAddress().addressToString());
    }
}
