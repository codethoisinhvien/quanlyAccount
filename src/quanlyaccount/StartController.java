/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyaccount;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author Phongthien
 */
public class StartController implements Initializable {
    
  
    @FXML
    private Button btnKeySoftware;
    @FXML
    private Button btnAccountWed;
    @FXML
    private TextField txtKeyRSA;
    private boolean EventHandler;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        btnKeySoftware.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                try {
                    Parent root = null;
                    root =  FXMLLoader.load(getClass().getResource("KeySofware.fxml"));
                    Scene scene = new Scene(root);
                    Stage keySofwareWindown= new Stage();
                    keySofwareWindown.setTitle("Key Sofwave");
                    keySofwareWindown.setScene(scene);
                    keySofwareWindown.show();
                } catch (IOException ex) {
                    Logger.getLogger(StartController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
             

            
            
        });
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
