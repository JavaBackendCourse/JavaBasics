package org.lessons.lesson10.completablefuture.runasync;

import java.util.concurrent.CompletableFuture;

public class RunAsyncExample {
    public static void main(String[] args) {
        System.out.println("Main thread started!");

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }

            System.out.println("Task completed!");
        });

        System.out.println("Main thread continues working...");

        future.join();

        System.out.println("Main thread is finished!");
    }
}
