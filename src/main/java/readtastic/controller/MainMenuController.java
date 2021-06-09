package readtastic.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainMenuController {

    @FXML
    private ImageView readDotHover;

    @FXML
    private ImageView editDotHover;

    @FXML
    private ImageView helpDotHover;



    @FXML
    void readItemOnMouseEntered(MouseEvent event) {
        readDotHover.setVisible(true);
    }

    @FXML
    void readItemOnMouseExited(MouseEvent event) {
        readDotHover.setVisible(false);
    }

    @FXML
    void readItemOnMouseClicked(MouseEvent event) {
        /*
            Todo: Klicken auf Lesen-Item
         */
    }



    @FXML
    void editItemOnMouseEntered(MouseEvent event) {
        editDotHover.setVisible(true);
    }

    @FXML
    void editItemOnMouseExited(MouseEvent event) {
        editDotHover.setVisible(false);
    }

    @FXML
    void editItemOnMouseClicked(MouseEvent event) {
        /*
            Todo: Klicken auf Bearbeiten-Item
         */
    }



    @FXML
    void helpItemOnMouseEntered(MouseEvent event) {
        helpDotHover.setVisible(true);
    }

    @FXML
    void helpItemOnMouseExited(MouseEvent event) {
        helpDotHover.setVisible(false);
    }

    @FXML
    void helpItemOnMouseClicked(MouseEvent event) {
        /*
            TODO: Klicken auf Hilfe-Item
         */
    }



    @FXML
    void logoItemOnMouseClicked(MouseEvent event) {
        /*
            TODO: Klicken auf Logo-Item
         */
    }

}
