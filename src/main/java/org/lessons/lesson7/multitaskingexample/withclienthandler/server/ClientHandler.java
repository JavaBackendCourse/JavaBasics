package org.lessons.lesson7.multitaskingexample.withclienthandler.server;

import org.lessons.lesson7.multitaskingexample.withclienthandler.message.PackageData;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClientHandler extends Thread {
    private Socket socket;
    private String clientID;

    private final List<String> GREETING_PATTERNS = List.of(
            "здравствуйте", "привет", "здрасьте", "хай", "хей", "салам", "хеллоу", "добрый день", "добрый вечер", "доброе утро"
    );

    private List<String> GREETING_RESPONSE_PATTERNS = List.of(
            "Добрый день! Чем я могу вам помочь?",
            "Здравствуйте! Чем я могу вам помочь?",
            "Привет! Как я могу вам помочь?",
            "Здравствуйте! Чем могу быть полезен?"
    );

    private String INSTRUCTION_MESSAGE = """
            НАЖМИТЕ [1] ЧТОБЫ ВЫВЕСТИ СПИСОК ДЕЛ
            НАЖМИТЕ [2] ЧТОБЫ ДОБАВИТЬ НОВУЮ ЗАПИСЬ В СПИСОК ДЕЛ
            НАЖМИТЕ [3] ЧТОБЫ УДАЛИТЬ ЗАПИСЬ ИЗ СПИСКА ДЕЛ
            НАЖМИТЕ [0] ЧТОБЫ ПОМЕТИТЬ ДЕЛО ВЫПОЛНЕННЫМ
            """;

    public ClientHandler(Socket socket, String clientID) {
        this.socket = socket;
        this.clientID = clientID;
    }

    @Override
    public void run() {
        try (ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
            PackageData request;

            while ((request = (PackageData) in.readObject()) != null) {
                System.out.printf("\n[%s][%s]: %s\n",
                        request.getName(), clientID, request.getMessage());

                processRequest(request, out);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void processRequest(PackageData request, ObjectOutputStream out) {
        Random random = new Random();

        try {
            var requestMessageSplit = Arrays.stream(request.getMessage().split(" "))
                    .map(String::toLowerCase).map(String::trim).toList();

            if (requestMessageSplit.stream().anyMatch(GREETING_PATTERNS::contains)) {
                String randomGreeting = GREETING_RESPONSE_PATTERNS.get(
                        random.nextInt(GREETING_RESPONSE_PATTERNS.size())
                );

                String responseMessage = String.format("%s\n%s", randomGreeting, INSTRUCTION_MESSAGE);

                var response = new PackageData("Server", responseMessage);
                out.writeObject(response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
