package br.senai.sp.jandira.projeto_final;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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


    @Override
    public void start(Stage stage) throws IOException {

        // título do stage
        stage.setTitle("ProjetoApp");

        // tamanho do stage (tela/janela)
        stage.setWidth(600);
        stage.setHeight(600);

        // componente principal da tela
        VBox root = new VBox();
        Scene scene = new Scene(root);


        //                     cabeçalho da tela                         //
        VBox header = new VBox();
        header.setStyle("-fx-padding: 10;-fx-background-color: #0d8da1");
        //--------------------------------------------------------------//



        //                               label do header                                  //
        Label labelTitulo = new Label("Lógica Projeto Integrador");
        labelTitulo.setStyle("-fx-text-fill: red;-fx-font-size: 40;-fx-font-weight: bold");
        Label labelSubtitulo = new Label("Modelo temporário");
        labelSubtitulo.setStyle("-fx-text-fill: red;-fx-font-size: 20");
        header.setAlignment(Pos.CENTER);

        header.getChildren().addAll(labelTitulo, labelSubtitulo);
        //--------------------------------------------------------------------------------//


        // fomulário do estacionamento do veículo
        GridPane gridFormulario = new GridPane();
        gridFormulario.setHgap(15);
        gridFormulario.setVgap(15);
        gridFormulario.setPadding(new Insets(20, 10, 10, 20));

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








        //    adicionar componentes no root    //
        root.getChildren().add(header);
        root.getChildren().add(gridFormulario);
        //-------------------------------------//

        stage.setScene(scene);
        stage.setTitle("Projeto Final");
        stage.show();

    }
}
