package org.lessons.lesson6.streams.match;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean noNegative = numbers.stream().noneMatch(n -> n < 0);

        System.out.println("Нет ли отрицательных чисел? " + noNegative);


        System.out.println();

        List<String> words = Arrays.asList("Java", "Stream", "API", "s");

        boolean noEmptyStrings = words.stream().noneMatch(String::isEmpty);

        System.out.println("Нет ли пустых строк? " + noEmptyStrings);
    }
}
