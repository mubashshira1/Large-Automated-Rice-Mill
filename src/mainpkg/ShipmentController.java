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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ShipmentController implements Initializable {

    @FXML
    private ComboBox<?> ShipperIdComboBox;
    @FXML
    private DatePicker DatePicker;
    @FXML
    private Label ShipmentBillTextField;
    @FXML
    private TextField QuantityTextField;
    @FXML
    private TextArea DetailsTextField;
    @FXML
    private TextField ShippingIdTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ViewShipmentReportButtonOnClick(ActionEvent event) {
    }

    
}
