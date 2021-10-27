package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {
        Person person = new Person("John Doe",21);
        Person newPerson = person;

        newPerson.setName("Jack Doe");

        System.out.println(person.getName());
        System.out.println(newPerson.getName());
        // A referenciát adta át, így ha az eredetri változott, változik a másik is
        // Nem állapotot hasonlít össze

        int a = 24;
        int b = a;
        b+=1;

        System.out.println("a=" + a);
        System.out.println("a=" + b);
        //a deklarálásnál különböző memória hely, kül memória, csak értéket adtam át


    }

}
