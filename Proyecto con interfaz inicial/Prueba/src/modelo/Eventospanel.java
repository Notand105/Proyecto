
package modelo;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;

public class Eventospanel {

    public void doubleclick(Pane pane) {

        pane.setOnMouseClicked(new EventHandler<MouseEvent>() {

            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton().equals(MouseButton.SECONDARY)) {
                    if (mouseEvent.getClickCount() == 2) {
                        Arc arco = new Arc(50, 50, 20, 20, 0, 360);
                        arco.setLayoutX(mouseEvent.getSceneX()-40);
                        arco.setLayoutY(mouseEvent.getSceneY()-30);
                        arco.setFill(Color.WHITE);
                        arco.setStroke(Color.BLACK);
                        arco.setStrokeWidth(3);
                        pane.getChildren().add(arco);
                    }

                }
            }

        });

    }
    
    public void reposicionar(Pane root,Pane menu){
    
        root.addEventFilter(MouseEvent.MOUSE_MOVED, e -> {

                    menu.setPrefSize(200, root.getHeight());
                    menu.setLayoutX(root.getWidth()-200);
                    menu.setLayoutY(0);

                });
    }
    
    public void borrar(Pane root,Arc arco,Arc en1,Arc en2,Arc en3,Arc en4,Arc en5,Arc en6,Arc en7,Arc en8,Line l1,Line l2,Line l3,Line l4,Line l5,Line l6,Line l7,Line l8,Label label,Line line){
        root.getChildren().remove(arco);
                                    root.getChildren().remove(label);
                                    root.getChildren().remove(line);
                                    root.getChildren().remove(en1);
                                    root.getChildren().remove(en2);
                                    root.getChildren().remove(en3);
                                    root.getChildren().remove(en4);
                                    root.getChildren().remove(en5);
                                    root.getChildren().remove(en6);
                                    root.getChildren().remove(en7);
                                    root.getChildren().remove(en8);
                                    root.getChildren().remove(l1);
                                    root.getChildren().remove(l2);
                                    root.getChildren().remove(l3);
                                    root.getChildren().remove(l4);
                                    root.getChildren().remove(l5);
                                    root.getChildren().remove(l6);
                                    root.getChildren().remove(l7);
                                    root.getChildren().remove(l8);
        
    
    
    }

}
