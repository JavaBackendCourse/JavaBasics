package org.lessons.lesson11.formats.yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.lessons.lesson11.formats.yaml.model.Person3;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class YamlExample {
    public static void main(String[] args) throws Exception {
        Person3 person = new Person3("Charlie", 40, "charlie@example.com");

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> personMap = objectMapper.convertValue(person, Map.class);

        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

        Yaml yaml = new Yaml(options);
        String yamlString = yaml.dump(personMap);
        System.out.println("Сериализованный YAML:\n" + yamlString);

        Map<String, Object> deserializedMap = yaml.load(yamlString);

        Person3 deserializedPerson = objectMapper.convertValue(deserializedMap, Person3.class);
        System.out.println("Десериализованный объект: " + deserializedPerson.getName() + ", " + deserializedPerson.getAge() + ", " + deserializedPerson.getEmail());
    }
}
