package BankSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating clients
        Client client1 = new Client("Nafee");
        Client client2 = new Client("Sadat");

        // Creating accounts for clients
        Account nafeeAccount = new Account(20000, "Nafee");
        Account sadatAccount = new Account(10000, "Sadat");

        // Assigning accounts to clients
        client1.addAccount(nafeeAccount);
        client2.addAccount(sadatAccount);

        // Displaying clients and accounts
        System.out.println(client1);
        for (Account account : client1.getAccounts()) {
            System.out.println(account);
        }
        System.out.println(client2);
        for (Account account : client2.getAccounts()) {
            System.out.println(account);
        }

        // Perform a transaction
        Transaction transaction = new Transaction(nafeeAccount, sadatAccount, 1000);
        if (transaction.execute()) {
            System.out.println("Transaction successful");
        }
        else
        {
            System.out.println("Transaction failed! Insufficient funds");
        }

        // Display updated account balances
        System.out.println(nafeeAccount);
        System.out.println(sadatAccount);
    }
}
