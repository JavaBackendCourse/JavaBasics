package org.lessons.lesson6.streams.foreach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(name -> System.out.println(name));

        System.out.println();

        Map<Integer, String> users = new HashMap<>();
        users.put(1, "Alice");
        users.put(2, "Bob");
        users.put(3, "Charlie");

        users.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
    }
}
