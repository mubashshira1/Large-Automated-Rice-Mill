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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class PaymentController implements Initializable {

    @FXML
    private TableView<?> PaymentTableView;
    @FXML
    private TableColumn<?, ?> ProductTC;
    @FXML
    private TableColumn<?, ?> PriceTC;
    @FXML
    private TableColumn<?, ?> QuantityTC;
    @FXML
    private TableColumn<?, ?> TotalPriceTC;
    @FXML
    private ComboBox<?> PaymentTyprComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void BackButtonOnClicked(ActionEvent event) {
    }
    
}
