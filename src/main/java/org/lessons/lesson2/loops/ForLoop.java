package org.lessons.lesson2.loops;

public class ForLoop {
    public static void main(String[] args) {

        // пробег по возрастанию индекса
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n%d: Hello World", i);
        }

        System.out.println();

        int n = 10;

        // пробег по убыванию индекса
        for (int i = n; i > 0; i--) {
            System.out.printf("\n%d: Hello World", i);
        }

        System.out.println("\n");

        // пробег через два элемента по возрастанию
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("Итерация: " + i);
        }

        System.out.println();

        // пробег через два элемента по убыванию
        for (int i = 10; i > 0; i = i - 2) {
            System.out.println("Итерация: " + i);
        }
    }
}
