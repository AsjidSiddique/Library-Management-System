package AdminLogic;

import java.util.LinkedList;

public class TransactionManager {
    private static LinkedList<Transaction> transactionList = new LinkedList<>();

    public static void addTransaction(Transaction t) {
        transactionList.add(t);
    }

    public static LinkedList<Transaction> getTransactions() {
        return transactionList;
    }
}