package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.paint.ImagePattern;

import java.io.File;
import java.io.FileInputStream;

import static javafx.scene.paint.Color.RED;

public class Main extends Application {


    @FXML
    private ImageView img;
    @Override
    public void start(Stage primaryStage) throws Exception{


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        loader.load();
        Parent p = loader.getRoot();
        p.setStyle("-fx-background-color: cadetblue");
        Scene scene = new Scene(p);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
