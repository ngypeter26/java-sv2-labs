package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLabels {

    @Test
    void testTable(){
        Labels labels = new Labels();
        int[][] table = labels.getTableOfNumbers(6);
        assertEquals(5, table[2][1]);
        assertEquals(10, table[4][4]);    }
}
