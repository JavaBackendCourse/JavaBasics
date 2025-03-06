package org.lessons.lesson4.functioninterfaces.example1;

import java.util.Scanner;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first digit: ");

        int a = sc.nextInt();

        System.out.println("Enter the second digit: ");
        int b = sc.nextInt();

        int sum = addition.operation(a, b);
        int sub = subtraction.operation(a, b);
        int mul = multiplication.operation(a, b);
        int div = division.operation(a, b);

        System.out.println("The sum is: " + sum);
        System.out.println("The subtraction is: " + sub);
        System.out.println("The multiplication is: " + mul);
        System.out.println("The division is: " + div);

    }
}
