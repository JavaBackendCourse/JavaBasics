package org.lessons.lesson2.methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();

        int sum = sum(a, b);
        int subtract = subtract(a, b);
        int multiply = multiply(a, b);
        double division = divide((double) a, (double) b);

        System.out.printf("\nСумма: %d, Разница: %d, Умножение: %d, Деление: %.2f", sum, subtract, multiply, division);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
