package org.lessons.lesson6.generic.exampleinterface;

public class GenericInterfaceExample {
    public static void main(String[] args) {
        StringContainer container = new StringContainer();
        container.add("Hello world!");
        System.out.println("Container: " + container.get());


        IntegerContainer integerContainer = new IntegerContainer();
        integerContainer.add(1);
        System.out.println("Container: " + integerContainer.get());
    }
}
