package org.lessons.practice.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String message = "Java is cool! Java is powerful. I love Java!";

        Map<String, Integer> wordFrequency = getWordFrequency(message);

        // сортируем
        List<Map.Entry<String, Integer>> sortedWords = sortWords(wordFrequency);

        System.out.println("Топ-3 самых популярных слов:");
        for (int i = 0; i < 3; i++) {
            System.out.println(sortedWords.get(i).getKey() + ": " + sortedWords.get(i).getValue());
        }

        // выводим все слова в порядке убывания
        System.out.println("\nВсе слова в порядке убывания частоты:");
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<String, Integer> getWordFrequency(String message) {
        String preparedMessage = message.replaceAll("[!,.]", "").toLowerCase(); // убираем возможные знаки препинания

        String[] messageSplit = preparedMessage.split(" ");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : messageSplit) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        return wordFrequency;
    }

    private static List<Map.Entry<String, Integer>> sortWords(Map<String, Integer> wordFrequency) {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordFrequency.entrySet());

        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        return sortedWords;
    }
}
