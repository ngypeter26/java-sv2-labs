package stringbasic;

import java.util.List;

public class UniversityMain {

    public static void main(String[] args) {
        Person person = new Person("Kovács Péter", "kovacsp@gmail.com", "123456789",
                "12345678-87654321-12345678", "+3620-1234567");
        UniStudent uniStudent = new UniStudent(person, "A1B2C3", "9876543210");
        University university = new University();

        Person samePerson = new Person("Peter Schmidt", "pschmidt@gmail.com", "1010101010",
                "12345678-87654321-00000000", "+43-681-12345678");
        UniStudent sameUniStudent = new UniStudent(samePerson, "A1B2C3", "9876543210");

        Person anotherPerson = new Person("Kovács Péter", "kovacsp@gmail.com", "123456788",
                "12345678-87654321-12345678", "+3620-1234567");
        UniStudent anotherUniStudent = new UniStudent(anotherPerson, "D4E5F6", "0123456789");

        uniStudent.setCardNumber("CB-0123");

        System.out.println(uniStudent.getCardNumber());
        System.out.println(university.areEqual(uniStudent, sameUniStudent));
        System.out.println(university.areEqual(uniStudent, anotherUniStudent));

        List<UniStudent> studentsWithNoUniStudents = university.getStudentList();
        System.out.println(studentsWithNoUniStudents);
        System.out.println(studentsWithNoUniStudents.size());


        university.addStudent(uniStudent);
        List<UniStudent> studentsWithOneUniStudent = university.getStudentList();
        System.out.println(university.getStudentList().toString());
        System.out.println(studentsWithOneUniStudent.size());
    }
}
