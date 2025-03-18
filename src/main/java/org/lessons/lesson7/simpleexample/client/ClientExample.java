package org.lessons.lesson7.simpleexample.client;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 127.0.0.1 - localhost
        try (Socket socket = new Socket("localhost", 8080)) {
            System.out.println("Подключение к серверу!");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                out.println(sc.nextLine()); // Отправка сообщения серверу
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
