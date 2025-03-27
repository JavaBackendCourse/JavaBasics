package org.lessons.lesson10.completablefuture.supplyasync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class PizzaOrderSimulation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();

        CompletableFuture<String> pizza = CompletableFuture.supplyAsync(() -> {
            sleep(10000);
            return "🍕 Пицца готова!";
        });

        CompletableFuture<String> drink = CompletableFuture.supplyAsync(() -> {
            sleep(5000);
            return "🥤 Напиток готов!";
        });

        CompletableFuture<String> order = pizza
                .thenCombine(drink, (p, d) -> p + "  " + d);

        System.out.println("Ожидаем заказ...");

        System.out.println(order.get());

        long endTime = System.currentTimeMillis();
        long timeDiff = (endTime - startTime) / 1000;

        System.out.println("Общее время выполнения: " + timeDiff + " секунд!");
    }

    private static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}