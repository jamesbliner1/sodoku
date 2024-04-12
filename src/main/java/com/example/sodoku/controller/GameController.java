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
    @FXML
    private GridPane idTablero1;

    @FXML
    private GridPane idTablero2;

    @FXML
    private GridPane idTablero3;

    @FXML
    private GridPane idTablero4;

    @FXML
    private GridPane idTablero5;

    @FXML
    private GridPane idTablero6;

    @FXML
    private GridPane idTablero7;

    @FXML
    private GridPane idTablero8;

    @FXML
    private GridPane idTablero9;
    private int[][] array = new int[9][9];


    public void setWord(String namePlayer) {
        this.namePlayer = namePlayer.toUpperCase();
        idtitulo.setText(this.namePlayer + " a Sodokjugar");
    }

    // traigo de sopa de letras

    @FXML
    public void initialize() {
        // inicializo la matriz en ceros
       inicializeArrayZeros();
        //cuadro 1

        int numerosIniciales = 4;
        int contadorNumerosIniciales = 0;
        int x=0, y=0, cuadroX=0, cuadroY=0, valueXY=0;
        for (int i = 0; i < 4; i++) {

                x=generarNumeroAleatorio(3)-1;
                y=generarNumeroAleatorio(3)-1;
                valueXY=this.array[x][y];
                while(valueXY != 0 ){
                    x=generarNumeroAleatorio(3)-1;
                    y=generarNumeroAleatorio(3)-1;
                    valueXY=this.array[x][y];
                }
                if(valueXY == 0 ) {
                    verificarXY(x, y, cuadroX, cuadroY, valueXY);
                }
                TextField textFieldLetter = new TextField();
                idTablero1.add(textFieldLetter, x, y);
                textFieldEnterText(textFieldLetter, x, y);
                textFieldLetter.setText("" + generarNumeroAleatorio(9));

        }
    }

    private void verificarXY(int x, int y, int cuadroX, int cuadroY, int valueXY) {
        int checkValue = verificaCuadro(x, y, cuadroX, cuadroY, valueXY);
        while(checkValue != 1) {
           checkValue  = verificaCuadro(x, y, cuadroX, cuadroY, valueXY);
      }
    }

    private int verificaCuadro(int x, int y, int cuadroX, int cuadroY, int valueXY ){
        this.array[x][y]=generarNumeroAleatorio(9);
        valueXY=this.array[x][y];
        int contador=0;
        for(int i= x; i<(x + 3); i++ ){
            for(int j=y; j<(y+3); j++) {

                if(this.array[i][j] == valueXY )
                { contador=contador+1; }
            }
        }
        return contador;
    }
    private void textFieldEnterText(TextField textFieldLetter, int i, int j) {
        textFieldLetter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //System.out.println("Button pressed in the position, " + i + " " + j);

            }
        });
    }
    // traigo de sopa de letras

    private int generarNumeroAleatorio(int rango) {
        // Generar un número aleatorio entre 1 y 9 (ambos inclusive)
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(rango) + 1;
        // Imprimir el número generado
        System.out.println("Número aleatorio entre 1 y" + rango + ": " + numeroAleatorio);
        return numeroAleatorio;
    }

    private void inicializeArrayZeros() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.array[i][j] = 0;
            }
        }

    }
    //


}
