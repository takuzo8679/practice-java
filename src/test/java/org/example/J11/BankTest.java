package org.example.J11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test public void Normal() {
        Bank bank = new Bank();
        assertNull(bank.getName());
        bank.setName("123");
        assertEquals("123", bank.getName());
    }

    @Test public void abnormal_should_throw_when_set_null() {
        Bank bank = new Bank();
        assertThrows(NullPointerException.class, () -> bank.setName(null));
    }
    @Test public void abnormal_should_throw_when_set_3length_character() {
        Bank bank = new Bank();
        assertThrows(IllegalArgumentException.class, () -> bank.setName("12"));
    }

}