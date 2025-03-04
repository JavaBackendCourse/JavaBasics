package org.lessons.lesson3.oop.interfaces;

public class Circle extends Shape {

    public Circle(String color) {
        super(color); // вызов конструктора родительского класса (суперкласса)
    }

    @Override
    public void draw() {
        System.out.println("Рисуем Круг!");
    }

    @Override
    public void print() {
        System.out.println("Распечатаем Круг!");
    }
}
