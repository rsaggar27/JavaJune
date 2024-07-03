package com.example.javajune.basics;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static java.lang.Integer.parseInt;

public class BasicController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtAnswer;

    @FXML
    private TextField txtB;

    @FXML
    void doClear(ActionEvent event) {
        txtA.setText("");
        txtB.setText("");
        txtAnswer.setText("");
    }

    @FXML
    void doProduct(ActionEvent event) {
        String ans=String.valueOf((parseInt(txtA.getText())*parseInt(txtB.getText())));
        txtAnswer.setText(ans);
    }

    @FXML
    void doSum(ActionEvent event) {
        String ans=String.valueOf((parseInt(txtA.getText())+parseInt(txtB.getText())));
        txtAnswer.setText(ans);
    }

    @FXML
    void initialize() {
        assert txtA != null : "fx:id=\"txtA\" was not injected: check your FXML file 'BasicsView.fxml'.";
        assert txtAnswer != null : "fx:id=\"txtAnswer\" was not injected: check your FXML file 'BasicsView.fxml'.";
        assert txtB != null : "fx:id=\"txtB\" was not injected: check your FXML file 'BasicsView.fxml'.";
    }

}
