/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import prueba.InterfazController;
import prueba.Prueba;
import prueba.VistaEnlacesController;

public class AbirVentanas {
    
    public void Inicio(){
    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/interfaz.fxml"));
                try {
                    Parent root5 = loader.load();

                    InterfazController controlador5 = loader.getController();

                    Scene escena5 = new Scene(root5);
                    
                    Stage escenario5 = new Stage();
                    escenario5.initStyle(StageStyle.DECORATED.UNDECORATED);
                    escenario5.initModality(Modality.APPLICATION_MODAL);
                    escenario5.setTitle("Moleculator");
                    escenario5.getIcons().add(new Image("/modelo/unknown.png"));
                    escenario5.setScene(escena5);
                    escenario5.showAndWait();

                    //unir=controlador.unirconfirm();
                } catch (IOException ex) {
                    Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }
    
    public int Nenlaces(){
        int nenlaces=0;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/VistaEnlaces.fxml"));
                try {
                    Parent root4 = loader.load();

                    VistaEnlacesController controlador4 = loader.getController();

                    Scene escena4 = new Scene(root4);
                    Stage escenario4 = new Stage();
                    escenario4.initStyle(StageStyle.DECORATED.UNDECORATED);
                    escenario4.initModality(Modality.APPLICATION_MODAL);
                    escenario4.setTitle("Moleculator");
                    escenario4.getIcons().add(new Image("/modelo/unknown.png"));
                    escenario4.setScene(escena4);
                    escenario4.showAndWait();

                    nenlaces = controlador4.getNumero();

                    //unir=controlador.unirconfirm();
                } catch (IOException ex) {
                    Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
                }
    
        return nenlaces;
    }
    
    
}
