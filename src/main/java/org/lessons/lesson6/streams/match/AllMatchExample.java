package org.lessons.lesson6.streams.match;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);

        System.out.println("Все числа четные? " + allEven);

        System.out.println();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        boolean allCapitalized = names.stream().allMatch(name -> Character.isUpperCase(name.charAt(0)));

        System.out.println("Все имена с заглавной буквы? " + allCapitalized);
    }
}
