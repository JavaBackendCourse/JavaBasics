package org.lessons.lesson6.streams.map;

import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numsDoubled = nums.stream().map(r -> r * 2).toList(); // преобразование элементом потока (умножение на 2)

        System.out.println(numsDoubled);


        List<String> names = List.of("Damir", "Petr", "Aleksandr", "Anel", "Zhansaya");

        List<Person> people = names.stream().map(Person::new).toList(); // преобразование элементом потока (созлание объекта класса Person)

        System.out.println(people);
    }
}
