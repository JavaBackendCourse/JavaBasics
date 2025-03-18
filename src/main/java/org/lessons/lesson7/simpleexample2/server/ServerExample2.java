package org.lessons.lesson7.simpleexample2.server;

import org.lessons.lesson7.simpleexample2.message.Data;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сервер запущен и ждет подключений!");

        try (ServerSocket serverSocket = new ServerSocket(8080);
             Socket socket = serverSocket.accept();
             ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ) {
            System.out.println("К серверу подключился клиент!");

            Data request;

            while ((request = (Data) objectInputStream.readObject()) != null) {
                System.out.printf("Получено сообщение от клиента [%s]: %s\n", request.getName(), request.getMessage());
                System.out.println("Отправьте ответ клиенту:");
                String message = sc.nextLine();

                Data response = new Data(message, "Server");
                objectOutputStream.writeObject(response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
