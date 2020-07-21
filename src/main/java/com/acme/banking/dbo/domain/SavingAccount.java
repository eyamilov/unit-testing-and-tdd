package com.acme.banking.dbo.domain;

public class SavingAccount implements Account {
    private int id;
    private Client client;
    private double amount;

    public SavingAccount(int id, Client client, double amount) {
        if (client == null) throw new IllegalArgumentException("client == null");
        if (id < 0) throw new IllegalArgumentException("id < 0");
        if (amount < 0) throw new IllegalArgumentException("amount < 0");
        this.id = id;
        this.client = client;
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getClientId() {
        return client.getId();
    }
}
