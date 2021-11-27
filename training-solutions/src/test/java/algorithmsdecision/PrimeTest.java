package algorithmsdecision;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199);


    @Test
    void isPrimeTest() {
        for (int i : primes) {
            assertTrue( new Prime().isPrime(i));
        }
    }

    @Test
    void isNotPrimeTest() {
        for (int i = 1; i < 200; i++) {
            if (!primes.contains(i) ) {
                assertFalse( new Prime().isPrime(i));
            }
        }
    }


}
