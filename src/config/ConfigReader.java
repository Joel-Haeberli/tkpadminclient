package config;

import java.io.*;

public class ConfigReader {

    private static final String CONFIG_PATH = "src/config.properties";
    private static final String SPLITTER = "=";

    public static String getProperty(String key) {
        File f = new File(CONFIG_PATH);
        String value = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = getLine(reader, key);
            if (line != "" || line != null) {
                value = getValueOfLine(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    private static String getLine(BufferedReader reader, String key) {
        return reader
                .lines()
                .filter(s -> s.contains(key))
                .findFirst()
                .get();
    }

    private static String getValueOfLine(String line) {
        String[] splittet = line.split(SPLITTER);
        if (splittet.length != 2) {
            return "";
        }
        return splittet[1].trim();
    }
}
