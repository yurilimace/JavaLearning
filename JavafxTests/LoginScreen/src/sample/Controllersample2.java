package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by Yuri on 02/06/2017.
 */
public class Controllersample2 implements Initializable {
    @FXML
    private Label label;
    @FXML
    private Button logoff;
    private  Controller x;


    public void SetLabel(String name)
    {
        this.label.setText(name);
    }

    public void Logoff(ActionEvent event){


    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
