package org.lessons.lesson5.racecondition.atomicsolution;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementorWithAtomicInteger {
    private final AtomicInteger count =  new AtomicInteger(17);

    public synchronized  void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ignored) {
        }
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
