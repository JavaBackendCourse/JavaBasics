package org.lessons.lesson6.streams.match;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        boolean hasOdd = numbers.stream().anyMatch(n -> n % 2 != 0);

        System.out.println("Есть ли нечетное число? " + hasOdd);

        System.out.println();

        List<String> names = Arrays.asList("Anna", "Bob", "Alexander");

        boolean hasLowerCaseName = names.stream().anyMatch(name -> Character.isLowerCase(name.charAt(0)));

        System.out.println("Есть ли не с заглавной буквы? " + hasLowerCaseName);
    }
}
