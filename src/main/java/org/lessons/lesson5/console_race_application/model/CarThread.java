package org.lessons.lesson5.console_race_application.model;

import org.lessons.lesson4.simple_console_application.customexception.CustomException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarThread extends Thread {
    private final String carName;
    private final int distance;
    private int progress = 0;

    private static final Random RANDOM = new Random();
    private static final List<String> RATING = new ArrayList<>();
    private static final Object LOCK = new Object();

    public CarThread(String name, int distance) {
        this.carName = name;
        this.distance = distance;
    }

    @Override
    public void run() {
        while (progress < distance) {
            progress += RANDOM.nextInt(5) + 1; // Двигаемся вперед (1-5)
            printProgress();
            try {
                Thread.sleep(RANDOM.nextInt(3000 - 1000 + 1) + 1000); // Задержка (1000-3000 мс)
            } catch (InterruptedException e) {
                throw new CustomException(
                        "Упс! машина сломалась!",
                        500
                );
            }
        }
        synchronized (LOCK) {
            RATING.add(carName);
        }
    }

    private void printProgress() {
        synchronized (System.out) {
            System.out.printf("%-10s | %s>%n", carName, "=".repeat(progress / 2));
        }
    }

    public String getCarName() {
        return carName;
    }

    public static List<String> getRating() {
        return RATING;
    }

    @Override
    public String toString() {
        return carName;
    }
}
