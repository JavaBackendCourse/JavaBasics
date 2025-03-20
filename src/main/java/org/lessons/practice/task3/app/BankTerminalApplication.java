package org.lessons.practice.task3.app;

import org.lessons.practice.task3.exception.InsufficientFundsException;
import org.lessons.practice.task3.exception.InvalidAmountException;
import org.lessons.practice.task3.model.BankAccount;

import java.util.Scanner;

public class BankTerminalApplication {
    private final BankAccount bankAccount = new BankAccount(0);

    public void start() {
        Scanner scanner = new Scanner(System.in);
        process(scanner);
    }

    private void process(Scanner sc) {
        System.out.println("Добро пожаловать в наш банковский терминал!");

        while (true) {
            showInstruction(sc);
            String choice = sc.next();

            switch (choice) {
                case "1" -> depositAmount(sc);
                case "2" -> withdrawAmount(sc);
                case "3" -> showBalance();
                case "0" -> System.exit(0);
                default -> {
                    System.out.println("Упс! Вы ввели неправильную команду! Попробуйте снова!");
                    process(sc);
                }
            }
        }
    }

    private void showInstruction(Scanner sc) {
        System.out.println("[1] - Пополнить счет");
        System.out.println("[2] - Снять деньги со счета");
        System.out.println("[3] - Узнать баланс счета");
        System.out.println("[0] - Выйти из программы");
    }

    private void depositAmount(Scanner sc) {
        try {
            System.out.println("Введите сумму:");
            double amount = Double.parseDouble(sc.next());
            bankAccount.deposit(amount);
            System.out.println("Ваш счет успешно пополнен!");
        } catch (Exception e) {
            if (e instanceof InvalidAmountException) {
                System.out.println("Ваша сумма некорректна! Попробуйте еще раз!");
            } else {
                System.out.println("Упс! Что-то пошло не так! Попробуйте снова!");
            }
            depositAmount(sc);
        }
    }

    private void withdrawAmount(Scanner sc) {
        try {
            System.out.println("Введите сумму:");
            double amount = Double.parseDouble(sc.next());
            bankAccount.withdraw(amount);

            System.out.println("Вы успешно сняли средства с вашего счета!");
        } catch (Exception e) {
            if (e instanceof InsufficientFundsException) {
                System.out.println("На счете недостаточно средств! Попробуйте еще раз!");
            } else {
                System.out.println("Упс! Что-то пошло не так! Попробуйте снова!");
            }
            withdrawAmount(sc);
        }
    }

    private void showBalance() {
        System.out.println("Ваш баланс: " + bankAccount.getBalance() + " тенге!");
    }
}
