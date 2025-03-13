package org.lessons.lesson6.streams.skip;

import java.util.List;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numsWithoutFirstTwo = nums.stream().skip(2).toList(); // пропускает первые два элемента

        System.out.println(numsWithoutFirstTwo);
    }
}
