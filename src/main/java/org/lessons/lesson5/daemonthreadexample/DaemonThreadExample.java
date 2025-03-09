package org.lessons.lesson5.daemonthreadexample;

import org.lessons.lesson5.threadsleepexample.Counter;

// DaemonThread - поток, который выполняется в бэкграунде. При остановке основного потока daemon thread тоже останавливается даже если он не закончил свое выполнение
public class DaemonThreadExample {
    public static void main(String[] args) {
        Counter counter1 = new Counter("Counter 1", 10);
        Counter counter2 = new Counter("Counter 2", 5);

        counter1.setDaemon(true);
        counter1.start();
        counter2.start();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is finished!");
    }
}
