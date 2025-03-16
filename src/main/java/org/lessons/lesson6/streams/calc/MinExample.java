package org.lessons.lesson6.streams.calc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 8, 30);

        Optional<Integer> minNumber = numbers.stream().min(Integer::compare);

        minNumber.ifPresent(n -> System.out.println("Минимальное число: " + n));
    }
}
