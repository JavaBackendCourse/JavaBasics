package org.lessons.lesson7.simpleexample.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Сервер запущен и ждет соединений!");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = "";

            while ((message = in.readLine()) != null) {
                System.out.println("Получено: " + message);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
