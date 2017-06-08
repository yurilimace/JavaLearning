package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Button btn_sign;
    @FXML
    private PasswordField password;
    @FXML
    private TextField log;
    @FXML
    private Label label;

    Controllersample2 controller;

    public String getlog()
    {
        return this.log.getText();
    }



    String login = "yuri";
    String senha = "123456";
    public void pressButton(ActionEvent event) throws  Exception
    {
        System.out.println(log.getText());
        System.out.println(password.getText());
        String x = log.getText();
        if(x.equals(login))
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sample2.fxml"));
            loader.load();
            Controllersample2 cont = loader.getController();
            cont.SetLabel(" Bem vindo " + x);
            Parent p = loader.getRoot();
            Stage stage =  (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(p));
            stage.show();

            /*Parent root2 = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            Scene teste = new Scene(root2);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(teste);
            window.setTitle("Screen 2");
            window.show();*/
        }
        else
        {
            label.setText("User or Password wrong!!!!");
            label.setTextFill(Color.RED);
        }
    }
}
