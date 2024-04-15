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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class FinuncialStatementsController implements Initializable {

    @FXML
    private Text NetSalesTF;
    @FXML
    private Text GressProfitTF;
    @FXML
    private Text AdministrautionExpensesTF;
    @FXML
    private Text TaxTF;
    @FXML
    private TextField CostOfSalesTF;
    @FXML
    private TextField NetIncomeTF;
    @FXML
    private Button StatementsButton;
    @FXML
    private Button LogOut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void StatementsButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClicked(ActionEvent event) {
    }
    
}
