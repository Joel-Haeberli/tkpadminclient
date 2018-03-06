package model.request.general;

import org.apache.http.client.methods.*;

public class RequestFactory {

    private static RequestFactory INSTANCE;

    private RequestFactory() {}

    public static RequestFactory Instance() {
        if (INSTANCE == null) {
            INSTANCE = new RequestFactory();
        }
        return INSTANCE;
    }

    public HttpPut getHttpPut(String url) {
        return new HttpPut(url);
    }

    public HttpGet getHttpGet(String url) {
        return new HttpGet(url);
    }

    public HttpPost getHttpPost(String url) {
        return new HttpPost(url);
    }

    public HttpDelete getHttpDelete(String url) {
        return new HttpDelete(url);
    }
}
