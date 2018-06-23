package com.logware.kata.entities;


import java.time.LocalDateTime;
import java.util.List;

public class Account {

    private double amount;
    private List<OperationHistory> history;

    public Account(double amount, List<OperationHistory> history) {
        this.amount = amount;
        this.history = history;
    }

    public void saveMoney(double amountToBeAdded) {
        updateHistory(amountToBeAdded, "add");
        amount = amount + amountToBeAdded;
    }

    public void retrieveMoney(double amountToBeRetreved) {
        updateHistory(amountToBeRetreved, "Retrieve");
        amount = amount - amountToBeRetreved;
    }

    public void updateHistory(double amount, String operationType) {
        OperationHistory currentOperation = new OperationHistory(LocalDateTime.now(), amount, amount,
                amount + amount, operationType);
        history.add(currentOperation);
    }

    public void showHistory() {
        history.stream().forEach(System.out::println);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<OperationHistory> getHistory() {
        return history;
    }

    public void setHistory(List<OperationHistory> history) {
        this.history = history;
    }
}
