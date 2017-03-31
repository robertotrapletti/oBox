/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obox;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

/**
 *
 * @author robertotrapletti
 */
public class GuiController  {
    

    @FXML
    private Button logBtn;
    @FXML
    private final PasswordField psw=new PasswordField();
    @FXML
    private TextField usrnm;
    @FXML
    private ProgressIndicator loading=new ProgressIndicator();
    
    public void handleButtonAction(ActionEvent event) {
        loading.setVisible(true);
        
       // String nome=usrnm.getText();
       // String pasw=psw.getText();
       //query al DB
//        long now = System.currentTimeMillis();
//        long after=now+3000;
//        while(now < after){
//        now = System.currentTimeMillis();
//        }
//      Parent root;
//        try {
//            root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
//            Stage stage = new Stage();
//            stage.setTitle("oBox");
//            stage.setScene(new Scene(root, 450, 450));
//            stage.show();
//            // Hide this current window (if this is what you want)
//            ((Node)(event.getSource())).getScene().getWindow().hide();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
    }
    
}
