package model.request;

import config.ConfigReader;
import model.request.general.Request;
import model.request.general.RequestFactory;
import model.request.general.Requestable;
import org.apache.http.client.methods.HttpRequestBase;

public class GetOrdersRequest extends Request implements Requestable {

    private static final String ORDERS_GET = ConfigReader.getProperty("getOrders");

    public GetOrdersRequest() {}

    @Override
    public HttpRequestBase getHttpRequest() {
        String url = BASE_URL + ORDERS_GET;
        return RequestFactory.Instance().getHttpGet(url);
    }
}
