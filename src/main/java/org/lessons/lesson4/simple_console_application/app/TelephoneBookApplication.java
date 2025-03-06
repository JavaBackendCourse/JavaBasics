package org.lessons.lesson4.simple_console_application.app;

import org.lessons.lesson4.simple_console_application.customexception.CustomException;
import org.lessons.lesson4.simple_console_application.model.TelephoneBookRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelephoneBookApplication {
    public void run() {
        Scanner in = new Scanner(System.in);
        process(in);
    }

    private void process(Scanner in) {
        while (true) {
            System.out.println("PRESS [1] TO ADD A RECORD TO TELEPHONE BOOK");
            System.out.println("PRESS [2] TO LIST RECORDS OF THE TELEPHONE BOOK");
            System.out.println("PRESS [0] TO EXIT");

            String choice = in.next();

            if (choice.equals("1")) {
                createTelephoneBookRecord(in);
            } else if (choice.equals("2")) {
                listTelephoneBookRecords();
            } else if (choice.equals("0")) {
                System.exit(0); // завершение программы
            } else {
                System.out.println("WRONG COMMAND!!! TRY AGAIN!!!");
                process(in);
            }
        }
    }

    private void createTelephoneBookRecord(Scanner in) {
        System.out.println("Insert name: ");
        String name = in.next();

        System.out.println("Insert phone number: ");
        String phoneNumber = in.next();

        TelephoneBookRecord newRecord = new TelephoneBookRecord(name.trim(), phoneNumber.trim());

        saveRecord(newRecord);
    }

    private void saveRecord(TelephoneBookRecord newRecord) {
        // Путь к файлу указываете свой
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(
                "C:\\Users\\Damir\\IdeaProjects\\School\\JavaBackend\\practice\\src\\main\\java\\org\\lessons\\lesson4\\simple_console_application\\db\\telephone_book_db.txt", true))) {
            if (!getTelephoneBookRecords().isEmpty())
                bw.newLine();

            bw.write(String.format("%s %s", newRecord.getName(), newRecord.getPhoneNumber()));
            System.out.println("Данные успешно сохранены!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listTelephoneBookRecords() {
        List<TelephoneBookRecord> records = getTelephoneBookRecords();
        for (int i = 0; i < records.size(); i++) {
            System.out.println(String.format("%d) %s %s", i + 1, records.get(i).getName(), records.get(i).getPhoneNumber()));
        }
    }

    private List<TelephoneBookRecord> getTelephoneBookRecords() {
        List<TelephoneBookRecord> records = new ArrayList<>();

        // Путь к файлу указываете свой
        try (BufferedReader br = new BufferedReader(new FileReader(
                "C:\\Users\\Damir\\IdeaProjects\\School\\JavaBackend\\practice\\src\\main\\java\\org\\lessons\\lesson4\\simple_console_application\\db\\telephone_book_db.txt"))) {
            String row = "";

            while ((row = br.readLine()) != null) {
                String[] rowSplit = row.split(" ");

                if (rowSplit.length != 2) {
                    throw new CustomException("Неверный формат хранимых данных", 500);
                }

                String name = rowSplit[0];
                String phoneNumber = rowSplit[1];

                records.add(new TelephoneBookRecord(name, phoneNumber));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return records;
    }
}
