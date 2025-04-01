package org.lessons.lesson11.formats.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.lessons.lesson11.formats.json.model.Person;

public class JsonExample {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person("Alice", 30, "alice@gmail.com");

        try {
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
            System.out.println("JSON: " + json);

            Person deserialized = objectMapper.readValue(json, Person.class);
            System.out.println("Имя: " + deserialized.getName() + ", Возраст: " + deserialized.getAge() + ", Почта: " + deserialized.getEmail());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
