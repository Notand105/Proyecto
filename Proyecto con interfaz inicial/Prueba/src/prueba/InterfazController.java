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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fernando
 */
public class InterfazController implements Initializable {

    @FXML
    private Button btninicio;
    @FXML
    private ImageView imgview;
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image imagen= new Image("/modelo/unknown.png");
        imgview.setImage(imagen); 
    }    

    @FXML
    private void iniciar(ActionEvent event) {
         Stage escena =  (Stage) this.btninicio.getScene().getWindow();
        escena.close();
    }
    
}
