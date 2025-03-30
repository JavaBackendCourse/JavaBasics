package org.lessons.practice2.task2;

import org.lessons.practice2.task2.models.CountDown;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("До старта ракеты:");
        CountDown countDown = new CountDown(5);
        countDown.start();

        try {
            countDown.join();
            System.out.println("Ракета взлетает!");
        } catch (Exception e) {
            System.out.println("Упс! Что-то пошло не так!");
        }
    }
}
