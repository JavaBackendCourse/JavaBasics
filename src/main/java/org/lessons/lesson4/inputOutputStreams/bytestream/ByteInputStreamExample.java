package org.lessons.lesson4.inputOutputStreams.bytestream;

import java.io.FileInputStream;

public class ByteInputStreamExample {
    public static void main(String[] args) {
        // Путь к файлу указываете свой
        try (FileInputStream fis = new FileInputStream(
                "C:\\Users\\Damir\\IdeaProjects\\School\\JavaBackend\\practice\\src\\main\\java\\org\\lessons\\lesson4\\inputOutputStreams\\bytestream\\files\\fis_example.txt")) {
            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // если убрать char то выведет числовое значение символа
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
