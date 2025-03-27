package org.lessons.lesson10.completedFuture;

import java.util.concurrent.CompletableFuture;

public class CompletedFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> pizzaOrder = CompletableFuture.completedFuture("Пицца 'Пепперони' уже готова!");

        pizzaOrder.thenAccept(System.out::println);
    }
}