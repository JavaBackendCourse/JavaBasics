package org.lessons.lesson10.completablefuture.runasync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunAsyncWithExecutor {
    public static void main(String[] args) {
        System.out.println("Main thread started!");

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Task completed!");
        }, executorService);

        System.out.println("Main thread continues working...");

        future.join();
    }
}
