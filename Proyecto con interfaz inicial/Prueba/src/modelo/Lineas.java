/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import prueba.Prueba;
import prueba.VistacuadritolineaController;

public class Lineas {
        class Measure {
                        double x, y;

                     public Measure() {
                          x = 0; y = 0;
                }
            }
        public void MovLinea(Line line, Node arco){
                    final Measure dragMeasure1 = new Measure();
                    final Measure position1 = new Measure();
                    line.setOnMousePressed(mouseEvent -> {
                        dragMeasure1.x = mouseEvent.getSceneX() - position1.x;
                        dragMeasure1.y = mouseEvent.getSceneY() - position1.y;
                        line.setCursor(Cursor.MOVE);
                    });

                    line.setOnMouseDragged(mouseEvent -> {
                        position1.x = mouseEvent.getSceneX() - dragMeasure1.x;
                        position1.y = mouseEvent.getSceneY() - dragMeasure1.y;
                        //line.setTranslateX(position.x);
                        line.setEndX(position1.x);
                        line.setEndY(position1.y);
                        
                        //line.setTranslateY(position.y);

                    });
                    line.setOnMouseReleased(mouseEvent -> line.setCursor(Cursor.HAND));
                    line.setOnMouseEntered(mouseEvent -> line.setCursor(Cursor.HAND));
                                 
}
   public void eventosLinea(Line l1,Pane root){
       
       l1.setOnMouseClicked(new EventHandler<MouseEvent>() {
                        Color color3;
                        @Override
                        public void handle(MouseEvent mouseEvent) {
                            if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                                if (mouseEvent.getClickCount() == 2) {
                                    //doble click evento
                                    FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/vista/vistacuadritolinea.fxml"));
                                    try {
                                        Parent root2 = loader2.load();

                                        VistacuadritolineaController controlador2 = loader2.getController();

                                        Scene escena2 = new Scene(root2);
                                        Stage escenario2 = new Stage();
                                        escenario2.initStyle(StageStyle.DECORATED.UNDECORATED);
                                        escenario2.initModality(Modality.APPLICATION_MODAL);
                                        escenario2.setTitle("Moleculator");
                                        escenario2.getIcons().add(new Image("/modelo/unknown.png"));
                                        escenario2.setScene(escena2);
                                        escenario2.showAndWait();

                                        //unir=controlador.unirconfirm();
                                        color3 = controlador2.getColorlinea();
                                        l1.setStroke(color3);
                                        if (controlador2.borra()) {
                                            root.getChildren().remove(l1);
                                        }

                                    } catch (IOException ex) {
                                        Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }

                            }

                        }

                    });
   
   
   
   }     
   
    public void setVis(Line l1, Arc arco, Pane root,Arc en1) {
        l1.setVisible(true);
        l1.setStartX(en1.getLayoutX() + 15);
        l1.setStartY(en1.getLayoutY() + 18);
        l1.setEndX(en1.getLayoutX() + 15);
        l1.setEndY(en1.getLayoutY() + 100);
        l1.setStrokeWidth(4);
        root.getChildren().add(l1);
        MovLinea(l1, arco);

    }
        
}