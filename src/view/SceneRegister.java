package view;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneRegister {

    private Stage stage;

    private StartScene startScene;
    private UploadScene uploadScene;
    private OrdersScene ordersScene;
    private SettingsScene settingsScene;

    public SceneRegister(Stage stage){
        this.stage = stage;
        startScene = new StartScene(new Pane());
        uploadScene = new UploadScene(new Pane());
        ordersScene = new OrdersScene(new Pane());
        settingsScene = new SettingsScene(new Pane());
    }

    public StartScene getStartScene() {
        return startScene;
    }

    public UploadScene getUploadScene() {
        return uploadScene;
    }

    public OrdersScene getOrdersScene() {
        return ordersScene;
    }

    public SettingsScene getSettingsScene() {
        return settingsScene;
    }
}
