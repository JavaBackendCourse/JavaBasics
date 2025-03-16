package org.lessons.lesson6.streams.parallel;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> transactions = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000);

        int totalDeposit = transactions.parallelStream()
                .filter(amount -> amount > 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Общая сумма депозитов: " + totalDeposit);
    }
}
