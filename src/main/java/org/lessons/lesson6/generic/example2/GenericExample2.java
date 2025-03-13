package org.lessons.lesson6.generic.example2;

public class GenericExample2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"A", "B", "C"};

        Utils.printArray(intArray);
        System.out.println();
        Utils.printArray(stringArray);
    }
}
