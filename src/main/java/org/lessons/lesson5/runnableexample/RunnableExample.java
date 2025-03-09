package org.lessons.lesson5.runnableexample;

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        Thread thread2 = new Thread(() -> System.out.println("Thread2 is running!"));
        thread2.start();

//        try {
//            thread.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        System.out.println("Main thread is running!");
    }
}
