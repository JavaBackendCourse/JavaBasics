package org.lessons.practice.task3.model;

import org.lessons.practice.task3.exception.InsufficientFundsException;
import org.lessons.practice.task3.exception.InvalidAmountException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new InvalidAmountException("Сумма не может быть отрицательной!");
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance)
            throw new InsufficientFundsException("Запрашиваемая сумма превышает баланс счета!");
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
