package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int limit) {
        int count = 0;
        for (Transaction t : transactions) {
            if (t.isCredit() && t.getAmount() < limit) {
                count++;
            }
        }
        return count;
    }
}
