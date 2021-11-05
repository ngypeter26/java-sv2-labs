//package introjunit;
//
//import org.junit.Test;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertThat;
//
//
//public class GentlemanTest {
//    @Test
//    public void longerTest(){
//    Gentleman gentleman = new Gentleman(); //given
//    String greeting = gentleman.sayHello("John Doe"); //when
//    assertThat(greeting,equalTo("Hello John Doe")); //then
//    }
//
//    @Test
//    public void shorterTest(){
//        assertThat(new Gentleman().sayHello("John Doe"),equalTo("Hello John Doe"));
//    }
//
////    @Test
////    public void wrongTest(){
////        assertThat(new Gentleman().sayHello("John Doe"),equalTo("HelloJohn Doe"));
////    }
//
//    @Test
//    public void nullTest(){
//        assertThat(new Gentleman().sayHello(null),equalTo("Hello Anonymus"));
//    }
//}
