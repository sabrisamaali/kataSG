package com.logware.kata.entities;

public enum OperationType {

    ADD {
        @Override
        double calculateResult(double currentAmount, double secondAmount) {
            return currentAmount + secondAmount;
        }
    },
    RETRIEVE {
        @Override
        double calculateResult(double currentAmount, double secondAmount) {
            return currentAmount - secondAmount;
        }
    };

    abstract double calculateResult(double currentAmount, double secondAmount);
}
