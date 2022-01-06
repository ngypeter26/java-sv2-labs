package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayableTest {

    @Test
    void testAmount(){
        Payable payable = new Amount();
        int amount = 146;
        assertEquals(amount,payable.getPayableAmount(amount));
    }

    @Test
    void testCash(){
        Payable payable = new Cash();
        assertEquals(140,payable.getPayableAmount(140));
        assertEquals(140,payable.getPayableAmount(141));
        assertEquals(140,payable.getPayableAmount(142));
        assertEquals(145,payable.getPayableAmount(143));
        assertEquals(145,payable.getPayableAmount(144));
        assertEquals(145,payable.getPayableAmount(145));
    }

    void testBankAtm(){
        Payable payable = new BankAtm();
        assertEquals(1000,payable.getPayableAmount(140));
        assertEquals(15000,payable.getPayableAmount(15000));
        assertEquals(15000,payable.getPayableAmount(14999));

    }
}
