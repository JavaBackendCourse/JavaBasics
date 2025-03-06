package org.lessons.lesson4.inputOutputStreams.characterstreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharOutputStreamExample {
    public static void main(String[] args) {
        String text = "Hello, this is an example of BufferedWriter!";

        // Путь к файлу указываете свой
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(
                "C:\\Users\\Damir\\IdeaProjects\\School\\JavaBackend\\practice\\src\\main\\java\\org\\lessons\\lesson4\\inputOutputStreams\\characterstreams\\files\\bw_example.txt"))) {
            bw.write(text);
            bw.newLine();
            bw.write("Another line");

            System.out.println("Данные успешно записаны в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
