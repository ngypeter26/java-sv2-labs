package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WordsTest {
    Words words;

    @BeforeEach
    void init(){
        words = new Words();
        words.addWord("Mr. egy");
        words.addWord("Mr. kettő");
        words.addWord("Ms. három");
        words.addWord("Msr. négy");
        words.addWord("Miss öt");
        words.addWord("Msr. hat");
        words.addWord("Mr. hét");
        words.addWord("Junior Mr. nyolc");
        words.addWord("Ms. kilenc");
    }

    @Test
    void testGetWordsStartWith(){
        List<String> expected  = new ArrayList<>();
        expected.add("Mr. egy");
        expected.add("Mr. kettő");
        expected.add("Mr. hét");

        words.getWordsStartWith("Mr.");

        assertEquals(expected, words.getWords());

        System.out.println(expected);
        System.out.println(words.getWords());
    }
    @Test
    void testGetWordsWithLength(){
        List<String> expected  = new ArrayList<>();
        expected.add("Mr. egy");
        expected.add("Miss öt");
        expected.add("Msr. hat");
        expected.add("Mr. hét");
        expected.add("Junior Mr. nyolc");
        expected.add("Ms. kilenc");

        words.getWordsWithLength(9);

        assertEquals(expected, words.getWords());

        System.out.println(expected);
        System.out.println(words.getWords());
    }
}
