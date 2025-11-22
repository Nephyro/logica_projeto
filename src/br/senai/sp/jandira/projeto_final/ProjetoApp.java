package br.senai.sp.jandira.projeto_final;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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

    @Override
    public void start(Stage stage) throws IOException {

        // título do stage
        stage.setTitle("ProjetoApp");

        // tamanho do stage (tela/janela)
        stage.setWidth(1500);
        stage.setHeight(950);

        // componente principal da tela
        VBox root = new VBox();
        Scene scene = new Scene(root);


        // cabeçalho da tela
        VBox header = new VBox();
        header.setStyle("-fx-padding: 10;-fx-background-color: #0d8da1");



        //                               label do header                                  //
        Label labelTitulo = new Label("Lógica Projeto Integrador");
        labelTitulo.setStyle("-fx-text-fill: red;-fx-font-size: 40;-fx-font-weight: bold");
        Label labelSubtitulo = new Label("Modelo temporário");
        labelSubtitulo.setStyle("-fx-text-fill: red;-fx-font-size: 20");
        header.setAlignment(Pos.CENTER);

        header.getChildren().addAll(labelTitulo, labelSubtitulo);
        //--------------------------------------------------------------------------------//







        // adicionar componentes no root
        root.getChildren().add(header);


        stage.setScene(scene);
        stage.setTitle("Projeto Final");
        stage.show();

    }
}
