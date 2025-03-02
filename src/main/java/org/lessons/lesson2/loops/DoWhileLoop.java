package org.lessons.lesson2.loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;

        // по возрастанию индекса
        do {
            System.out.printf("\n%d: Hello World", i);
            i++; // increment
        } while (i < 10);

        System.out.println();

        // по убыванию индекса
        do {
            System.out.printf("\n%d: Hello World", i);
            i--; // decrement
        } while (i > 0);
    }
}
