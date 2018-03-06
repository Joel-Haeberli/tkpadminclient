package view;

import controller.Controller;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.parts.PartsProvider;

public class AppWindow extends Stage {

    private static AppWindow appWindow;
    private Scene lastScene;

    private AppWindow() {
        setTitle("TKP Admin");
        setFullScreen(false);
        setWidth(800);
        setHeight(500);
    }

    public static AppWindow getInstance() {
        if (appWindow == null) {
            appWindow = new AppWindow();
        }
        return appWindow;
    }

    public void setSceneAndShow(Scene s) {
        setTitle(s.getClass().getName());
        setCurrentScene(s);
        showStage();
    }

    private void setCurrentScene(Scene s) {
        lastScene = getScene();
        if (lastScene == null) {
            lastScene = Controller.sceneRegister.getStartScene();
        }
        setScene(s);
    }

    private void showStage() {
        show();
    }

    public Scene getLastScene() {
        return lastScene;
    }

    public static BorderPane getAppPane() {
        BorderPane pane = new BorderPane();

        pane.setTop(PartsProvider.getNavigationBox());
        pane.setBottom(PartsProvider.getControlsBox());

        return pane;
    }
}
