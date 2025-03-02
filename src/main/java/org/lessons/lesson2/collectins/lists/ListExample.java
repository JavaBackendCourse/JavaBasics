package org.lessons.lesson2.collectins.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> listOfFruits = new ArrayList<String>();

        // добавление элементов

        listOfFruits.add("Apple");
        listOfFruits.add("Banana");
        listOfFruits.add("Grapes");
        listOfFruits.add("Pear");
        listOfFruits.add("Orange");
        listOfFruits.add("Watermelon");

        System.out.println("Список фруктов:");

        // стандартный цикл for
        for(int i = 0; i < listOfFruits.size(); i++){
            System.out.println(listOfFruits.get(i));
        }

        System.out.println();

        // цикл for-each
        for (String fruit : listOfFruits) {
            System.out.println(fruit);
        }

        List<String> newListOfFruits = new ArrayList<>();

        // копирование элементов из одного списка в другой
        newListOfFruits.addAll(0, listOfFruits);
        newListOfFruits.add("Mango");
        newListOfFruits.add("Dragon Fruit");

        System.out.println();

        System.out.println("Обновленный список фруктов:");
        for(String fruit : newListOfFruits){
            System.out.println(fruit);
        }

        // Получение элементов ис списка

        String firstFruit = newListOfFruits.getFirst(); // альтернатива newListOfFruits.get(0)
        String secondFruit = newListOfFruits.get(1);
        String thirdFruit = newListOfFruits.get(2);

        System.out.printf("\nПервый фрукт: %s\nВторой фрукт: %s\nТретий фрукт: %s%n", firstFruit, secondFruit, thirdFruit);

        // Удаление элементов

        newListOfFruits.remove(firstFruit);

        System.out.println("\nОбновленный список фруктов после удаления:");
        for(String fruit : newListOfFruits){
            System.out.println(fruit);
        }
    }
}
