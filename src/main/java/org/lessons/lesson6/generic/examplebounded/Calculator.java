package org.lessons.lesson6.generic.examplebounded;

public class Calculator<T extends Number> { // может принимать Number и все его наследники
    private T num;

    public Calculator(T num) {
        this.num = num;
    }

    public double square() {
        return num.doubleValue() * num.doubleValue();
    }
}
