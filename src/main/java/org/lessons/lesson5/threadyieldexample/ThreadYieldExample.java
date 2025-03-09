package org.lessons.lesson5.threadyieldexample;

public class ThreadYieldExample {
    public static void main(String[] args) {
        Thread th1 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1: " + i);
                    Thread.sleep(1000);
                    Thread.yield();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Thread th2 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 2: " + i);
                    Thread.sleep(1000);
                    if(i == 4)
                        Thread.interrupted();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Thread th3 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 3: " + i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        th1.start();
        th2.start();
        th3.start();

    }
}
