package org.lessons.lesson6.generic.exampleinterface;

public class IntegerContainer implements DataContainer<Integer> {
    private Integer data;

    public void add(Integer data) {
        this.data = data;
    }

    public Integer get() {
        return data;
    }
}
