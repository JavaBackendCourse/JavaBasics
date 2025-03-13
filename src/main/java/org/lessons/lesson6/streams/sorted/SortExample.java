package org.lessons.lesson6.streams.sorted;

import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Integer> unsortedList = List.of(22, 10, 5, 27, 15, 17, 1, 3);

        List<Integer> sortedListAsc = unsortedList.stream().sorted().toList(); // в порядке возрастания
        List<Integer> sortedListDesc = unsortedList.stream().sorted(Comparator.reverseOrder()).toList(); // в порядке убывания

        System.out.println("SORTED ASC: " + sortedListAsc);
        System.out.println("SORTED DESC: " + sortedListDesc);
    }
}
