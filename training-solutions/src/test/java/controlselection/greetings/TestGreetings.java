package controlselection.greetings;


import junit5fixture.Ship;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGreetings {
    Greetings greetings;

    @BeforeEach
    void initGreetings() {
         greetings = new Greetings();
    }

    @Test
    void testNight(){
        greetings.sayHello(4,10);
        assertEquals("Jó éjt!",greetings.sayHello(4,10));
        assertEquals("Jó éjt!",greetings.sayHello(21,10));
    }
    @Test
    void testMorning(){
        assertEquals("Jó reggelt!",greetings.sayHello(8,10));
    }
    @Test
    void testDay(){
        assertEquals("Jó napot!",greetings.sayHello(11,10));
        assertEquals("Jó napot!",greetings.sayHello(16,10));
    }
    void testEvening(){
        assertEquals("Jó estét!",greetings.sayHello(18,45));
    }



}
