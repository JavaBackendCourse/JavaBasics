package org.lessons.lesson5.deadlockexample.trylocksolution;

public class DeadlockSolutionWithTryLock {
    public static void main(String[] args) {
        SafeResource res1 = new SafeResource("Resource1");
        SafeResource res2 = new SafeResource("Resource2");

        Thread t1 = new Thread(() -> {
            while (true) {
                if (res1.tryLock()) {
                    try {
                        if (res2.tryLock()) {
                            try {
                                System.out.println("Thread 1: Захватил оба ресурса");
                                break;
                            } finally {
                                res2.unlock();
                            }
                        }
                    } finally {
                        res1.unlock();
                        System.out.println("Thread 1: Завершил работу");
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                if (res2.tryLock()) {
                    try {
                        if (res1.tryLock()) {
                            try {
                                System.out.println("Thread 2: Захватил оба ресурса");
                                break;
                            } finally {
                                res1.unlock();
                            }
                        }
                    } finally {
                        res2.unlock();
                        System.out.println("Thread 2: Завершил работу");
                    }
                }
            }
        });

        t1.start();
        t2.start();

        System.out.println("Main thread is finished!");
    }
}
