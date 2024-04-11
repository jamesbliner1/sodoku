module com.example.hangedgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.sodoku to javafx.fxml;
    exports com.example.sodoku;
    exports com.example.sodoku.controller;
    opens com.example.sodoku.controller to javafx.fxml;
    exports com.example.sodoku.view;
    opens com.example.sodoku.view to javafx.fxml;
}