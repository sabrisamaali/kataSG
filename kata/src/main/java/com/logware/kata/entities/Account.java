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

    /**
     * add an amount to the account and update the list of operations
     *
     * @param amountToBeAdded amount to be added
     */
    public void saveMoney(double amountToBeAdded) {
        updateHistory(amountToBeAdded, "add");
        amount = amount + amountToBeAdded;
    }

    /**
     * withdraw  an amount to the account and update the list of operations
     *
     * @param amountToBeRetreved amount withdrawn
     */
    public void retrieveMoney(double amountToBeRetreved) {
        updateHistory(amountToBeRetreved, "Retrieve");
        amount = amount - amountToBeRetreved;
    }

    /**
     * trace the operation
     * @param amount the new amount
     * @param operationType in this case ze only have 2 operation add or retrieve
     */
    public void updateHistory(double amount, String operationType) {
        double result = "add".equals(operationType) ? OperationType.ADD.calculateResult(this.amount, amount) :
                OperationType.RETRIEVE.calculateResult(this.amount, amount);
        OperationHistory currentOperation = new OperationHistory(LocalDateTime.now(), this.amount, amount,
                result, operationType);
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
