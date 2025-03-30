package org.lessons.practice.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое слово:");
        String word1 = sc.nextLine();

        System.out.println("Введите второе слово:");
        String word2 = sc.nextLine();

        if (isAnagram(word1, word2))
            System.out.println("Введенные строки являются анаграммами!");
        else
            System.out.println("Введеные строки анаграммами не являются!");
    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1 == null || word2 == null || word1.length() != word2.length()) {
            return false;
        }

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
