package org.lessons.lesson5.threadjoinexample;

import org.lessons.lesson5.threadsleepexample.Counter;

public class ThreadJoinExample {
    public static void main(String[] args) {
        Counter counter1 = new Counter("Counter 1", 5);
        Counter counter2 = new Counter("Counter 2", 5);
        Counter counter3 = new Counter("Counter 3", 5);

        try {
            counter1.start();
            counter1.join(); // ждет пока counter1 полностью не завершит свою работу прежде чем идти дальше
            counter2.start();
            counter3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
