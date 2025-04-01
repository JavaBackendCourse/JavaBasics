package org.lessons.lesson11.formats.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.lessons.lesson11.formats.xml.model.Person2;

public class XmlExample {
    public static void main(String[] args) {
        XmlMapper xmlMapper = new XmlMapper();
        Person2 person = new Person2("Bob", 25, "bob@gmail.com");

        try {
            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
            System.out.println("XML: " + xml);

            Person2 deserialized = xmlMapper.readValue(xml, Person2.class);
            System.out.println("Имя: " + deserialized.getName() + ", Возраст: " + deserialized.getAge() + ", Почта: " + deserialized.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
