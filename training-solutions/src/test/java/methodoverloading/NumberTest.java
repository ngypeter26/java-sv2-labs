package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {
    ClassFiveA classFiveA;
    @BeforeEach
    void initiation (){
        classFiveA = new ClassFiveA();
        classFiveA.addClassMember("Kiss Pista");
        classFiveA.addClassMember("Nagy Luca");
        classFiveA.addClassMember("Sánta Gábor");
        classFiveA.addClassMember("Szabó Lajos");
        classFiveA.addClassMember("Zabos Elemér");

    }



    @Test
    void getTodayReferringStudentTest1(){
        assertEquals("Kiss Pista",classFiveA.getTodayReferringStudent(1));
    }
    @Test
    void getTodayReferringStudentTest2(){
        assertEquals("Nagy Luca",classFiveA.getTodayReferringStudent(Number.TWO));
    }
    @Test
    void getTodayReferringStudentTest3(){
        System.out.println();
        assertEquals("Sánta Gábor",classFiveA.getTodayReferringStudent("three"));
    }
}




