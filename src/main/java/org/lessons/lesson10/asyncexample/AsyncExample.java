package org.lessons.lesson10.asyncexample;

import java.util.concurrent.CompletableFuture;

public class AsyncExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Основной поток запущен!");

        CompletableFuture.runAsync(AsyncExample::logic);

        System.out.println("Основной поток завершен!");

        Thread.sleep(1000);
    }


    private static void logic() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Логика: " + i);
        }
    }
}
