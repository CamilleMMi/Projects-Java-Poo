package projectjavajpoo.exercice10.service;

import projectjavajpoo.exercice10.entity.BankAccount;
import projectjavajpoo.exercice10.entity.Client;

public class ClientService {

    public void closeAccount(Client client, BankAccount account) {
        int[] accountIds = client.getAccountIds();
        if (accountIds != null) {
            int index = -1;
            for (int i = 0; i < accountIds.length; i++) {
                if (accountIds[i] == account.getId()) {
                    index = i;
                    break;
                }
            }
            if (index >= 0) {
                int[] newAccountIds = new int[accountIds.length - 1];
                int j = 0;
                for (int i = 0; i < accountIds.length; i++) {
                    if (i != index) {
                        newAccountIds[j] = accountIds[i];
                        j++;
                    }
                }
                client.setAccountIds(newAccountIds);
            } else {
                throw new IllegalArgumentException("Il ne s'agit pas d'un compte de cet utilisateur");
            }
        } else {
            throw new IllegalArgumentException("Le client n'a aucun compte");
        }
    }

    public void openAccount(Client client, BankAccount account) {
        int[] accountIds = client.getAccountIds();
        if (accountIds != null) {
            int[] newAccountIds = new int[accountIds.length + 1];
            for (int i = 0; i < accountIds.length; i++) {
                newAccountIds[i] = accountIds[i];
            }
            newAccountIds[accountIds.length] = account.getId();
            client.setAccountIds(newAccountIds);
        } else {
            int[] newAccountIds = {account.getId()};
            client.setAccountIds(newAccountIds);
        }
    }
}
