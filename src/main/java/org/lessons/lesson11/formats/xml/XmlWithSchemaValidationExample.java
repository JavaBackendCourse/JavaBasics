package org.lessons.lesson11.formats.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.lessons.lesson11.formats.xml.model.Person2;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlWithSchemaValidationExample {
    public static void main(String[] args) {
        XmlMapper xmlMapper = new XmlMapper();
        Person2 person = new Person2("Bob", 25, "bob@gmail.com");

        try {
            StringWriter writer = new StringWriter();
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(writer, person);
            String xml = writer.toString();
            System.out.println("Сгенерированный XML: \n" + xml);

            validateXmlWithXsd(xml, "src/main/java/org/lessons/lesson11/formats/xml/model/person_schema.xsd");

            Person2 deserialized = xmlMapper.readValue(xml, Person2.class);
            System.out.println("Имя: " + deserialized.getName() + ", Возраст: " + deserialized.getAge() + ", Почта: " + deserialized.getEmail());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void validateXmlWithXsd(String xml, String xsdPath) throws SAXException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(new File(xsdPath));
        Validator validator = schema.newValidator();

        try {
            validator.validate(new StreamSource(new StringReader(xml)));
            System.out.println("XML успешно прошел валидацию по XSD!");
        } catch (Exception e) {
            System.err.println("Ошибка валидации XML: " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}
