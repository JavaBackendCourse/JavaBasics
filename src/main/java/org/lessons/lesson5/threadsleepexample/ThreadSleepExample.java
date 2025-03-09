package org.lessons.lesson5.threadsleepexample;

public class ThreadSleepExample {
    public static void main(String[] args) {
        Counter counter1 = new Counter("Counter 1", 5);
        Counter counter2 = new Counter("Counter 2", 5);
        Counter counter3 = new Counter("Counter 3", 5);

        counter1.start();
        counter2.start();
        counter3.start();

        System.out.println("Main thread is finished!");
    }
}
