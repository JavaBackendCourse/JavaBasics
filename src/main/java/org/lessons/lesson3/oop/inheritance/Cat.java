package org.lessons.lesson3.oop.inheritance;

public class Cat extends Animal {
    private String mood; // дополнительная переменная класса Cat

    public Cat(String name, int age, int weight, String mood) {
        super(name, age, weight);
        this.mood = mood;
    }

    // Getters and Setters

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return this.mood;
    }

    // Дополнительные методы класса Cat

    public void purr() {
        System.out.println(this.getName() + " мурлычет.");
    }

    public void play() {
        System.out.println(this.getName() + " играет.");
    }

    @Override
    public void voice() {
        System.out.println(getName() + " мяукает.");
    }
}
