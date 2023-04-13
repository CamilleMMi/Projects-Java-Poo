package projectjavajpoo.exercice10;

import projectjavajpoo.exercice10.entity.BankAccount;
import projectjavajpoo.exercice10.entity.Client;
import projectjavajpoo.exercice10.service.BankAccountService;
import projectjavajpoo.exercice10.service.ClientService;

public class Main {
    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountService();
        ClientService clientService = new ClientService();

        Client client1 = new Client(1, "Camille", "MICHAUD-MELI");
        Client client2 = new Client(2, "Hippolyte", "MICHAUD-MELI");

        BankAccount bankAccount1 = new BankAccount(1, "1230CF", 1, 100000, 500);
        BankAccount bankAccount2 = new BankAccount(2, "1229DX", 2, 0, 0);

        clientService.openAccount(client1, bankAccount1);
        clientService.openAccount(client2, bankAccount2);

        System.out.println(client1.getFirstName());
        System.out.println(bankAccount1.getBalance());

        System.out.println(client2.getFirstName());
        System.out.println(bankAccount2.getBalance());

        bankAccountService.addBalance(bankAccount1, 500);
        bankAccountService.addBalance(bankAccount2, 1000);

        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());

        bankAccountService.transferBalance(bankAccount1, bankAccount2, 5000);

        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());
    }
}
