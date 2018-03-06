package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class UploadScene extends Scene {

    TextField uploadPageTitle = new TextField("This is the Uploadpage");
    Button uploadButton = new Button("Upload Picture");

    public UploadScene(Pane root) {
        super(root);
        BorderPane borderPane = AppWindow.getAppPane();

        addUploadButtonEventListener();

        VBox vBox = new VBox();
        vBox.getChildren().addAll(uploadPageTitle, uploadButton);
        borderPane.setCenter(vBox);

        setRoot(borderPane);
    }

    private void addUploadButtonEventListener() {
        uploadButton.setOnMouseClicked(((MouseEvent event) -> {
            System.out.println("opening filechooser");
            FileChooser fileChooser = getFileChooser();
            String s;
            try {
                s = fileChooser.showOpenDialog(new Stage()).getAbsolutePath();
                System.out.println("choosen file: " + s);
            } catch (Exception e) {
                System.out.println("No File choosen");
            }
        }));
    }

    private FileChooser getFileChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        fileChooser.setTitle("Choose a Picture");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image","*.png"));
        return fileChooser;
    }
}
