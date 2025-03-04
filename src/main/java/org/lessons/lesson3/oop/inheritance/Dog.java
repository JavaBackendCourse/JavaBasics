package org.lessons.lesson3.oop.inheritance;

public class Dog extends Animal {
    private int energyLevel; // Дополнительные переменные класса Dog
    private int numberOfTeeth;

    public Dog(String name, int age, int weight, int energyLevel, int numberOfTeeth) {
        super(name, age, weight);
        this.energyLevel = energyLevel;
        this.numberOfTeeth = numberOfTeeth;
    }

    // Getters and setters

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getNumberOfTeeth() {
        return this.numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    // Дополнительные методы класса Dog

    public void guard() {
        System.out.println(this.getName() + " охраняет территорию.");
    }

    public void roar() {
        System.out.println(this.getName() + " рычит.");
    }

    @Override
    public void voice() {
        System.out.println(getName() + " лает.");
    }

}
