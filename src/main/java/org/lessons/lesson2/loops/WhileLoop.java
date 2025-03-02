package org.lessons.lesson2.loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;

        // по возрастанию индекса
        while (i < 10) {
            System.out.printf("\n%d: Hello World", i);
            i++; // increment
        }

        System.out.println("\n");

        i = 10;

        // по убыванию индекса
        while (i > 0) {
            System.out.printf("\n%d: Hello World", i);
            i--; // decrement
        }
    }
}
