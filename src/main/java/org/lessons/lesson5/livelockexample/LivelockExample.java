package org.lessons.lesson5.livelockexample;

public class LivelockExample {
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();

        Thread t1 = new Thread(() -> {
            while (true) {
                if (resource1.tryLock()) {
                    System.out.println("Thread 1: Захватил resource1, жду resource2...");

                    try { Thread.sleep(50); } catch (InterruptedException e) {}

                    if (resource2.tryLock()) {
                        System.out.println("Thread 1: Захватил оба ресурса!");
                        resource2.unlock();
                        resource1.unlock();
                        break;
                    } else {
                        System.out.println("Thread 1: Освобождаю resource1, пробую снова...");
                        resource1.unlock();
                    }
                }

                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                if (resource2.tryLock()) {
                    System.out.println("Thread 2: Захватил resource2, жду resource1...");

                    try { Thread.sleep(50); } catch (InterruptedException e) {}

                    if (resource1.tryLock()) {
                        System.out.println("Thread 2: Захватил оба ресурса!");
                        resource1.unlock();
                        resource2.unlock();
                        break;
                    } else {
                        System.out.println("Thread 2: Освобождаю resource2, пробую снова...");
                        resource2.unlock();
                    }
                }

                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
        });

        t1.start();
        t2.start();
    }
}