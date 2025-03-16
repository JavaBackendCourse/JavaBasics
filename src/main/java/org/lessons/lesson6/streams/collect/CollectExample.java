package org.lessons.lesson6.streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(" Alice", " Bob ", " Charlie", "Alice ");

        List<String> nameList = names.stream()
                .map(String::trim)
                .collect(Collectors.toList()); // Собираем в List

        Set<String> nameSet = nameList.stream()
                .collect(Collectors.toSet()); // Собираем в Set (уникальные значения)

        System.out.println("List: " + nameList);
        System.out.println("Set: " + nameSet);


        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");

        Map<String, Long> fruitCount = fruits.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println("\nFruits and counts: " + fruitCount);
    }
}
