package org.lessons.lesson6.generic.exampleinterface;

public class StringContainer implements DataContainer<String> {
    private String data;

    public void add(String data) {
        this.data = data;
    }

    public String get() {
        return data;
    }
}
