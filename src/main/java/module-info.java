module com.example.javagraphmaker {

    requires javafx.base;
    requires javafx.fxml;
    requires javafx.controls;
    requires aspose.cells;

    opens com.example.javagraphmaker to javafx.fxml;
    exports com.example.javagraphmaker;
}