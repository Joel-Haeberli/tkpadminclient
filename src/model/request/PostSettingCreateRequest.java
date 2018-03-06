package model.request;

import config.ConfigReader;

public class PostSettingCreateRequest {

    public static final String CREATE_SETTING = ConfigReader.getProperty("createSetting");

    String body;

    public PostSettingCreateRequest(String id, String value) {

    }
}
