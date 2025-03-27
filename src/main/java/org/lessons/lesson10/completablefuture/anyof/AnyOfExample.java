package org.lessons.lesson10.completablefuture.anyof;

import java.util.concurrent.CompletableFuture;

public class AnyOfExample {
    public static void main(String[] args) {
        var f1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Какая-то логика 1");

            sleep(10000);

            return "Какая-то логика 1 завершена!";
        });

        var f2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Какая-то логика 2");

            sleep(5000);
            return "Какая-то логика 2 завершена!";
        });

        System.out.println("Основной поток продолжает выполнение!");
        var result = CompletableFuture.anyOf(f1, f2).join();
        System.out.println("Результат: " + result);
        System.out.println("Основной поток завершен!");
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
