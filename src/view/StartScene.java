package view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class StartScene extends Scene {

    Label welcomeText = new Label("TKP Backend");

    public StartScene(Pane root) {
        super(root);
        BorderPane borderPane = AppWindow.getAppPane();
        borderPane.setCenter(welcomeText);
        setRoot(borderPane);
    }
}
