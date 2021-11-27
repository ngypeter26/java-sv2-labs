package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    void isPalindromeTest(){
        String palidrome1 = "lepel";
        String palidrome2 = "integetni";

        String notPalidrome1 = "valami";
        String notpalidrome2 = "semmi ";

        assertTrue(new Palindrome().isPalindrome(palidrome1));
        assertTrue(new Palindrome().isPalindrome(palidrome2));
        assertFalse(new Palindrome().isPalindrome(notPalidrome1));
        assertFalse(new Palindrome().isPalindrome(notpalidrome2));
    }
}
