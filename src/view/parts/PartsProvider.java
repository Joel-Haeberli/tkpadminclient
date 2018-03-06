package view.parts;

import controller.Controller;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import view.AppWindow;
import view.StartScene;

public class PartsProvider {

    public static HBox getControlsBox() {
        HBox controlsBox = new HBox();

        Button back = new Button("Back");
        Button mainMenu = new Button("Main Menu");

        mainMenu.setOnMouseClicked(event -> {
            AppWindow.getInstance().setSceneAndShow(Controller.sceneRegister.getStartScene());
        });

        back.setOnMouseClicked(event -> {
            AppWindow.getInstance().setSceneAndShow(AppWindow.getInstance().getLastScene());
        });

        controlsBox.getChildren().addAll(back, mainMenu);
        return controlsBox;
    }

    public static HBox getNavigationBox() {
        HBox navigationBox = new HBox();

        Button uploadPicture = new Button("Upload Picture");
        Button orders = new Button("Orders");
        Button settings = new Button("Settings");

        uploadPicture.setOnMouseClicked(event -> {
            AppWindow.getInstance().setSceneAndShow(Controller.sceneRegister.getUploadScene());
        });

        settings.setOnMouseClicked(event -> {
            AppWindow.getInstance().setSceneAndShow(Controller.sceneRegister.getSettingsScene());
        });

        orders.setOnMouseClicked(event -> {
            AppWindow.getInstance().setSceneAndShow(Controller.sceneRegister.getOrdersScene());
        });

        navigationBox.getChildren().addAll(uploadPicture, orders, settings);
        return navigationBox;
    }
}
