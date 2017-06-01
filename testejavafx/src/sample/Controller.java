package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Observable;

public class Controller {

    @FXML
    private ListView<String> lista;
    @FXML
    private Button btn_msg;
    @FXML
    private TextField campo ;


    public void GetText()
    {
        System.out.println(campo.getText());
    }
    public void pressButton(ActionEvent event)
    {
        System.out.println("Hello World!!!!!");
        lista.getItems().add(campo.getText());





    }
}
