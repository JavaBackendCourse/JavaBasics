package org.lessons.lesson6.streams.calc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Functional", "Programming");

        Optional<String> longestWord = words.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        longestWord.ifPresent(word -> System.out.println("Самое длинное слово: " + word));
    }
}
