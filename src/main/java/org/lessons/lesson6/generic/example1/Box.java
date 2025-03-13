package org.lessons.lesson6.generic.example1;

public class Box<T> { // T - это обобщенный тип (может принимать любой тип)
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
