package com.acme.banking.dbo.service;

import com.acme.banking.dbo.domain.Account;
import com.acme.banking.dbo.domain.Cash;
import com.acme.banking.dbo.domain.Client;
import com.acme.banking.dbo.domain.SavingAccount;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Collection;

public class Processing {
    private ArrayList<Client> clients = new ArrayList<>();

    public int createClient(String name) {
        Client client = new Client(RandomUtils.nextInt(), name);
        clients.add(client);
        return client.getId();
    }

    public Collection<Account> getAccountsByClientId(int clientId) {
        Client client = null;
        for (Client c : clients) {
            if (c.getId() == clientId) {
                client = c;
                break;
            }
        }

        SavingAccount savingAccount = new SavingAccount(RandomUtils.nextInt(), client, RandomUtils.nextDouble(5000, 10000));
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(savingAccount);
        return accounts;
    }

    public void transfer(double amount, int fromAccountId, int toAccountId) {
    }

    public void cash(double amount, int fromAccountId) {

        Cash.log(amount, fromAccountId);
    }
}
