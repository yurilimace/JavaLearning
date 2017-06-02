package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btn_1;

    public void pressButton(ActionEvent event) throws Exception{
        Parent root2 = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Scene teste = new Scene(root2);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(teste);
        window.setTitle("Screen 2");
        window.show();
    }
}
