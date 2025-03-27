package org.lessons.lesson10.delayedExecutor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class DelayedExecutorExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor delayedExecutor = CompletableFuture.delayedExecutor(5, TimeUnit.SECONDS);

        CompletableFuture<String> delivery = CompletableFuture.supplyAsync(() -> "Ваш заказ доставлен!", delayedExecutor);

        System.out.println("Ожидание заказа...");
        System.out.println(delivery.get());
    }
}