package org.lessons.lesson5.console_race_application.app;

import org.lessons.lesson5.console_race_application.model.CarThread;

import java.util.*;

public class SimpleRaceApplication {
    private List<CarThread> cars = new ArrayList<>();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\uD83C\uDFC1 Добро пожаловать на гонки! \uD83C\uDFC1");

        prepareRace(scanner);
        gameStart(scanner);
    }

    private void prepareRace(Scanner sc) {
        setGameParameters(sc);
        System.out.println("✅ Игра готова! 🎮");
    }

    private void setGameParameters(Scanner sc) {
        System.out.println("Введите дистанцию:");
        int raceDistance = sc.nextInt();

        System.out.println("⚙\uFE0F⚙\uFE0F Идет подготовка игры... ⚙\uFE0F⚙\uFE0F");
        cars = AppHelper.prepareCars(raceDistance);
    }

    private void gameStart(Scanner sc) {
        System.out.println("Вот машины, участвующие в гонке:");

        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("[%d] %s%n", i + 1, cars.get(i));
        }

        System.out.print("\n🚗 На какую машину ставите? Введите номер: ");
        int choice = sc.nextInt() - 1;

        if (choice < 0 || choice >= cars.size()) {
            System.out.println("❌ Ошибка! Такой машины нет! Попробуйте еще раз!");
            gameStart(sc);
        }

        System.out.println("Гонка начиниается!!!");

        CarThread bet = cars.get(choice);

        for (CarThread car : cars) {
            car.start();
        }

        for (CarThread car : cars) {
            try {
                car.join();
            } catch (InterruptedException e) {
                System.out.printf("Упс! У машины %s произошла поломка!", car.getName());
            }
        }

        printGameResults(cars, bet);
    }

    private static void printGameResults(List<CarThread> cars, CarThread bet) {
        System.out.println("\n🏆 Машины финишировали! Таблица результатов:");
        List<String> rating = CarThread.getRating();

        for (int i = 0; i < rating.size(); i++) {
            System.out.println((i + 1) + ". " + rating.get(i));
        }

        if (rating.getFirst().equals(bet.getCarName())) {
            System.out.println("\n🎉 Поздравляем! Ваша машина выиграла гонку! Вы получаете приз! 🎉");
        } else {
            System.out.println("\n😞 Увы, ваша машина не пришла первой. Попробуйте снова!");
        }
    }
}
