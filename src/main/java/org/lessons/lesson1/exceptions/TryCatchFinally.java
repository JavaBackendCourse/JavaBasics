package org.lessons.lesson1.exceptions;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            int a = in.nextInt();
            in.nextLine();
            System.out.println("Введите второе число: ");
            int b = in.nextInt();
            in.nextLine();

            int c = a / b;

            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Получена арифметическая ошибка: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Программа выполнена успешно!");
        }
    }
}
