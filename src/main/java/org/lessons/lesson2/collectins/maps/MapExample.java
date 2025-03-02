package org.lessons.lesson2.collectins.maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> countryCapitals = new HashMap<>();

        // Добавление элементов

        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Japan", "Tokyo");

        // Вывод ключа и значения
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println("Страна: " + entry.getKey() + ", Столица: " + entry.getValue());
        }

        System.out.println();

        // Вывод ключей
        for(String country : countryCapitals.keySet()) {
            System.out.println("Страна: " + country);
        }

        System.out.println();

        // Вывод значений
        for(String capital : countryCapitals.values()) {
            System.out.println("Столица: " + capital);
        }
    }
}
