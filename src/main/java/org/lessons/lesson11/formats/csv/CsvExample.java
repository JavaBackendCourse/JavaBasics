package org.lessons.lesson11.formats.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.lessons.lesson11.formats.csv.model.Person4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class CsvExample {
    public static void main(String[] args) throws Exception {
        List<Person4> people = Arrays.asList(new Person4("David", 35, "d@gmail.com"), new Person4("Eve", 28, "e@gmail.com"));

        try (Writer writer = new FileWriter("src/main/java/org/lessons/lesson11/formats/csv/model/person.csv");
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Name", "Age", "Email"))) {
            for (Person4 p : people) {
                csvPrinter.printRecord(p.getName(), p.getAge(), p.getEmail());
            }
        }

        try (Reader reader = new FileReader("src/main/java/org/lessons/lesson11/formats/csv/model/person.csv");
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
            for (CSVRecord record : csvParser) {
                System.out.println("Имя: " + record.get("Name") + ", Возраст: " + record.get("Age") + ", Почта: " + record.get("Email"));
            }
        }
    }
}