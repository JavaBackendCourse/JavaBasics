package org.lessons.practice2.task3;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Task3 {
    private static final Random rand = new Random();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> file1 = downloadFile("file1.txt", rand.nextInt(3) + 1);
        CompletableFuture<Void> file2 = downloadFile("file2.txt", rand.nextInt(3) + 1);
        CompletableFuture<Void> file3 = downloadFile("file3.txt", rand.nextInt(3) + 1);

        CompletableFuture<Void> allFiles = CompletableFuture.allOf(file1, file2, file3);

        System.out.println("Скачивание файлов...");
        allFiles.get();
        System.out.println("Все файлы загружены!");
    }

    private static CompletableFuture<Void> downloadFile(String fileName, int time) {
        return CompletableFuture.runAsync(() -> {
            System.out.println("Файл" + fileName + " скачивается...");
            sleep(time * 1000);
            System.out.println("Файл " + fileName + " загружен за " + time + " с!");
        });
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
