package org.lessons.lesson4.inputOutputStreams.characterstreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharInputStreamExample {
    public static void main(String[] args) {
        // Путь к файлу указываете свой
        try (BufferedReader br = new BufferedReader(new FileReader(
                "C:\\Users\\Damir\\IdeaProjects\\School\\JavaBackend\\practice\\src\\main\\java\\org\\lessons\\lesson4\\inputOutputStreams\\characterstreams\\files\\br_example.txt"))) {
            String line;

            while((line = br.readLine()) != null) { // буферезированные читают сразу набор символов и хранят их в буфере тем самым уменьшая кол-во обращения к файлу
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
