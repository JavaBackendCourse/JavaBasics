package org.lessons.lesson6.generic.examplebounded;

public class GenericBoundedExample {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(5);
        Calculator<Double> doubleCalc = new Calculator<>(5.5);

        System.out.println("Квадрат числа: " + intCalc.square());
        System.out.println("Квадрат числа: " + doubleCalc.square());
    }
}
