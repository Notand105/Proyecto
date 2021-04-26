/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fernando
 */
public class VistaEnlacesController implements Initializable {

    @FXML
    private ChoiceBox<String> choice;
    @FXML
    private Button aceobtn;
    private int valor;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        choice.setValue("1");
        choice.getItems().add("1");
        choice.getItems().add("2");
        choice.getItems().add("3");
        choice.getItems().add("4");
        choice.getItems().add("5");
        choice.getItems().add("6");
        choice.getItems().add("7");
        choice.getItems().add("8");
        
    }    

    @FXML
    private void cerrar(ActionEvent event) {
        this.valor=Integer.parseInt(choice.getValue());
        Stage escena =  (Stage) this.aceobtn.getScene().getWindow();
        escena.close();
        
    }
    
    public int getNumero(){
    
        return valor;
    }
    
}
