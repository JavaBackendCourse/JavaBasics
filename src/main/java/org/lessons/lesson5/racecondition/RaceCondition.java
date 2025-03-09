package org.lessons.lesson5.racecondition;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        IncrementNotSafe inc = new IncrementNotSafe();

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

        // atomic integer example

//        Incrementor2 inc2 = new Incrementor2();
//
//        Thread t3 = new Thread(() -> {
//            inc2.increment();
//        });
//
//        Thread t4 = new Thread(() -> {
//            inc2.increment();
//        });
//
//        t3.start();
//        t4.start();
//
//        t3.join();
//        t4.join();
//
//        System.out.println("Ожидаемый результат: 19");
//        System.out.println("Фактический результат: " + inc2.getCount());
    }
}
