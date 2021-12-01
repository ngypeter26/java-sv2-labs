package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeTest {

    @Test
    void testCreate() {
        //Given
        Time time = new Time(13, 14, 15);
        //Then
        assertEquals(13, time.getHours());
        assertEquals(14, time.getMinutes());
        assertEquals(15, time.getSeconds());
    }

    private void assertEquals(int i, int hours) {
    }

    @Test
    void testIsEqualWithIntParameters() {
        //Given
        Time time = new Time(13, 14, 15);
        //Then
        assertTrue(time.isEqual(13, 14, 15));
        assertFalse(time.isEqual(15, 10, 10));
    }

    private void assertFalse(boolean equal) {
    }

    @Test
    void testIsEqualWithTimeParameter() {
        //Given
        Time time = new Time(13, 14, 15);
        Time firstAnotherTime = new Time(13, 14, 15);
        Time secondAnotherTime = new Time(11, 12, 13);
        //Then
        assertTrue(time.isEqual(firstAnotherTime));
        assertFalse(time.isEqual(secondAnotherTime));
    }

    @Test
    void testIsEarlierWithIntParameters() {
        //Given
        Time time = new Time(13, 14, 15);
        //Then
        assertTrue(time.isEarlier(15, 10, 10));
        assertFalse(time.isEarlier(10, 10, 10));
    }

    @Test
    void testIsEarlierWithTimeParameter() {
        //Given
        Time time = new Time(13, 14, 15);
        Time firstAnotherTime = new Time(13, 14, 15);
        Time secondAnotherTime = new Time(15, 16, 17);
        Time thirdAnothertime = new Time(11, 12, 13);
        //Then
        assertFalse(time.isEarlier(firstAnotherTime));
        assertTrue(time.isEarlier(secondAnotherTime));
        assertFalse(time.isEarlier(thirdAnothertime));
    }
}
