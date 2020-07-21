package com.acme.banking.dbo;

import com.acme.banking.dbo.domain.Client;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void shouldGetClientIdAndClientNameWhenCreatedWithCorrectParams() {
        Client sut = new Client(1, "TestName");
        assertEquals("TestName", sut.getName());
        assertEquals(1, sut.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGetErrorGetWhenIdIsLowerThanZero() {
        Client sut = new Client(-1, "TestName");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGetErrorGetWhenNameIsNull() {
        Client sut = new Client(1, null);
    }
}
