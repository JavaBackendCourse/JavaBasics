package org.lessons.practice2.tasks4;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Task4 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Шахтеры начали поиск золота...");

        CompletableFuture<String> mine1 = CompletableFuture.supplyAsync(() -> searchGold(1));
        CompletableFuture<String> mine2 = CompletableFuture.supplyAsync(() -> searchGold(2));
        CompletableFuture<String> mine3 = CompletableFuture.supplyAsync(() -> searchGold(3));

        CompletableFuture<Object> winner = CompletableFuture.anyOf(mine1, mine2, mine3);

        try {
            Object result = winner.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String searchGold(int mineNumber) {
        try {
            int searchTime = random.nextInt(8) + 3;
            Thread.sleep(searchTime * 1000);
            return "Золото найдено в шахте №" + mineNumber + "!";
        } catch (InterruptedException e) {
            return "Ошибка в шахте №" + mineNumber;
        }
    }
}
