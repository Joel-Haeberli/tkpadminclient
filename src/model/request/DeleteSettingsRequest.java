package model.request;

import config.ConfigReader;
import model.request.general.Request;
import model.request.general.RequestFactory;
import model.request.general.Requestable;
import org.apache.http.client.methods.HttpRequestBase;

public class DeleteSettingsRequest extends Request implements Requestable {

    private static final String DELETE_SETTING = ConfigReader.getProperty("deleteSetting");

    private String id;

    public DeleteSettingsRequest(String id) {
        this.id = id;
    }

    @Override
    public HttpRequestBase getHttpRequest() {
        String url = BASE_URL + setParameter(DELETE_SETTING, this.id);
        return RequestFactory.Instance().getHttpDelete(url);
    }
}
