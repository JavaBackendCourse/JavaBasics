package org.lessons.lesson7.multitaskingexample.withclienthandler.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerExample3 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Сервер запущен и ждет клиентов...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Клиент подключился: " + clientSocket.getInetAddress());

                new ClientHandler(clientSocket, UUID.randomUUID().toString()).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
