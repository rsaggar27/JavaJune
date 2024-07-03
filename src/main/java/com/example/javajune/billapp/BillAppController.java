package com.example.javajune.billapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

public class BillAppController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBill;

    @FXML
    private CheckBox chkAC;

    @FXML
    private CheckBox chkFan;

    @FXML
    private ToggleGroup discount;

    @FXML
    private RadioButton radCom;

    @FXML
    private RadioButton radHou;

    @FXML
    private TextField txtABill;

    @FXML
    private TextField txtAC;

    @FXML
    private TextField txtDis;

    @FXML
    private TextField txtFBill;

    @FXML
    private TextField txtFan;

    @FXML
    private TextField txtNBill;

    @FXML
    private TextField txtUBill;

    @FXML
    private TextField txtUnits;

    int bill=0, discountt=0;
    int fBill=0;int uBill=0;
    int aBill=0;

//    BillAppController(){
//        txtFan.setVisible(false);
//        txtAC.setVisible(false);
//    }


    @FXML
    void doABill(MouseEvent event) {

            int n=Integer.parseInt(txtAC.getText());

            aBill=n*100;

            txtABill.setText(String.valueOf(aBill));
    }

    void alertBill(String netBill){
        //Alert alert = new Alert(AlertType.INFORMATION);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        //Alert alert = new Alert(AlertType.WARNING);

        alert.setTitle("Your bill is here...");



        alert.setHeaderText("Electricity Bill");
        alert.setContentText("Your bill is :"+ netBill);
//        alert.setContentText("Pay your bill soon!");

        alert.showAndWait();
    }


    @FXML
    void doBill(ActionEvent event) {
        txtNBill.setText(String.valueOf(bill-discountt));
        alertBill(String.valueOf(bill-discountt));
    }

    @FXML
    void do10(ActionEvent event) {
        calcDiscount(10);
    }

    @FXML
    void do20(ActionEvent event) {
        calcDiscount(20);
    }

    void calcDiscount(int rate){
        bill=fBill+uBill+aBill;
        discountt=bill*rate/100;
        txtDis.setText(String.valueOf(discountt));
    }


    @FXML
    void doFBill(MouseEvent event) {

    int n=Integer.parseInt(txtFan.getText());

    fBill=n*50;

    txtFBill.setText(String.valueOf(fBill));
    }

    @FXML
    void doUBill(MouseEvent event) {

        int n=Integer.parseInt(txtUnits.getText());

        uBill=n*10;

        txtUBill.setText(String.valueOf(uBill));
    }

    @FXML
    void doShowAC(MouseEvent event) {

        txtAC.setVisible(chkAC.isSelected());

    }

    @FXML
    void doShowFan(MouseEvent event) {
        txtFan.setVisible(chkFan.isSelected());
    }

    @FXML
    void initialize() {
        assert btnBill != null : "fx:id=\"btnBill\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert chkAC != null : "fx:id=\"chkAC\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert chkFan != null : "fx:id=\"chkFan\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert discount != null : "fx:id=\"discount\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert radCom != null : "fx:id=\"radCom\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert radHou != null : "fx:id=\"radHou\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert txtABill != null : "fx:id=\"txtABill\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert txtAC != null : "fx:id=\"txtAC\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert txtDis != null : "fx:id=\"txtDis\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert txtFBill != null : "fx:id=\"txtFBill\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert txtFan != null : "fx:id=\"txtFan\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert txtNBill != null : "fx:id=\"txtNBill\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert txtUBill != null : "fx:id=\"txtUBill\" was not injected: check your FXML file 'BillAppView.fxml'.";
        assert txtUnits != null : "fx:id=\"txtUnits\" was not injected: check your FXML file 'BillAppView.fxml'.";

    }

}
