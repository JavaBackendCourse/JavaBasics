package org.lessons.lesson1.conditions;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваш возраст:");

        int age = sc.nextInt();

        sc.nextLine();

        if (age >= 18) {
            System.out.println("Вы совершеннолетний!");
        } else {
            System.out.println("Вы несовершеннолетний!");
        }


        System.out.println("Введите ваш логин:");

        String username = sc.nextLine();

        if (username.length() <= 4) {
            System.out.println("У вас короткий логин");
        } else if (username.length() <= 7) {
            System.out.println("Ваш логин средней длины!");
        } else {
            System.out.println("У вас длинный логин");
        }

        sc.nextLine();

        String validLogin = "user123";
        String validPassword = "V@asd*123";

        System.out.println("Введите ваш логин:");
        String login = sc.nextLine();

        System.out.println("Введите ваш пароль:");
        String password = sc.nextLine();

        if(login.equals(validLogin) && password.equals(validPassword)) {
            System.out.println("Вы вошли в систему");
        } else {
            System.out.println("Вы ввели некорректный логин или пароль! Попробуйте еще раз");
        }


        // ternary operator.
        // Условия можно также прописывать сокращенно: (условие) ? (блок кода если соблюдено) : (блок кода если не соблюдено)
        // Пример  a == 5 ? "yes" : "no";

        int a = 5;

        String result = a == 5 ? "five" : "not five";

        System.out.println(result);
    }
}
