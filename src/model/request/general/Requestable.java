package model.request.general;

import org.apache.http.client.methods.HttpRequestBase;

public interface Requestable {

    public HttpRequestBase getHttpRequest();
}
