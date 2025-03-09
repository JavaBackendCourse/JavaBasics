package org.lessons.lesson5.threadexample;

public class ThreadExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main Thread is running!");
    }
}
