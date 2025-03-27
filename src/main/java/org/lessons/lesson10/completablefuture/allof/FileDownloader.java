package org.lessons.lesson10.completablefuture.allof;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FileDownloader {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> file1 = downloadFile("file1.txt", 3000);
        CompletableFuture<Void> file2 = downloadFile("file2.txt", 2000);
        CompletableFuture<Void> file3 = downloadFile("file3.txt", 1000);

        CompletableFuture<Void> allFiles = CompletableFuture.allOf(file1, file2, file3);

        System.out.println("⏳ Скачивание файлов...");
        allFiles.get();
        System.out.println("✅ Все файлы загружены!");
    }

    private static CompletableFuture<Void> downloadFile(String fileName, int time) {
        return CompletableFuture.runAsync(() -> {
            sleep(time);
            System.out.println("📁 " + fileName + " загружен за " + time + " мс.");
        });
    }

    private static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}