package org.lessons.lesson10.completablefuture.anyof;

import java.util.concurrent.*;
import java.util.Random;

public class CarRace {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random random = new Random();

        CompletableFuture<String> car1 = CompletableFuture.supplyAsync(() -> race("🚗 Car 1", random.nextInt(5000)));
        CompletableFuture<String> car2 = CompletableFuture.supplyAsync(() -> race("🏎️ Car 2", random.nextInt(5000)));
        CompletableFuture<String> car3 = CompletableFuture.supplyAsync(() -> race("🚙 Car 3", random.nextInt(5000)));

        CompletableFuture<Object> winner = CompletableFuture.anyOf(car1, car2, car3);

        System.out.println("Гонка началась...");
        System.out.println("🏁 Победитель: " + winner.get());
    }

    private static String race(String car, int time) {
        sleep(time);
        return car + " финишировал за " + time + " мс!";
    }

    private static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}