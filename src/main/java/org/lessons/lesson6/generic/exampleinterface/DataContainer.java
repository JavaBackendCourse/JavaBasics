package org.lessons.lesson6.generic.exampleinterface;

public interface DataContainer<T> {
    void add(T data);

    T get();
}
