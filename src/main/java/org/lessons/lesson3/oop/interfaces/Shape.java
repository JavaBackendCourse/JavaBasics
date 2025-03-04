package org.lessons.lesson3.oop.interfaces;

public abstract class Shape implements Drawable, Printable { // интерфейсы позволяют реализовывать множественное наследование
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
