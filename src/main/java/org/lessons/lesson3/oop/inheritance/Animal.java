package org.lessons.lesson3.oop.inheritance;

public abstract class Animal { // абстрактный класс предоставляет дефолтную реализацию своим наследникам, но из него нельзя создавать объекты
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weight) { // Конструктор абстрактного класа, из него нельзя создать объект, т.к. класс абстрактный
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getters and Setters

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Дефолтный методы

    public void run() {
        System.out.println(name + " бежит."); // Дефолтная реализация
    }

    public void eat() {
        System.out.println(name + " ест."); // Дефолтная реализация
    }

    public void voice() {
        System.out.println(name + " издает звук."); // Дефолтная реализация
    }

    public void sleep() {
        System.out.println(name + " спит."); // Дефолтная реализация
    }
}
