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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fernando
 */
public class VistaCuadritoController implements Initializable {
    private int n;
    private boolean confirm=false;
    @FXML
    private TextField txtField;
    @FXML
    private ColorPicker clrPicker;
    @FXML
    private Button readybtn;
    private Color color ;
    private String nombre;
    @FXML
    private ColorPicker clrpicktext;
    private Color color2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void Boton(ActionEvent event) {
        nombre= this.txtField.getText();   
        Stage escena =  (Stage) this.readybtn.getScene().getWindow();
        escena.close();
    }
    @FXML
     private void actionpick(ActionEvent event) {
        color=this.clrPicker.getValue(); 
    }
    
     @FXML
    private void clrpicktxt(ActionEvent event) {
        color2=this.clrpicktext.getValue();
         
    }
    public String getnombre(){
        return this.nombre;
    }
    public Color getColor(){
        return this.color;
    }
    public Color getColortxt(){
        return this.color2;
    }
    
    public boolean unirconfirm(){
        return confirm;
    }
    
}
