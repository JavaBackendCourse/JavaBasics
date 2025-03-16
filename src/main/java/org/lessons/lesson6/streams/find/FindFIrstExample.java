package org.lessons.lesson6.streams.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFIrstExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 8, 10, 12);

        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        firstEven.ifPresent(n -> System.out.println("Первый четный: " + n));

        System.out.println();

        List<String> words = Arrays.asList("Java", "Stream", "API", "Functional");

        Optional<String> firstLongWord = words.stream()
                .filter(word -> word.length() > 4)
                .findFirst();

        System.out.println("Первое длинное слово: " + firstLongWord.orElse("Не найдено"));
    }
}
