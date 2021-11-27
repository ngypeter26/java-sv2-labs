package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrefixTest {

    @Test
    void getWordsStartWithTest(){
        List<String> names = Arrays.asList( "Mr. Smith","Mrs. Smith","Miss. Smith"," Smith"," Mrs. Doe","Mr. Doe");

        List<String> filteredMr = new Prefix().getWordsStartWith(names,"Mr.");
        List<String> filteredMrs = new Prefix().getWordsStartWith(names,"Mrs.");
        List<String> filteredMs = new Prefix().getWordsStartWith(names,"Ms.");

        List<String> expectedMr = Arrays.asList( "Mr. Smith","Mr. Doe");
        List<String> expectedMrs = Arrays.asList( "Mrs. Smith");
        List<String> expectedMs = new ArrayList<>();

        assertEquals(expectedMr,filteredMr);
        assertEquals(expectedMrs,filteredMrs);
        assertEquals(expectedMs,filteredMs);
    }
}
