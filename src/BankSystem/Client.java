package BankSystem;

import java.util.*;

public class Client {
    private static int clientIdCounter = 1;

    private int clientId;
    private String name;
    private ArrayList<Account> accounts;

    public Client(String name) {
        this.clientId = clientIdCounter++;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public int getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public boolean addAccount(Account account) {
        accounts.add(account);
        return true;
    }

    public String toString() {
        String S = "Client ID: " + this.clientId + ", Name: " + this.name + ", Number of Accounts: " + accounts.size() + "\n";

        for(Account account:accounts){
        S += account.toString() + "\n";
        }

        return S;
    }
}
