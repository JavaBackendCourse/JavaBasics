package org.lessons.lesson10.completablefuture.supplyasync;

import java.util.concurrent.CompletableFuture;

public class SupplyAsyncExample {
    public static void main(String[] args) {
        System.out.println("Основной поток стартовал!");

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(10000);

                for (int i = 0; i <= 10; i++) {
                    System.out.println("Логика: " + i);
                }

                return "Логика успешно завершена!";
            } catch (InterruptedException e) {
                return "Логика завершена с ошибкой";
            }
        });

        System.out.println("Основной потока продолжает выполнение...");

        var result = future.join();

        System.out.println("Основной поток завершил выполнение: " + result);
    }
}
