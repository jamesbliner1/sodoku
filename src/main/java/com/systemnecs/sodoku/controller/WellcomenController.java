package com.systemnecs.sodoku.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WellcomenController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}