package org.lessons.lesson5.threadexample;

public class MyThread extends Thread {
    public void run() {
        System.out.println("My Thread is running!");
        System.out.println("My Thread is finished!");
    }
}