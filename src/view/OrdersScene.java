package view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class OrdersScene extends Scene {

    private Label ordersTitle = new Label("Orders");

    public OrdersScene(Pane root) {
        super(root);
        BorderPane borderPane = AppWindow.getAppPane();

        VBox vBox = new VBox();
        vBox.getChildren().addAll(ordersTitle);
        borderPane.setCenter(vBox);

        setRoot(borderPane);
    }
}
