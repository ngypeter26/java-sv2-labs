package algorithmssum.transaction;

import java.util.List;
public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions){
        int sumAmount = 0;
        for (Transaction t : transactions){
            if (t.isCredit())
            sumAmount += t.getAmount();
        }
        return sumAmount;
    }
}
