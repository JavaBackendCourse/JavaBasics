package org.lessons.lesson3.oop.inheritance;

public class Horse extends Animal {
    private int strengthLevel; // Дополнительная переменная класса Horse

    public Horse(String name, int age, int weight, int strengthLevel) {
        super(name, age, weight);
        this.strengthLevel = strengthLevel;
    }

    // Getters and Setters
    public int getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    // Дополнительные методы класса Horse
    public void walk() {
        System.out.println(getName() + " идет.");
    }

    public void gallop() {
        System.out.println(getName() + " скачет галопом.");
    }
}
