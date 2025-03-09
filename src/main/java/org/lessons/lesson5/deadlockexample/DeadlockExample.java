package org.lessons.lesson5.deadlockexample;

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource1");
        Resource resource2 = new Resource("Resource2");

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Захватил " + resource1.getName());

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Ожидает " + resource2.getName());
                synchronized (resource2) {
                    System.out.println("Thread 1: Захватил оба ресурса");
                }
            }

            System.out.println("Thread 1: Завершил работу");
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Захватил " + resource2.getName());

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Ожидает " + resource1.getName());
                synchronized (resource1) {
                    System.out.println("Thread 2: Захватил оба ресурса");
                }

                System.out.println("Thread 2: Завершил работу");
            }
        });

        t1.start();
        t2.start();
    }
}