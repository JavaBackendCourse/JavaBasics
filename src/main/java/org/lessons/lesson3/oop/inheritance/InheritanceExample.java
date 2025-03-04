package org.lessons.lesson3.oop.inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 5, 20, 80, 42);
        dog.run();
        dog.guard();
        dog.roar();
        dog.voice();

        System.out.println();

        Cat cat = new Cat("Мурка", 3, 5, "Игривая");
        cat.eat();
        cat.purr();
        cat.play();
        cat.voice();

        System.out.println();

        Horse horse = new Horse("Буцефал", 7, 500, 90);
        horse.voice();
        horse.walk();
        horse.gallop();
        horse.voice();
    }
}
