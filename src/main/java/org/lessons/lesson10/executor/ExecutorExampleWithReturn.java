package org.lessons.lesson10.executor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExampleWithReturn {
    public static void main(String[] args) {
        System.out.println("Основной потока начал выполнение...");

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Future<Integer> sumTenFuture = executorService.submit(ExecutorExampleWithReturn::sumOfTenThousandElements);

        Future<Integer> sumFiveFuture = executorService.submit(ExecutorExampleWithReturn::sumOfFiveThousandElements);

        Future<Integer> sumTwentyFuture = executorService.submit(ExecutorExampleWithReturn::sumOfTwentyThousandElements);

        System.out.println("Основной поток продолжает выполнение...");

        try {
            long startTime = System.currentTimeMillis();

            int sumTen = sumTenFuture.get(); // блокирущий метод
            int sumFive = sumFiveFuture.get();
            int sumTwenty = sumTwentyFuture.get();

            long endTime = System.currentTimeMillis();
            long timeDiff = (endTime - startTime) / 1000;

            System.out.println("Сумма 10000: " + sumTen);
            System.out.println("Сумма 5000: " + sumFive);
            System.out.println("Сумма 20000: " + sumTwenty);

            System.out.println("Общее время ожидания: " + timeDiff + " секунд!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    private static int doubleNum(int num) {
        return num * 2;
    }

    private static int sumOfTenThousandElements() throws InterruptedException {
        System.out.println("[sumOfTenThousandElements] started");
        Thread.sleep(10000);

        int sum = 0;

        for (int i = 0; i < 10000; i++) {
            sum += i;
        }

        System.out.println("[sumOfTenThousandElements] finished");
        return sum;
    }

    private static int sumOfTwentyThousandElements() throws InterruptedException {
        System.out.println("[sumOfTwentyThousandElements] started");
        Thread.sleep(10000);
        int sum = 0;

        for (int i = 0; i < 10000; i++) {
            sum += i;
        }

        System.out.println("[sumOfTwentyThousandElements] finished");
        return sum;
    }

    private static int sumOfFiveThousandElements() throws InterruptedException {
        System.out.println("[sumOfTwentyThousandElements] started");
        Thread.sleep(10000);
        int sum = 0;

        for (int i = 0; i < 10000; i++) {
            sum += i;
        }

        System.out.println("[sumOfTwentyThousandElements] finished");
        return sum;
    }
}
