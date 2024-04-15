/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AddProductsController implements Initializable {
    Alert noDate = new Alert(Alert.AlertType.WARNING, "Please Choose Date");
    Alert Unfilled = new Alert(Alert.AlertType.WARNING, "Please Enter Everything");
    Alert Success = new Alert(Alert.AlertType.INFORMATION, "Succesfully Added!");
    private ComboBox<Integer> QuantityComboBox;
    private TextArea DetailsTextArea;
    @FXML
    private ComboBox<?> quantityComboBox;
    @FXML
    private DatePicker dispatchedDatePicker;
    @FXML
    private DatePicker shippingDatePicker;
    @FXML
    private TextField productNameTextField;
    @FXML
    private TextArea detailsTextArea;
    @FXML
    private TextField productBillTextField;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void AddProductsButtonOnClick(ActionEvent event) {
     String productText = productTextField.getText();
     if (productText.isEmpty()) {
         Unfilled.show();
         return;
    }

    Integer quantity;
    try {
        quantity = Integer.parseInt(quantityTextField.getText());
    } catch (NumberFormatException e) {
        Unfilled.show();
        return;
    }

    if (quantity <= 0) {
        Unfilled.show();
        return;
    }
    {

    //LocalDate date = DatePicker.getValue();
    if (date == null) {
        noDate.show();
        return;
    }
    String details = DetailsTextArea.getText();

    //ProductsLists newAR = new ProductsLists(productText, quantity, date, details);

    Success.show();   
    
      
    
    } 

    @FXML
    private void BackButtonOnClick(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Products.fxml"));
        Parent parent = loader.load();
        
        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene Products = new Scene(parent);

        currentStage.setScene(Products);
        currentStage.show(); 
    }

    private void ViewProductListButtonOnClick(ActionEvent event) {
        //Scene MachineMaintenanceEngineer = new Scene(parent);

        //currentStage.setScene(MachineMaintenanceEngineer);
    
    }
    }




    @FXML
    private void ViewProductListButtonOnClick(ActionEvent event) {
        sceneSwitch("/com/MachineMaintenanceEngineer/views/Product/ViewProductsButtonOnClick.fxml"); 
    }

    
}
