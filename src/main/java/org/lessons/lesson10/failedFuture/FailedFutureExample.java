package org.lessons.lesson10.failedFuture;

import java.util.concurrent.CompletableFuture;

public class FailedFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> foodOrder = CompletableFuture.failedFuture(new RuntimeException("Курьер потерял ваш заказ!"));

        CompletableFuture<String> result = someLogic();

        result.thenAccept(System.out::println);

        try {
            foodOrder.join();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


    private static CompletableFuture<String> someLogic() {
        boolean needCallExternalService = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);

            if (i % 2 == 0) {
                needCallExternalService = true;
                break;
            }
        }

        if (!needCallExternalService) {
            return CompletableFuture.failedFuture(new RuntimeException("Logic finished with exception!"));
        }

        return callExternalService();
    }

    private static CompletableFuture<String> callExternalService() {
        System.out.println("Calling another method!");

        return CompletableFuture.completedFuture("Result from external method!");
    }
}
