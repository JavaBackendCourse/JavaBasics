package org.lessons.lesson1.exceptions;

import java.util.Scanner;

public class ExceptionWithoutTryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = num*num;

        System.out.println("Результат: " + result);
    }
}
