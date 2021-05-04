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
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Fernando
 */
public class VistacuadritolineaController implements Initializable {

    @FXML
    private ColorPicker clrpicker;
    @FXML
    private Button btn;
    
    private Color color;
    @FXML
    private Button btnborrar;
    private boolean erase=false;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void click(ActionEvent event) {
        color=clrpicker.getValue();
        Stage escena =  (Stage) this.btn.getScene().getWindow();
        escena.close();
        
    }
    public Color getColorlinea(){
        return clrpicker.getValue();
    }

    @FXML
    private void borrar(ActionEvent event) {
        Stage escena =  (Stage) this.btnborrar.getScene().getWindow();
        escena.close();
        erase=true;
        
    }
    public boolean borra(){
    return erase;
    }
}
