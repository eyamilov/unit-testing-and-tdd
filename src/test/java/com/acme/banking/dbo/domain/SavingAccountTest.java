package com.acme.banking.dbo.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SavingAccountTest {
    @Test
    public void shouldReturnMethodsResultsWhenCreatedWithCorrectParams() {
        Client client = new Client(1, "TestName");
        SavingAccount sut = new SavingAccount(2, client, 100.1d);
        assertEquals(client, sut.getClient());
        assertTrue(100.1d == sut.getAmount());
        assertEquals(2, sut.getId());
        assertEquals(1, sut.getClientId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGetErrorGetWhenClientIsNull() {
        SavingAccount sut = new SavingAccount(2, null, 100.1d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGetErrorGetWhenIdIsLowerThanZero() {
        Client client = new Client(1, "TestName");
        SavingAccount sut = new SavingAccount(-2, client, 100.1d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGetErrorGetWhenAmountIsLowerThanZero() {
        Client client = new Client(1, "TestName");
        SavingAccount sut = new SavingAccount(2, client, -100.1);
    }
}
