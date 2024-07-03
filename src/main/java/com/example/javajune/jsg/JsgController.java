package com.example.javajune.jsg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class JsgController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblHello;

    @FXML
    void sayHello(ActionEvent event) {
    lblHello.setText("Hellooooooo");
    }

    @FXML
    void initialize() {
        assert lblHello != null : "fx:id=\"lblHello\" was not injected: check your FXML file 'JsgView.fxml'.";

    }

}
