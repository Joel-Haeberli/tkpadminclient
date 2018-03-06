package view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class SettingsScene extends Scene {

    private Label settingsTitle = new Label("Settings");

    public SettingsScene(Pane root) {
        super(root);
        BorderPane borderPane = AppWindow.getAppPane();

        VBox vBox = new VBox();
        vBox.getChildren().addAll(settingsTitle);
        borderPane.setCenter(vBox);

        setRoot(borderPane);
    }
}
