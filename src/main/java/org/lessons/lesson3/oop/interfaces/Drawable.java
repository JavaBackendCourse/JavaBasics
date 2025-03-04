package org.lessons.lesson3.oop.interfaces;

public interface Drawable {
    default void draw() { // метод с дефолтной реализацией
        System.out.println("Базовый клсс рисует!");
    }
}
