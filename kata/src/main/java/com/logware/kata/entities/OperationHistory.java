package com.logware.kata.entities;

import java.time.LocalDateTime;

public class OperationHistory {
    private LocalDateTime date;
    private double currentAmount;
    private double secondAmount;
    private double result;
    private String operationType;

    public OperationHistory(LocalDateTime date, double currentAmount, double secondAmount, double result, String operationType) {
        this.date = date;
        this.currentAmount = currentAmount;
        this.secondAmount = secondAmount;
        this.result = result;
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        return "OperationHistory{" +
                "date=" + date +
                ", currentAmout=" + currentAmount +
                ", operationType='" + operationType + '\'' +
                ", secondAmout=" + secondAmount +
                ", result=" + result +
                '}';
    }
}
