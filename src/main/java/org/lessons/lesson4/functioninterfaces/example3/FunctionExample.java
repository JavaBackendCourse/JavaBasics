package org.lessons.lesson4.functioninterfaces.example3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> squared = x -> x * x;
        Function<String, String> greeting = x -> "Hello, " + x + "!";

        int squaredResult = squared.apply(10);
        String greetingResult = greeting.apply("Damir");

        System.out.println(squaredResult);
        System.out.println(greetingResult);

        BiFunction<Integer, Integer, Integer> addition = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> subtraction = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> multiplication = (x, y) -> x * y;
        BiFunction<Integer, Integer, Double> division = (x, y) -> (double) x / y;

        int additionResult = addition.apply(1, 2);
        int subtractionResult = subtraction.apply(1, 2);
        int multiplicationResult = multiplication.apply(1, 2);
        double divisionResult = division.apply(1, 2);

        System.out.println("Addition Result: " + additionResult);
        System.out.println("Subtraction Result: " + subtractionResult);
        System.out.println("Multiplication Result: " + multiplicationResult);
        System.out.println("Division Result: " + divisionResult);

    }
}
