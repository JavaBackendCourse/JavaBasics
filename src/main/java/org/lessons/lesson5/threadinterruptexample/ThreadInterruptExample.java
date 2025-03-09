package org.lessons.lesson5.threadinterruptexample;

public class ThreadInterruptExample {
    public static void main(String[] args) {
        Thread tr = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep!");
                Thread.sleep(10000);
                System.out.println("Thread is woken up!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread tr2 = new Thread(() -> {
            try {
                int idx = 0;
                while(true) { // бесконечный цикл
                    System.out.println(idx);
                    idx++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        tr2.start();

        try {
            Thread.sleep(5000);
            tr2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
