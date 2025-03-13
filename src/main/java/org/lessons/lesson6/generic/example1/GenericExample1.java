package org.lessons.lesson6.generic.example1;

public class GenericExample1 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);

        System.out.println("Значение: " + intBox.getValue());


        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");

        System.out.println("Значение: " + stringBox.getValue());
    }
}
