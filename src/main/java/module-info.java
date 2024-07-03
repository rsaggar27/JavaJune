module com.example.javajune {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.javajune to javafx.fxml;
    exports com.example.javajune;

    exports com.example.javajune.jsg;
    opens com.example.javajune.jsg to javafx.fxml;

    exports com.example.javajune.basics;
    opens com.example.javajune.basics to javafx.fxml;
    exports com.example.javajune.billapp;
    opens com.example.javajune.billapp to javafx.fxml;

}