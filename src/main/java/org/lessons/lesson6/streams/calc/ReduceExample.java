package org.lessons.lesson6.streams.calc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream().reduce(0, Integer::sum); // reduce(identity, accumulator)

        System.out.println("Сумма чисел: " + sum);


        System.out.println();


        List<Integer> numbers2 = Arrays.asList(2, 3, 4, 5);

        Optional<Integer> product = numbers2.stream().reduce((a, b) -> a * b);

        product.ifPresent(p -> System.out.println("Произведение чисел: " + p));

        System.out.println();

        List<String> words = Arrays.asList("Java", "Stream", "API", "Functional", "Programming");

        Optional<String> longestWord = words.stream()
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);


        longestWord.ifPresent(word -> System.out.println("Самое длинное слово: " + word));
    }
}
