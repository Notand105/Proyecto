package modelo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import prueba.Prueba;
import prueba.VistaCDController;
import prueba.VistaCuadritoController;

public class Eventospanel {

    public void doubleclick(Pane root,int nenlaces) {

        root.setOnMouseClicked(new EventHandler<MouseEvent>() {

            public void handle(MouseEvent mouseEvent) {
                int ndeAtomos=0;
                if (mouseEvent.getButton().equals(MouseButton.SECONDARY)) {
                    if (mouseEvent.getClickCount() == 2) {
                        int nenla=0;
                        AbirVentanas ventanas=new AbirVentanas ();
                        nenla = ventanas.Nenlaces();
                        Atomos atomos=new Atomos();
                        Enlaces enlaces=new Enlaces();
                        Image textoImagen = new Image("/modelo/Nombre.png");
                        
                        Eventospanel eventospanel = new Eventospanel();
                        Botonesevent botonese = new Botonesevent();
                        Arc en1 = new Arc(15, 15, 5, 5, 0, 360);
                        Arc en2 = new Arc(15, 15, 5, 5, 0, 360);
                        Arc en3 = new Arc(15, 15, 5, 5, 0, 360);
                        Arc en4 = new Arc(15, 15, 5, 5, 0, 360);
                        Arc en5 = new Arc(15, 15, 5, 5, 0, 360);
                        Arc en6 = new Arc(15, 15, 5, 5, 0, 360);
                        Arc en7 = new Arc(15, 15, 5, 5, 0, 360);
                        Arc en8 = new Arc(15, 15, 5, 5, 0, 360);

                        en1.setStroke(Color.BLACK);
                        en2.setStroke(Color.BLACK);
                        en3.setStroke(Color.BLACK);
                        en4.setStroke(Color.BLACK);
                        en5.setStroke(Color.BLACK);
                        en6.setStroke(Color.BLACK);
                        en7.setStroke(Color.BLACK);
                        en8.setStroke(Color.BLACK);
                        //color de borde enlace clonado

                        //visibilidad enlaces
                        en1.setVisible(false);
                        en2.setVisible(false);
                        en3.setVisible(false);
                        en4.setVisible(false);
                        en5.setVisible(false);
                        en6.setVisible(false);
                        en7.setVisible(false);
                        en8.setVisible(false);

                        ndeAtomos += 1;
                        Line line = new Line();
                        line.setVisible(false);
                        Arc arco = new Arc(50, 50, 20, 20, 0, 360);
                        Label label = new Label("");
                        arco.setLayoutX(mouseEvent.getSceneX() - 40);
                        arco.setLayoutY(mouseEvent.getSceneY() - 30);
                        arco.setFill(Color.WHITE);
                        arco.setStroke(Color.BLACK);
                        arco.setStrokeWidth(3);
                        label.setLayoutX(arco.getLayoutX() + 40);
                        label.setLayoutY(arco.getLayoutY() + 40);
                        
                        //Inicio del evento de doble click en el arco
                        arco.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                                    if (mouseEvent.getClickCount() == 2) {
                                        //doble click evento
                                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Vista cuadrito.fxml"));
                                        try {
                                            Parent root2 = loader.load();

                                            VistaCuadritoController controlador = loader.getController();

                                            Scene escena = new Scene(root2);
                                            Stage escenario = new Stage();
                                            escenario.initStyle(StageStyle.DECORATED.UNDECORATED);
                                            escenario.initModality(Modality.APPLICATION_MODAL);
                                            escenario.setTitle("Moleculator");
                                            escenario.getIcons().add(new Image("/modelo/unknown.png"));
                                            escenario.setScene(escena);
                                            escenario.showAndWait();

                                            //unir=controlador.unirconfirm();
                                            label.setText(controlador.getnombre());
                                            arco.setRadiusX(controlador.size());
                                            arco.setRadiusY(controlador.size());
                                            enlaces.orden(en1, en2, en3, en4, en5, en6, en7, en8, root, arco);

                                            
                                            arco.setStroke(controlador.getColor());

                                            label.setTextFill(controlador.getColortxt());

                                        } catch (IOException ex) {
                                            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }

                                } else if (mouseEvent.getButton() == MouseButton.SECONDARY) {
                                    FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/vista/VistaCD.fxml"));
                                    try {
                                        Parent root3 = loader3.load();

                                        VistaCDController controlador3 = loader3.getController();

                                        Scene escena3 = new Scene(root3);
                                        Stage escenario3 = new Stage();
                                        escenario3.initStyle(StageStyle.DECORATED.UNDECORATED);
                                        escenario3.initModality(Modality.APPLICATION_MODAL);
                                        escenario3.setTitle("Moleculator");
                                        escenario3.getIcons().add(new Image("/modelo/unknown.png"));
                                        escenario3.setScene(escena3);
                                        escenario3.showAndWait();
                                        boolean borrar=false;
                                        boolean clonar=false;
                                        borrar = controlador3.getborrar();
                                        clonar = controlador3.getclonar();
                                        if (borrar) {
                                            
                                            eventospanel.borrar(root, arco, en1, en2, en3, en4, en5, en6, en7, en8, label, line);

                                            borrar = false;
                                        }

                                        if (clonar) {
                                            Alert alert = new Alert(Alert.AlertType.INFORMATION);

                                            alert.setHeaderText(null);
                                            alert.setTitle("Error");
                                            alert.setContentText("La funcion clonar esta desactivada de momento");
                                            alert.showAndWait();
                                        }
                                    } catch (IOException ex) {
                                        Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }

                            }
                        });

                        int j = 0;
                        while (j < nenla) {
                            if (j == 0) {
                                en1.setLayoutX(arco.getLayoutX() + 25);
                                en1.setLayoutY(arco.getLayoutY() + 70);

                                en1.setFill(Color.WHITE);
                                en1.setVisible(true);
                            } else if (j == 1) {
                                en2.setLayoutX(arco.getLayoutX() + 25);
                                en2.setLayoutY(arco.getLayoutY() + 2);

                                en2.setFill(Color.WHITE);
                                en2.setVisible(true);
                            } else if (j == 2) {
                                en3.setLayoutX(arco.getLayoutX() + 45);
                                en3.setLayoutY(arco.getLayoutY() + 70);

                                en3.setFill(Color.WHITE);
                                en3.setVisible(true);
                            } else if (j == 3) {
                                en4.setLayoutX(arco.getLayoutX() + 45);
                                en4.setLayoutY(arco.getLayoutY() + 2);

                                en4.setFill(Color.WHITE);
                                en4.setVisible(true);
                            } else if (j == 4) {
                                en5.setLayoutX(arco.getLayoutX() - 5);
                                en5.setLayoutY(arco.getLayoutY() + 25);

                                en5.setFill(Color.WHITE);
                                en5.setVisible(true);
                            } else if (j == 5) {
                                en6.setLayoutX(arco.getLayoutX() + 70);
                                en6.setLayoutY(arco.getLayoutY() + 25);

                                en6.setFill(Color.WHITE);
                                en6.setVisible(true);
                            } else if (j == 6) {
                                en7.setLayoutX(arco.getLayoutX() - 5);
                                en7.setLayoutY(arco.getLayoutY() + 45);

                                en7.setFill(Color.WHITE);
                                en7.setVisible(true);
                            } else if (j == 7) {
                                en8.setLayoutX(arco.getLayoutX() + 70);
                                en8.setLayoutY(arco.getLayoutY() + 45);
                                en8.setFill(Color.WHITE);

                                en8.setVisible(true);
                            }
                            j = j + 1;

                        }
                        //final del evento click del arco
                        
                        
                        //Inicio del codifo para mover los atomos
                        atomos.MovAtomo(arco, label, line, en1, en2, en3, en4, en5, en6, en7, en8);
                        //fin del evento para mover los atomos
                        
                        if (nenla >= 1) {
                            root.getChildren().addAll(en1, en2, en3, en4, en5, en6, en7, en8);
                        }
                        root.getChildren().add(arco);
                        root.getChildren().add(label);
                        
                        //final del evento click al root
          
                    }

                }
            }

        });

    }

    public void reposicionar(Pane root, Pane menu) {

        root.addEventFilter(MouseEvent.MOUSE_MOVED, e -> {
            menu.setPrefSize(200, root.getHeight());
            menu.setLayoutX(root.getWidth() - 200);
            menu.setLayoutY(0);

        });
    }

    public void borrar(Pane root, Arc arco, Arc en1, Arc en2, Arc en3, Arc en4, Arc en5, Arc en6, Arc en7, Arc en8, Label label, Line line) {
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

    }

}

