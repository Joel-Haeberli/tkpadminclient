package config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigReaderTest {

    @Test
    void getProperty() {
        assertEquals("http://localhost:8080/", ConfigReader.getProperty("baseUrl"));
    }
}