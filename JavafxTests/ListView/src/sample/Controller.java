package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button btn_click;
    @FXML
    private ListView<String> list;
    @FXML
    private TextField entry;

    public void pressButton(ActionEvent event)
    {
        list.getItems().add(entry.getText());

    }
}
