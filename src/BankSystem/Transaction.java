package BankSystem;

import java.util.*;

public class Transaction {
    private static int transactionIdCounter = 1;

    private int transactionId;
    private Account sourceAccount;
    private Account destinationAccount;
    private double amount;
    private Date timestamp;

    public Transaction(Account sourceAccount, Account destinationAccount, double amount) {
        this.transactionId = transactionIdCounter++;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public boolean execute() {
        if (sourceAccount.withdraw(amount)) {
            destinationAccount.deposit(amount);
            return true; // Transaction successful
        }
        else
        {
            return false; // Insufficient funds
        }
    }

    public String toString() {
        return "Transaction ID: " + this.transactionId + ", Amount: $" + this.amount + ", Timestamp: " + this.timestamp;
    }
}