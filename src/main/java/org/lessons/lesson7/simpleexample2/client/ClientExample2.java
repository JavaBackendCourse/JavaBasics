package org.lessons.lesson7.simpleexample2.client;

import org.lessons.lesson7.simpleexample2.message.Data;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = sc.nextLine();

        try (Socket socket = new Socket("localhost", 8080);
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())
        ) {

            System.out.println("Подключение к серверу...");

            while (true) {
                System.out.println("Отправьте сообщение:");
                String message = sc.nextLine();

                Data request = new Data(message, name);

                out.writeObject(request);
                out.flush();

                Data response;
                if ((response = (Data) in.readObject()) != null) {
                    System.out.printf("Получен ответ от сервера: %s\n", response.getMessage());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
