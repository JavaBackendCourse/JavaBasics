package org.lessons.lesson5.console_race_application.app;

import org.lessons.lesson5.console_race_application.model.CarThread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AppHelper {
    public static List<CarThread> prepareCars(int distance) {
        System.out.println("Подготавливаем машины...");

        return getCars(distance);
    }

    private static List<CarThread> getCars(int distance) {
        List<CarThread> cars = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(
                "C:\\Users\\Damir\\IdeaProjects\\School\\test\\lessons\\src\\main\\java\\org\\lessons\\lesson5\\threads\\basics\\console_race_application\\db\\racing_cars.txt"))) {
            String row = "";

            while ((row = br.readLine()) != null) {
                cars.add(new CarThread(row, distance));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cars;
    }
}
