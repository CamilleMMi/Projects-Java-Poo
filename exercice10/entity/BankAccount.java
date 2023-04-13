package projectjavajpoo.exercice10.entity;

public class BankAccount {
    private int id;

    private String accountNumber;

    private int clientId;

    private double balance;

    private double overdraftLimit;

    public BankAccount(int id, String accountNumber, int clientId, double balance, double overdraftLimit) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.clientId = clientId;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

