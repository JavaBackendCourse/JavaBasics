package org.lessons.lesson10.completablefuture.allof;

import java.util.concurrent.CompletableFuture;

public class AllOfExample {
    public static void main(String[] args) {
        var f1 = CompletableFuture.runAsync(() -> {
            System.out.println("Какая-то логика 1");

            sleep(10000);

            System.out.println("Какая-то логика 1 завершена!");
        });

        var f2 = CompletableFuture.runAsync(() -> {
            System.out.println("Какая-то логика 2");

            sleep(10000);
            System.out.println("Какая-то логика 2 завершена!");
        });

        System.out.println("Основной поток продолжает выполнение!");
        CompletableFuture.allOf(f1, f2).join();

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