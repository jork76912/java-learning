package com.java_learning.Javacode02;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance)  {
        if (initialBalance < 0) {
            throw new NegativeAmountRuntimeException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount)  {
        if (amount < 0) {
            throw new NegativeAmountRuntimeException("Deposit amount cannot be negative");
        }
        this.balance += amount;
    }

    public void withdraw(double amount)  {
        if (amount < 0) {
            throw new NegativeAmountRuntimeException("Withdrawal amount cannot be negative");
        }
        if (this.balance < amount) {
            throw new InsufficientFundsRuntimeException("Insufficient funds for withdrawal");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
