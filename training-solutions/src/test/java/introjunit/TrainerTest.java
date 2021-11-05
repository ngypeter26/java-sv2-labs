//package introjunit;
//
//import org.junit.Test;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertThat;
//
//public class TrainerTest {
//
//    @Test
//    public void testCreate(){
//        // Given
//        Trainer trainer = new Trainer("John Doe");
//
//        // when
//        String name = trainer.getName();
//
//        // Then
//        assertThat(name,equalTo("John Doe"));
//    }
//    @Test
//    public void testCreate2(){
//        assertThat(new Trainer("John Doe").getName(),equalTo("John Doe"));
//    }
//
//    @Test
//    public void testUpperCase(){
//        assertThat(new Trainer("John Doe").getNameUpperCase(),equalTo("JOHN DOE"));
//    }
//}
