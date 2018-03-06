package model.request.general;

import config.ConfigReader;

public abstract class Request {

    protected static final String BASE_URL = ConfigReader.getProperty("baseUrl");
    private static final String PARAM_PLACEHOLDER = "\\*";

    protected String setParameter(String prepared, String param) {
        if (prepared.contains(PARAM_PLACEHOLDER)) {
            return prepared.replaceAll(PARAM_PLACEHOLDER, param);
        }
        return prepared;
    }

    protected String setParameter(String prepared, Long param) {
        return setParameter(prepared,param.toString());
    }
}

