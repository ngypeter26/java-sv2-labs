package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifiedWordTest {

    @Test
    void modifyWordTest(){
        assertEquals("AxMy",new ModifiedWord().modify("alma"));
        assertEquals("KxRy",new ModifiedWord().modify("körte"));
        assertEquals("SxIy",new ModifiedWord().modify("szilva"));
    }
    @Test
    void modifyWord2Test(){
        assertEquals("AxMy",new ModifiedWord2().modify("alma"));
        assertEquals("KxRy",new ModifiedWord2().modify("körte"));
        assertEquals("SxIy",new ModifiedWord2().modify("szilva"));
    }
}
