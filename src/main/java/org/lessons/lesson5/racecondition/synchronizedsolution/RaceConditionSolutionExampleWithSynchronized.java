package org.lessons.lesson5.racecondition.synchronizedsolution;

public class RaceConditionSolutionExampleWithSynchronized {
    public static void main(String[] args) throws InterruptedException {
        IncrementorWithSynchronized inc = new IncrementorWithSynchronized();

        Thread t1 = new Thread(() -> {
            inc.increment();
        });

        Thread t2 = new Thread(() -> {
            inc.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Ожидаемый результат: 19");
        System.out.println("Фактический результат: " + inc.getCount());
    }
}
