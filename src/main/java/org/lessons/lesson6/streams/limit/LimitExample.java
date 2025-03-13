package org.lessons.lesson6.streams.limit;

import java.util.List;

public class LimitExample {
    public static void main(String[] args) {
        List<Integer> largeListOfNums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> shortListOfNums = largeListOfNums.stream().limit(5).toList(); // первые 5 элементов

        System.out.println(shortListOfNums);
    }
}
