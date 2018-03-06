package model.jsonutil;

import config.ConfigReader;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class JSONInputStream {

    private static final String BASE_URL = ConfigReader.getProperty("baseUrl");

    public static InputStream getInputStream(String urlPostfix) {

        InputStream inputStream = null;
        try {
            inputStream = new URL(BASE_URL + urlPostfix).openStream();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return inputStream;
    }

    public static JSONObject getObjectFromJson(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String jsonAsString = getJsonFromStream(bufferedReader);
        JSONObject jsonObject = new JSONObject(jsonAsString);
        return jsonObject;
    }

    private static String getJsonFromStream(BufferedReader bufferedReader) {
        StringBuilder stringBuilder = new StringBuilder();
        bufferedReader.lines().forEach(s -> {
            stringBuilder.append(s);
        });
        return stringBuilder.toString();
    }
}
