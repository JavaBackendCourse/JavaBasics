package org.lessons.lesson2.collectins.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> animals = new HashSet<>(); // хранит только уникальные значения, не сохраняет порядок элементов

        Set<String> animalsOrdered = new LinkedHashSet<>(); // хранит только уникальные значения, сохраняет порядок элементов

        // Добавление элементов

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        animals.add("Wolf");
        animals.add("Fox");
        animals.add("Bear");
        animals.add("Dog");
        animals.add("Rabbit");

        animalsOrdered.add("Dog");
        animalsOrdered.add("Cat");
        animalsOrdered.add("Rabbit");
        animalsOrdered.add("Wolf");
        animalsOrdered.add("Fox");
        animalsOrdered.add("Bear");
        animalsOrdered.add("Dog");
        animalsOrdered.add("Rabbit");

        System.out.println("Множество:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Удаление конкретного элемента

        animals.removeIf(animal -> Objects.equals(animal, "Fox"));

        System.out.println("\nОбновленное множество после удаления Fox:");

        for (String animal : animals) {
            System.out.println(animal);
        }

        // Удаление всех элементов множества

        animals.clear();

        System.out.println("\nОбновленное множество после очистки всех элементов:");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
