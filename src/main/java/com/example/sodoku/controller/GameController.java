package com.example.sodoku.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.Random;
public class GameController {


    @FXML
    private Label idtitulo;

    @FXML
    private TextArea MesaggeArea;

    @FXML
    private GridPane gridPaneTablero;
    private String namePlayer;

    public void setWord(String namePlayer) {
        this.namePlayer = namePlayer.toUpperCase();
        idtitulo.setText(this.namePlayer+" a Sodokjugar");
    }

    // traigo de sopa de letras

    @FXML
    public void initialize(){
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                TextField textFieldLetter = new TextField();
                gridPaneTablero.add(textFieldLetter, i, j);
                textFieldEnterText(textFieldLetter, i, j);
            }
        }
    }

    private void textFieldEnterText(TextField textFieldLetter, int i, int j){
        textFieldLetter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //System.out.println("Button pressed in the position, " + i + " " + j);
            }
        });
    }
    // traigo de sopa de letras

    private int generarNumeroAleatorio(){
        // Generar un número aleatorio entre 1 y 9 (ambos inclusive)
        Random aleatorio = new Random();
        int numeroAleatorio= aleatorio.nextInt(9)+1;
        // Imprimir el número generado
        System.out.println("Número aleatorio entre 1 y 9: " + numeroAleatorio)
        return numeroAleatorio;
    }
}
