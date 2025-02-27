package org.lessons.lesson1.io;

import java.util.Scanner;

public class InputOutputWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = sc.nextLine();

        System.out.println("Enter your age: ");

        int age = sc.nextInt();

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}
