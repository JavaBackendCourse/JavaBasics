package org.lessons.practice2.task1.models;

import java.util.Random;

public class Car extends Thread {
    private final String name;
    private final int distance;
    private int progress = 0;
    private static final Random rand = new Random();

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public void run() {
        try {
            while (progress < distance) {
                int delay = rand.nextInt(3) + 1;
                Thread.sleep(delay * 1000);
                progress++;
            }

            System.out.println("Машина " + name + " финишировала!");
        } catch (Exception e) {
            System.out.println("Машина " + name + " поломалась и не может продолжить гонку!");
            e.printStackTrace();
        }
    }
}
