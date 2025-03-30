package org.lessons.practice.task4;

public class Task4 {
    public static void main(String[] args) {
        // With unsafe counter
        UnsafeCounter unSafeCounter = new UnsafeCounter();

        Thread incrementThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                unSafeCounter.increment();
            }
        });

        Thread decrementThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                unSafeCounter.decrement();
            }
        });

        incrementThread1.start();
        decrementThread1.start();

        try {
            incrementThread1.join();
            decrementThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Итоговое значение небезопасного счетчика: " + unSafeCounter.getCount());

        // With safe counter
        SafeCounter safeCounter = new SafeCounter();

        Thread incrementThread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.increment();
            }
        });

        Thread decrementThread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.decrement();
            }
        });

        incrementThread2.start();
        decrementThread2.start();

        try {
            incrementThread2.join();
            decrementThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Итоговое значение безопасного счетчика: " + safeCounter.getCount());
    }
}
