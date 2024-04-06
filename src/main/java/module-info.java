module com.systemnecs.sodoku {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.systemnecs.sodoku to javafx.fxml;
    exports com.systemnecs.sodoku;
    exports com.systemnecs.sodoku.controller;
    opens com.systemnecs.sodoku.controller to javafx.fxml;
}