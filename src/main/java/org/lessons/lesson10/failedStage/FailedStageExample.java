package org.lessons.lesson10.failedStage;

import java.util.concurrent.CompletableFuture;

public class FailedStageExample {
    public static void main(String[] args) {
        CompletableFuture<String> payment = CompletableFuture.completedFuture("Проверяем баланс...")
                .thenApply(msg -> {
                    System.out.println(msg);
                    return "Недостаточно средств!";
                })
                .thenCompose(result -> CompletableFuture.failedStage(new RuntimeException(result)));

        try {
            payment.join();
        } catch (Exception e) {
            System.out.println("Ошибка оплаты: " + e.getCause().getMessage());
        }
    }
}