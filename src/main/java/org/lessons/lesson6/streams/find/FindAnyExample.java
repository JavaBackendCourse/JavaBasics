package org.lessons.lesson6.streams.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 8, 10, 12);

        Optional<Integer> anyEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findAny();

        anyEven.ifPresent(n -> System.out.println("Любой четный: " + n));

        System.out.println();

        List<String> words = Arrays.asList("Java", "Stream", "API", "Spring");

        Optional<String> anySWord = words.stream()
                .filter(word -> word.startsWith("S"))
                .findAny();

        anySWord.ifPresent(word -> System.out.println("Любое слово на 'S': " + word));
    }
}
