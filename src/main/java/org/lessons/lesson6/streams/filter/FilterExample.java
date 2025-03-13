package org.lessons.lesson6.streams.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // вывод нечетных чисел

        // без использования stream
        List<Integer> evenNums = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                evenNums.add(num);
            }
        }

        System.out.println("EVEN: " + evenNums);

        // с использованием stream
        List<Integer> evenNumbers = nums.stream().filter(r -> r % 2 != 0).toList(); // фильтрация и вывод только делящихся на 2 чисел
        System.out.println("EVEN: " + evenNumbers);


        List<String> names = List.of("Aigerim", "Malika", "Adema", "Ivan", "Oleg", "Damir");
        names.stream().filter(n -> n.length() == 5).forEach(System.out::println);
    }
}
