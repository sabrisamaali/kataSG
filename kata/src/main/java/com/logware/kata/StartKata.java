package com.logware.kata;

import com.logware.kata.entities.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class StartKata {

    public static void main(String[] args) {
        Account account = new Account(0, new ArrayList<>());
        while (true) {
            System.out.println("please choose a number: < 1 > Deposit money | < 2 > Withdrawal < 3 > Show history  :");
            Scanner choiceInput = new Scanner(System.in);
            Scanner amountInout = new Scanner(System.in);
            String operation = choiceInput.nextLine();
            switch (operation) {
                case "1": {

                    System.out.println("please enter the amount : ");
                    String amount = amountInout.nextLine();
                    account.saveMoney(Double.parseDouble(amount));
                    break;
                }
                case "2": {
                    System.out.println("please enter the amount : ");
                    String amount = amountInout.nextLine();
                    account.retrieveMoney(Double.parseDouble(amount));
                    break;
                }
                case "3": {
                    account.showHistory();
                }
                default:
                    break;
            }
        }
    }
}
