package org.lessons.lesson3.oop.interfaces;

public class InheritanceWithInterfacesExample {
    public static void main(String[] args) {
        Shape circle = new Circle("red"); // upcasting, перевод конкретного класса в его родительский класс
        Circle newCircle = (Circle) circle; // downcasting, перевод родительского класса в конкретный класс

        Shape rectangle = new Rectangle("blue");


        circle.draw();
        newCircle.draw();
        rectangle.draw();

        System.out.println();

        rectangle.print();
        newCircle.print();
        circle.print();
    }
}
