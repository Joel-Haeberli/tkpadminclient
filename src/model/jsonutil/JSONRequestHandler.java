package model.jsonutil;

import com.sun.deploy.net.HttpResponse;
import config.ConfigReader;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class JSONRequestHandler {

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

   // https://kodejava.org/how-do-i-send-post-request-with-a-json-body-using-the-httpclient/
    public static HttpResponse sendObject() {
        return null;
    }

    public static JSONObject getJsonObject(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String jsonAsString = getJsonFromStream(bufferedReader);
        JSONObject jsonObject = new JSONObject(jsonAsString);
        return jsonObject;
    }

    public static JSONArray getJsonArray(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String jsonAsString = getJsonFromStream(bufferedReader);
        JSONArray jsonArray = new JSONArray(jsonAsString);
        return jsonArray;
    }

    private static String getJsonFromStream(BufferedReader bufferedReader) {
        StringBuilder stringBuilder = new StringBuilder();
        bufferedReader.lines().forEach(s -> {
            stringBuilder.append(s);
        });
        return stringBuilder.toString();
    }
}
