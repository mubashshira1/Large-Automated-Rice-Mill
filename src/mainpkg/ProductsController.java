/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ProductsController implements Initializable {

    @FXML
    private DatePicker DatePicker;
    @FXML
    private TextArea DetailsTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewProductListButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void AddProductsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ViewProductBillButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
    }
    
}
