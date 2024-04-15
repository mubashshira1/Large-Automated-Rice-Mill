/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class LoginController implements Initializable {

    @FXML
    private TextField userIdTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private ComboBox<?> userTypeComboBox;
    @FXML
    private Button signupButton;
    @FXML
    private Button login;

    /**
     * Initializes 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {userTypeComboBox.getItems.addAll("CEO","System Administrator","Sales Manager"," Customer Service Representative"," Maintenance Engineer","Dispatcher"," Human Resources","Finance Manager");
    userIdTextField.setText("admin");
    passwordTextField.setText("123456789");
     
        // TODO
    }    

    @FXML
    private void signUpButtonOnClick(ActionEvent event) {
    
    }

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void forgotPasswordButtonOnClick(ActionEvent event) {try{FXMLLoader loader = new FXMLLoader(getClass().getResource("ForgotPassword.fxml"));
    Parent root = loader.load();
    Scene scene = new Scene(root);
    Stage currentStage = (Stage) signupButton.getScene().getWindow();
    currentStage.setScene(scene);
    }catch (IOException e){
        e.printStackTrace();
    }
    }
    
}
