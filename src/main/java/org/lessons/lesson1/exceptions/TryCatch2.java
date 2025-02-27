package org.lessons.lesson1.exceptions;

public class TryCatch2 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int c = a / b;

            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Получена арифметическая ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
