package org.lessons.lesson10.completablefuture.runasync;

import java.util.concurrent.CompletableFuture;

public class FireAlarmSimulation {
    public static void main(String[] args) {
        System.out.println("🔥 Пожарная тревога! Начинаем эвакуацию...");

        CompletableFuture.runAsync(() -> {
            sleep(5000);

            System.out.println("🔥🔥🔥 Вы сгорели!!! 🔥🔥🔥");
            System.exit(0);
        });

//        activateAlarm();
//        evacuatePeople();
//        callFirefighters();
//        checkFalseAlarm();

        var f1 = CompletableFuture.runAsync(FireAlarmSimulation::activateAlarm);
        var f2 = CompletableFuture.runAsync(FireAlarmSimulation::evacuatePeople);
        var f3 = CompletableFuture.runAsync(FireAlarmSimulation::callFirefighters);
        var f4 = CompletableFuture.runAsync(FireAlarmSimulation::checkFalseAlarm);

        CompletableFuture.allOf(f1, f2, f3, f4).join();

        System.out.println("✅ Все процессы выполнены!");
        System.out.println("✅ Вы спасены!");
    }

    private static void activateAlarm() {
        sleep(500);
        System.out.println("🔔 Сигнал тревоги активирован!");
    }

    private static void evacuatePeople() {
        sleep(2000);
        System.out.println("🏃‍♂️ Люди эвакуированы!");
    }

    private static void callFirefighters() {
        sleep(1000);
        System.out.println("🚒 Пожарные в пути!");
    }

    private static void checkFalseAlarm() {
        sleep(3000);
        System.out.println("🤔 Проверка завершена... Тревога НЕ ложная!");
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}