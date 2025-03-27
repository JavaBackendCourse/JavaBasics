package org.lessons.lesson10.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExampleWithoutReturn {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Runnable task1 = () -> System.out.println(Thread.currentThread().getName() + ": Выплняю задачу 1");
        Runnable task2 = () -> System.out.println(Thread.currentThread().getName() + ": Выплняю задачу 2");
        Runnable task3 = () -> System.out.println(Thread.currentThread().getName() + ": Выплняю задачу 3");
        Runnable task4 = () -> System.out.println(Thread.currentThread().getName() + ": Выплняю задачу 4");

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);

    }
}
