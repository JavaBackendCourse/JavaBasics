package org.lessons.lesson1.datatypes;

import java.util.ArrayList;
import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        // Примитивные типы

        byte a = 1;
        int b = 10;
        float c = 10.5F;
        double d = 5.1;
        boolean e = true;
        char f = 'A';

        // Ссылочные типы

        String name = "John Doe";

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        char[] arr2 = {'a', 'b', 'c', 'd', 'e', 'f' };

        String[] arr3 = {"ABC", "DEF", "GHI"};

        class Person {
            private String name;
            private int age;

            private Date birthDate;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public Date getBirthDate() {
                return birthDate;
            }

            public void setBirthDate(Date birthDate) {
                this.birthDate = birthDate;
            }

            public Person(String name, int age, Date birthDate) {
                this.name = name;
                this.age = age;
                this.birthDate = birthDate;
            }
        }

        Person p = new Person("John Doe", 10, new Date());

        // Обертки над примитивными типами
        Integer intWrapped = 10;
        Character charWrapped = 'a';
        Double doubleWrapped = 5.1;
        Float floatWrapped = 5.1F;
        Long longWrapped = 5L;
        Byte byteWrapped = 'a';

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");

    }
}
