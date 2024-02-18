package BankSystem;

import java.util.*;

public class Account {
    private static int accountNumberCounter = 1;

    private int accountNumber;
    private double balance;
    private String owner;

    public Account(double initialBalance, String owner) {
        this.accountNumber = accountNumberCounter++;
        this.balance = initialBalance;
        this.owner = owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if((this.balance< amount)) return false; //Insufficient funds
        this.balance -= amount;
        return true; //Withdrawal Successful
    }

    public String toString() {
        return "Account Number: " + this.accountNumber + ", Balance: $" + this.balance + ", Owner: " + this.owner;
    }
}
