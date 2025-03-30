package org.lessons.practice2.task1;

import org.lessons.practice2.task1.models.Car;

public class Task1 {
    public static void main(String[] args) {
        int raceDistance = 3;

        Car car1 = new Car("Ferrari", raceDistance);
        Car car2 = new Car("Lamborghini", raceDistance);
        Car car3 = new Car("McLaren", raceDistance);
        Car car4 = new Car("Bugatti", raceDistance);
        Car car5 = new Car("Porsche", raceDistance);

        System.out.println("🏁 ГОНКА НАЧИНАЕТСЯ! 🏁");
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
    }
}
