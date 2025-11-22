package br.senai.sp.jandira.projeto_final;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjetoApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    TextField textProprietario;
    TextField textDataEntrada;
    TextField textHoraEntrada;
    TextField textDataSaida;
    TextField textHoraSaida;
    TextField tfProprietarioResultado;
    Button btnLimpar;


    @Override
    public void start(Stage stage) throws IOException {

        // título do stage
        stage.setTitle("ProjetoApp");

        // tamanho do stage (tela/janela)
        stage.setWidth(600);
        stage.setHeight(665);

        // componente principal da tela
        VBox root = new VBox();
        Scene scene = new Scene(root);


        //                               cabeçalho da tela                                 //
        VBox header = new VBox();
        header.setStyle("-fx-padding: 10;-fx-background-color: #0d8da1");
        header.setAlignment(Pos.CENTER);


        Label labelTitulo = new Label("Lógica Projeto Integrador");
        labelTitulo.setStyle("-fx-text-fill: red;-fx-font-size: 40;-fx-font-weight: bold");
        Label labelSubtitulo = new Label("Modelo temporário");
        labelSubtitulo.setStyle("-fx-text-fill: red;-fx-font-size: 20");
        header.setAlignment(Pos.CENTER);

        header.getChildren().addAll(labelTitulo, labelSubtitulo);
        //--------------------------------------------------------------------------------//


        //              fomulário do estacionamento do veículo              //
        GridPane gridFormulario = new GridPane();
        gridFormulario.setHgap(15);
        gridFormulario.setVgap(15);
        gridFormulario.setPadding(new Insets(20, 10, 10, 120));

        Label labelProprietario = new Label("Nome do proprietário(a):");
        labelProprietario.setStyle(
                "-fx-font-size: 15;" +
                        "-fx-font-weight: bold"
        );
        textProprietario = new TextField();


        Label labelDataEntrada = new Label("Data de entrada:");
        labelDataEntrada.setStyle(
                "-fx-font-size: 15;" +
                        "-fx-font-weight: bold"
        );
        textDataEntrada = new TextField();
        textDataEntrada.setPromptText("           dd/mm/aa");


        Label labelHoraEntrada = new Label("Hora de entrada:");
        labelHoraEntrada.setStyle(
                "-fx-font-size: 15;" +
                        "-fx-font-weight: bold"
        );
        textHoraEntrada = new TextField();


        Label labelDataSaida = new Label("Data de saída:");
        labelDataSaida.setStyle(
                "-fx-font-size: 15;" +
                        "-fx-font-weight: bold"
        );
        textDataSaida = new TextField();
        textDataSaida.setPromptText("           dd/mm/aa");





        Label labelHoraSaida = new Label("Hora de saída:");
        labelHoraSaida.setStyle(
                "-fx-font-size: 15;" +
                        "-fx-font-weight: bold"
        );
        textHoraSaida = new TextField();




        gridFormulario.add(labelProprietario, 0, 0);
        gridFormulario.add(textProprietario, 1, 0);
        gridFormulario.add(labelDataEntrada, 0, 1);
        gridFormulario.add(textDataEntrada, 1, 1);
        gridFormulario.add(labelHoraEntrada, 0, 2);
        gridFormulario.add(textHoraEntrada, 1, 2);
        gridFormulario.add(labelDataSaida, 0, 3);
        gridFormulario.add(textDataSaida, 1, 3);
        gridFormulario.add(labelHoraSaida, 0, 4);
        gridFormulario.add(textHoraSaida, 1, 4);
        //------------------------------------------------------------------//


        // Botões
        HBox boxBotoes = new HBox();
        boxBotoes.setSpacing(20);
        boxBotoes.setPadding(new Insets(30, 20, 50, 170));
        Button btnCalcular = new Button("Calcular");
        btnCalcular.setPrefWidth(100);
        btnCalcular.setPrefHeight(60);
        btnCalcular.setOnAction(e -> {
            calcularEstadia();
            tfProprietarioResultado.setText(textProprietario.getText());
            btnLimpar.requestFocus();
        });

        btnLimpar = new Button("Limpar");
        btnLimpar.setPrefWidth(100);
        btnLimpar.setPrefHeight(60);
        btnLimpar.setOnAction(e -> {

        });

        boxBotoes.getChildren().addAll(btnCalcular, btnLimpar);


        // --- Caixa principal do resultado ---
        VBox boxResultado = new VBox();
        boxResultado.setPadding(new Insets(200, 10, 10, 120));
        boxResultado.setStyle(
                "-fx-background-color: #d6d1d1;" +
                        "-fx-padding: 20;" +
                        "-fx-spacing: 15;" +
                        "-fx-border-radius: 10;" +
                        "-fx-background-radius: 10;"
        );

        // --- Título ---
        Label tituloResultado = new Label("Resultado");
        tituloResultado.setStyle(
                "-fx-font-size: 20px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-color: #6a6a6a;" +
                        "-fx-text-fill: white;" +
                        "-fx-padding: 10;" +
                        "-fx-background-radius: 10;" +
                        "-fx-alignment: center;"
        );
        tituloResultado.setMaxWidth(Double.MAX_VALUE);

        // --- Grid com informações ---
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Labels
        Label lblProprietario = new Label("Proprietário(a):");
        Label lblValor = new Label("Valor a ser pago:");

        // Campos
        tfProprietarioResultado = new TextField();
        tfProprietarioResultado.setEditable(false);
        TextField tfValor = new TextField();

        tfProprietarioResultado.setPrefWidth(100);

        // Inserindo no grid
        grid.add(lblProprietario, 0, 0);
        grid.add(tfProprietarioResultado, 1, 0);
        grid.add(lblValor, 0, 1);
        grid.add(tfValor, 1, 1);


        // Monta a caixa
        boxResultado.getChildren().addAll(tituloResultado, grid);

        StackPane.setAlignment(boxResultado, Pos.BOTTOM_RIGHT);




        //    adicionar componentes no root    //
        root.getChildren().add(header);
        root.getChildren().add(gridFormulario);
        root.getChildren().addAll(boxBotoes);
        root.getChildren().addAll(boxResultado);
        //-------------------------------------//

        stage.setScene(scene);
        stage.setTitle("Projeto Final");
        stage.show();

    }


    // parte lógica do projeto
    public void calcularEstadia() {



    }

}
