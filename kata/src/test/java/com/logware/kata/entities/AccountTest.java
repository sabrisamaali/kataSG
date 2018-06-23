package com.logware.kata.entities;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Account account;

    @Test
    public void should_save_money_and_update_history_when_amountToBeAdded() {
        account = new Account(0, new ArrayList<>());
        double amountBeforeAdd = account.getAmount();
        account.saveMoney(50);
        assertTrue(amountBeforeAdd < account.getAmount());
    }

    @Test
    public void should_retrieve_money_and_update_history_when_amountTeBeRetrieved() {
        account = new Account(100, new ArrayList<>());
        account.retrieveMoney(50);
        assertEquals(50, account.getAmount(), 0.1);
    }

    @Test
    public void should_update_history_when_given_amount_and_operationType() {
        System.setOut(new PrintStream(outContent));
        account = new Account(100, new ArrayList<>());
        account.saveMoney(50);
        String expectedHistory = account.getHistory().get(0).toString();
        account.showHistory();
        assertTrue(outContent.toString().contains(expectedHistory));

    }

}