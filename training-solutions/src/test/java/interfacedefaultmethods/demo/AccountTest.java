package interfacedefaultmethods.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class AccountTest {
    @Test
    public void testCreatedAfter(){
        Account account = new Account(LocalDateTime.of(2018,1,1,10,10,10));

        boolean result = account.createdAfter(LocalDateTime.of(2018,1,1,11,10,10));

        System.out.println(result);
        assertFalse(result);

    }
}
