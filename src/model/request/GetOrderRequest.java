package model.request;

import config.ConfigReader;
import model.request.general.Request;
import model.request.general.RequestFactory;
import model.request.general.Requestable;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

public class GetOrderRequest extends Request implements Requestable{

    private static final String ORDER_GET_BY_ID = ConfigReader.getProperty("getOrder");

    private Long id;

    public GetOrderRequest(long id) {
        this.id = id;
    }

    @Override
    public HttpRequestBase getHttpRequest() {
        String url = BASE_URL + setParameter(ORDER_GET_BY_ID,this.id);
        HttpGet getOrderHttp = RequestFactory.Instance().getHttpGet(url);
        return getOrderHttp;
    }
}
