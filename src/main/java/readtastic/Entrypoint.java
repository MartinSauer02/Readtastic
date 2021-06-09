package readtastic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Entrypoint extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Fenstertitel setzen
        primaryStage.setTitle("Readtastic");

        // mainMenu.fxml laden
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/mainMenu.fxml"));
            primaryStage.setScene(new Scene(root));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Icon setzen
        try {
            primaryStage.getIcons().add(new Image("/icon/readtasticIcon_v1_500x500.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
