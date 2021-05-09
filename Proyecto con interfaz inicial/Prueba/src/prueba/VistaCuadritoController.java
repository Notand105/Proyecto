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
import javafx.scene.control.ChoiceBox;
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
    @FXML
    private ChoiceBox<String> choicebox;
    private int numero;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clrPicker.setValue(Color.BLACK);
        clrpicktext.setValue(Color.BLACK);
        choicebox.setValue("20");
        choicebox.getItems().add("20");
        choicebox.getItems().add("25");
        choicebox.getItems().add("30");
        choicebox.getItems().add("35");
        choicebox.getItems().add("40");
        choicebox.getItems().add("45");
        choicebox.getItems().add("50");
        choicebox.getItems().add("60");
    }    

    @FXML
    private void Boton(ActionEvent event) {
        nombre= this.txtField.getText();   
        numero=Integer.parseInt(choicebox.getValue());
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
    public double size(){
    
    return numero;
    }
}
