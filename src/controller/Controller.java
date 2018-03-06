package controller;

import view.AppWindow;
import view.SceneRegister;

public class Controller {

    public static final SceneRegister sceneRegister = new SceneRegister(AppWindow.getInstance());

    public Controller () {}

    public void showStartScene() {
        AppWindow.getInstance().setSceneAndShow(sceneRegister.getStartScene());
    }

    public void showUploadScene() {
        AppWindow.getInstance().setSceneAndShow(sceneRegister.getUploadScene());
    }

    public void showOrdersScene() {
        AppWindow.getInstance().setSceneAndShow(sceneRegister.getOrdersScene());
    }

    public void showSettingsScene() {
        AppWindow.getInstance().setSceneAndShow(sceneRegister.getSettingsScene());
    }
}
