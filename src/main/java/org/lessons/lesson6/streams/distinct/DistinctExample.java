package org.lessons.lesson6.streams.distinct;

import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<String> colors = List.of("red", "blue", "green", "yellow", "orange", "pink", "red", "blue", "green");

        List<String> colorsWithoutDuplicates =colors.stream().distinct().toList(); // только уникальные элементы

        System.out.println(colorsWithoutDuplicates);
    }
}
