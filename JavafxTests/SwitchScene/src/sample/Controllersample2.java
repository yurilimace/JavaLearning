package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


/**
 * Created by Yuri on 02/06/2017.
 */
public class Controllersample2 {

    @FXML
    private Button btn_2;

    public void BackFirstScreen(ActionEvent event) throws Exception{
        Parent root2 = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene teste = new Scene(root2);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Screen 1");
        window.setScene(teste);
        window.show();


    }
}
