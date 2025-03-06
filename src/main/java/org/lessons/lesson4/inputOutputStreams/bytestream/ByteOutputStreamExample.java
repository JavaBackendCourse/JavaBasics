package org.lessons.lesson4.inputOutputStreams.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStreamExample {
    public static void main(String[] args) {
        String data = "Hello, this is example of a FileOutputStream!";

        // Путь к файлу указываете свой
        try (FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\Damir\\IdeaProjects\\School\\JavaBackend\\practice\\src\\main\\java\\org\\lessons\\lesson4\\inputOutputStreams\\bytestream\\files\\fos_example.txt")) {
            fos.write(data.getBytes());
            System.out.println("Данные успешно записаны в файл!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
