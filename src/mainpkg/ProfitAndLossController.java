/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class ProfitAndLossController implements Initializable {

    @FXML
    private BarChart<?, ?> ProfitLossBarChart;
    @FXML
    private NumberAxis ByeProductAxis;
    @FXML
    private CategoryAxis SellProductAxis;
    @FXML
    private BarChart<?, ?> ProfitLossBarChart1;
    @FXML
    private NumberAxis ByeProductAxis1;
    @FXML
    private CategoryAxis SellProductAxis1;
    @FXML
    private BarChart<?, ?> ProfitLossBarChart2;
    @FXML
    private CategoryAxis SellProductAxis2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
