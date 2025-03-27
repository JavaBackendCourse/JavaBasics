package org.lessons.lesson10.futuretask;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {
    public static void main(String[] args) throws Exception {
        Callable<String> task = () -> {
            System.out.println("callable is running!");
            Thread.sleep(3000);

            return "Result from Callable!";
        };

        FutureTask<String> futureTask = new FutureTask<>(task);

        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("Task is executing!");
        String result = futureTask.get();
        System.out.println("Task result: " + result);
    }
}
