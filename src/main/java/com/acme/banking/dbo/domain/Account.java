package com.acme.banking.dbo.domain;

public interface Account {
    int getId();

    int getClientId(); //TODO reference integrity
}
