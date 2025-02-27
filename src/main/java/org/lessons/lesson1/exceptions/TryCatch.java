package org.lessons.lesson1.exceptions;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        try {
            System.out.println("Введите число: ");
            num = in.nextInt();
        } catch (Exception e) {
            System.out.println("Входные данные имеют неправильный формат. Ожидается число, получена строка!");
            System.out.println("Исключение успешно обработано!");
        }

        System.out.println("Исключение обработано. Идем дальше!");

        in.nextLine();

        try {
            System.out.println("Введите число: ");
            num = in.nextInt();
            int result =  num * num;

            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Входные данные имеют неправильный формат. Ожидается число, получена строка!");
            System.out.println("Исключение успешно обработано!");
        }
    }
}
