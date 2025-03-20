package org.lessons.lesson7.multitaskingexample.withclienthandler.client;

import org.lessons.lesson7.multitaskingexample.withclienthandler.message.PackageData;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();

        try (Socket socket = new Socket("localhost", 5000);
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) { // Подключаемся к серверу
            System.out.println("Подключение к серверу...");

            while (true) {
                System.out.print("Отправьте сообшение: ");
                String message = sc.nextLine();

                PackageData request = new PackageData(name, message);

                out.writeObject(request);
                out.flush();

                PackageData response;
                if ((response = (PackageData) in.readObject()) != null) {
                    System.out.println("[Server]: " + response.getMessage());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
