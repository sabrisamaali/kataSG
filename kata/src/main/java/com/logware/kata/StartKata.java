package com.logware.kata;

import com.logware.kata.entities.Account;

import java.util.ArrayList;

public class StartKata {

    public static void main(String[] args) {
        Account account = new Account(0, new ArrayList<>());
        account.saveMoney(50);
        account.retrieveMoney(25);
        System.out.println("you have : " + account.getAmount() + "in your bank account");
        account.showHistory();
    }
}
