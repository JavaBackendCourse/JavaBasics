package org.lessons.lesson5.racecondition.atomicsolution;

import org.lessons.lesson5.racecondition.synchronizedsolution.IncrementorWithSynchronized;

public class RaceConditionSolutionWithAtomicInteger {
    public static void main(String[] args) throws InterruptedException {
        IncrementorWithAtomicInteger inc = new IncrementorWithAtomicInteger();

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
