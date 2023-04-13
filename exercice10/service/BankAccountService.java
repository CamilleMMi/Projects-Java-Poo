package projectjavajpoo.exercice10.service;

import projectjavajpoo.exercice10.entity.BankAccount;

public class BankAccountService {
    public void addBalance(BankAccount account, double amount) {
        double balance = account.getBalance();
        balance += amount;
        account.setBalance(balance);
    }

    public void withdrawBalance(BankAccount account, double amount) {
        double balance = account.getBalance();
        double overdraft = account.getOverdraftLimit();

        if (balance >= amount || (balance + overdraft >= amount)) {
            balance -= amount;
            account.setBalance(balance);
        } else {
            throw new IllegalArgumentException("Solde Insuffisant");
        }
    }

    public void transferBalance(BankAccount sourceAccount, BankAccount addresseAccount, double amount) {
        double sourceBalance = sourceAccount.getBalance();
        double soldeDestinataire = addresseAccount.getBalance();
        double sourceOverdraft = sourceAccount.getOverdraftLimit();

        if (sourceBalance >= amount || (sourceBalance + sourceOverdraft >= amount)) {
            sourceBalance -= amount;
            soldeDestinataire += amount;
            sourceAccount.setBalance(sourceBalance);
            addresseAccount.setBalance(soldeDestinataire);
        } else {
            throw new IllegalArgumentException("Solde Insuffisant");
        }
    }
}

