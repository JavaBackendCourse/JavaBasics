package org.lessons.lesson6.generic.example2;

public class Utils {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
    }
}
