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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fernando
 */
public class VistaCDController implements Initializable {

    @FXML
    private Button borrarbtn;
    @FXML
    private Button clonebtn;
    
    private boolean erase=false;
    private boolean clone=false;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void borrar(ActionEvent event) {
        this.erase=true;
        Stage escena =  (Stage) this.borrarbtn.getScene().getWindow();
        escena.close();
    }

    @FXML
    private void clonar(ActionEvent event) {
        this.clone=true;
        Stage escena =  (Stage) this.clonebtn.getScene().getWindow();
        escena.close();
    }
    
    public boolean getborrar(){
        return erase;
    }
    public boolean getclonar(){
        return clone;
    }
    
    
}
