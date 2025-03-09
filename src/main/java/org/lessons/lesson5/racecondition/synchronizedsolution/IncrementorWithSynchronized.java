package org.lessons.lesson5.racecondition.synchronizedsolution;

public class IncrementorWithSynchronized {
    private int count = 17;

    public synchronized  void increment() {
        int temp = count;
        try {
            Thread.sleep(10);
        } catch (InterruptedException ignored) {
        }
        count = temp + 1;
    }

    public int getCount() {
        return count;
    }
}
