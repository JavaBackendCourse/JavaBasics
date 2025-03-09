package org.lessons.lesson5.threadsleepexample;

public class Counter extends Thread {
    private final String name;
    private final int limit;

    public Counter(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }

    public void run() {
        try {
            for(int i = 0; i < limit; i++) {
                System.out.printf("%s: %d\n", name, i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
