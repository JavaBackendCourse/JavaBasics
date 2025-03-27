package org.lessons.lesson10.completablefuture.supplyasync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SupplyAsyncWithExecutorExample {
    public static void main(String[] args) {
        System.out.println("Main thread started!");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);

                for (int i = 0; i <= 10; i++) {
                    System.out.println("logic: " + i);
                }

                return "Finished successfully!";
            } catch (InterruptedException e) {
                return "Finished with error";
            }
        }, executorService);

        System.out.println("Main Thread continues working...");

        var result = future.join();

        System.out.println("Main thread got result: " + result);
    }
}
