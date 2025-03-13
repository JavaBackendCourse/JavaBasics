package org.lessons.lesson6.generic.examplesuper;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundExample {
    private static void printCarnivoreList(List<? super Carnivore> carnivoreList) { // можно передать Carnivore и любой его родительский класс
        for (var carnivore : carnivoreList) {
            System.out.println("Carnivore: " + carnivore);
        }
    }

    public static void main(String[] args) {
        List<Lion> lionList = new ArrayList<>();
        lionList.add(new Lion("Lion"));
        lionList.add(new Lion("Lion2"));
        List<Carnivore> lionList2 = new ArrayList<>();

        lionList2.add(new Carnivore("Lion3"));
        lionList2.add(new Carnivore("Lion4"));

        printCarnivoreList(lionList2);
    }
}
