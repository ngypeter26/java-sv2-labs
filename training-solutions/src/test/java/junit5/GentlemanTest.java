package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    void greetingTest(){
        Gentleman gentleman = new Gentleman(); //given
        String greeting = gentleman.sayHello("John Doe"); //When
        assertEquals("Hello John Doe",greeting); //then
    }

    @Test
    void greetingTestShort(){
        assertEquals("Hello Jack Doe",new Gentleman().sayHello("Jack Doe")); //then
    }
    @Test
    void greetingTestNull(){
        assertEquals("Hello Anonymus",new Gentleman().sayHello(null)); //then
    }
}
