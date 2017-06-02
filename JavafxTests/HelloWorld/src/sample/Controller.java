package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;





public class Controller {
    @FXML
    private Button btn_msg;

    public void pressButton(ActionEvent event){
        System.out.println("Hello World");

    }
}
