/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Botonesevent {
    
    public void molecbtn(Button Molec,Label Nombre,ArrayList<Objet> aUnir){
       
        Molec.setOnAction(new EventHandler<ActionEvent>() {
           
            @Override
            public void handle(ActionEvent event) {               
                Nombre.setText(" ");
                
                int j=0;
                while (j < aUnir.size()) {
                    Nombre.setText(Nombre.getText() + aUnir.get(j).getLabel().getText());

                     j = j + 1;
                }
                
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Info");
                alert.setContentText("Se a creado la molecula " + Nombre.getText());
                alert.showAndWait();
                
            }
        });
        
        
    }
    
    
}
