package org.lessons.lesson3.oop.interfaces;

public class Rectangle extends Shape {

    public Rectangle(String color) {
        super(color); // вызов конструктора родительского класса (суперкласса)
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник!");
    }

    @Override
    public void print() {
        System.out.println("Распечатаем прямоугольник!");
    }
}
