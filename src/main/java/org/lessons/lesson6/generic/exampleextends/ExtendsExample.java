package org.lessons.lesson6.generic.exampleextends;

import java.util.Arrays;
import java.util.List;

public class ExtendsExample {
    public static double sumNumbers(List<? extends Number> numbers) { // можно читать сипсок но не добавлять новые элементы!
        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intValues = Arrays.asList(1, 2, 3);
        List<Double> doubleValues = Arrays.asList(1.1, 2.2, 3.3);


        System.out.println("Sum: " + sumNumbers(intValues));
        System.out.println("Sum: " + sumNumbers(doubleValues));
    }
}
