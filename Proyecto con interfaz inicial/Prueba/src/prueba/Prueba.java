package prueba;

//todos los import
import static com.sun.javafx.scene.control.skin.Utils.getResource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modelo.Atomos;
import modelo.Lineas;
import modelo.AbirVentanas;
import modelo.Botonesevent;
import modelo.Eventospanel;

public class Prueba extends Application {

    //variables
    ArrayList<Label> names = new ArrayList();
    ArrayList<Arc> atomos = new ArrayList();
    Lineas lineas = new Lineas();
    Atomos atom = new Atomos();
    boolean j1 = false;
    int orden = 0;
    boolean unir = false;
    boolean borrar = false, clonar = false;
    int ndeAtomos = 0;
    String texto;
    Color color;
    Color color2;
    Color color3;
    int posiX = 60;
    int posiY = 60;
    Label Nombre = new Label();
    String name = "";
    int nenlaces = 0;
    int j = 0;

    //fin de variables
    @Override
    public void start(Stage primaryStage) {
        
        Image textoImagen = new Image("/modelo/Nombre.png");
        AbirVentanas ventanas= new AbirVentanas();
        Eventospanel eventospanel= new Eventospanel();
        Botonesevent botonese= new Botonesevent();
        
        //Llamar a la funcion que abre la ventanade inicio del programa
        ventanas.Inicio();
       
        
        Label name = new Label();

        ImageView datos = new ImageView(textoImagen);
        //datos.setTextFill(Color.BLACK);
        Button join = new Button();
        join.setText("Agregar linea");
        join.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                unir = true;
            }
        });
        Button btn = new Button();
        btn.setText("Agregar Atomo");
        Pane root = new Pane();
        Pane menu= new Pane();
        
        setBackg(menu);
        //root.setStyle("-fx-background-color: #WHITE;");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nenlaces=ventanas.Nenlaces();
                
                //
                //enlaces para un atomo principal

                Arc en1 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en2 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en3 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en4 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en5 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en6 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en7 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en8 = new Arc(15, 15, 5, 5, 0, 360);

                Line l1 = new Line();
                Line l2 = new Line();
                Line l3 = new Line();
                Line l4 = new Line();
                Line l5 = new Line();
                Line l6 = new Line();
                Line l7 = new Line();
                Line l8 = new Line();
                
                l1.setVisible(false);
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l5.setVisible(false);
                l6.setVisible(false);
                l7.setVisible(false);
                l8.setVisible(false);
                //enlaces para un atomo clonado
                Arc en21 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en22 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en23 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en24 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en25 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en26 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en27 = new Arc(15, 15, 5, 5, 0, 360);
                Arc en28 = new Arc(15, 15, 5, 5, 0, 360);
                //color de borde enlace principal
                en1.setStroke(Color.BLACK);
                en2.setStroke(Color.BLACK);
                en3.setStroke(Color.BLACK);
                en4.setStroke(Color.BLACK);
                en5.setStroke(Color.BLACK);
                en6.setStroke(Color.BLACK);
                en7.setStroke(Color.BLACK);
                en8.setStroke(Color.BLACK);
                //color de borde enlace clonado
                en21.setStroke(Color.BLACK);
                en22.setStroke(Color.BLACK);
                en23.setStroke(Color.BLACK);
                en24.setStroke(Color.BLACK);
                en25.setStroke(Color.BLACK);
                en26.setStroke(Color.BLACK);
                en27.setStroke(Color.BLACK);
                en28.setStroke(Color.BLACK);
                //visibilidad enlaces
                en1.setVisible(false);
                en2.setVisible(false);
                en3.setVisible(false);
                en4.setVisible(false);
                en5.setVisible(false);
                en6.setVisible(false);
                en7.setVisible(false);
                en8.setVisible(false);
                //visibilidad enlaces clonados
                en21.setVisible(false);
                en22.setVisible(false);
                en23.setVisible(false);
                en24.setVisible(false);
                en25.setVisible(false);
                en26.setVisible(false);
                en27.setVisible(false);
                en28.setVisible(false);
                //visibilidad enlaces
                //
                ndeAtomos += 1;
                Line line = new Line();
                line.setVisible(false);
                Arc arco = new Arc(50, 50, 20, 20, 0, 360);
                Label label = new Label("");
                arco.setLayoutX(posiX);
                arco.setLayoutY(posiY);
                arco.setFill(Color.WHITE);
                arco.setStroke(Color.BLACK);
                arco.setStrokeWidth(3);
                label.setLayoutX(arco.getLayoutX() + 40);
                label.setLayoutY(arco.getLayoutY() + 40);
                posiX += 20;
                if (posiY + 40 >= 350) {
                    posiY = 0;
                }
                posiY += 40;

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
                                    color = controlador.getColor();
                                    label.setText(controlador.getnombre());

                                    names.add(label);
                                    j = 0;
                                    Nombre.setText("");
                                    while (j < names.size()) {
                                        Nombre.setText(Nombre.getText() + names.get(j).getText());

                                        j = j + 1;
                                    }
                                    arco.setStroke(color);
                                    color2 = controlador.getColortxt();
                                    label.setTextFill(color2);

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

                                borrar = controlador3.getborrar();
                                clonar = controlador3.getclonar();
                                if (borrar) {
                                    names.remove(label.getText());
                                    j = 0;
                                    Nombre.setText("");
                                    while (j < names.size()) {
                                        Nombre.setText(Nombre.getText() + names.get(j).getText());

                                        j = j + 1;
                                    }
                                    eventospanel.borrar(root, arco, en1, en2, en3, en4, en5, en6, en7, en8, l1, l2, l3, l4, l5, l6, l7, l8, label, line);

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

                j = 0;
                while (j < nenlaces) {
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

                if (unir) {
                    if (en1.isVisible()) {
                        l1.setVisible(true);
                        l1.setStartX(en1.getLayoutX() + 15);
                        l1.setStartY(en1.getLayoutY() + 18);
                        l1.setEndX(en1.getLayoutX() + 15);
                        l1.setEndY(en1.getLayoutY() + 100);
                        l1.setStrokeWidth(4);
                        root.getChildren().add(l1);
                        lineas.MovLinea(l1, arco);
                    }
                    if (en2.isVisible()) {
                        l2.setVisible(true);
                        l2.setStartX(en2.getLayoutX() + 15);
                        l2.setStartY(en2.getLayoutY() + 18);
                        l2.setEndX(en2.getLayoutX() + 15);
                        l2.setEndY(en2.getLayoutY() + 100);
                        l2.setStrokeWidth(4);
                        root.getChildren().add(l2);
                        lineas.MovLinea(l2, arco);
                    }
                    if (en3.isVisible()) {
                        l3.setVisible(true);
                        l3.setStartX(en3.getLayoutX() + 15);
                        l3.setStartY(en3.getLayoutY() + 18);
                        l3.setEndX(en3.getLayoutX() + 15);
                        l3.setEndY(en3.getLayoutY() + 100);
                        l3.setStrokeWidth(4);
                        root.getChildren().add(l3);
                        lineas.MovLinea(l3, arco);
                    }
                    if (en4.isVisible()) {
                        l4.setVisible(true);
                        l4.setStartX(en4.getLayoutX() + 15);
                        l4.setStartY(en4.getLayoutY() + 18);
                        l4.setEndX(en4.getLayoutX() + 15);
                        l4.setEndY(en4.getLayoutY() + 100);
                        l4.setStrokeWidth(4);
                        root.getChildren().add(l4);
                        lineas.MovLinea(l4, arco);
                    }
                    if (en5.isVisible()) {
                        l1.setVisible(true);
                        l1.setStartX(en5.getLayoutX() + 15);
                        l1.setStartY(en5.getLayoutY() + 18);
                        l1.setEndX(en5.getLayoutX() + 15);
                        l1.setEndY(en5.getLayoutY() + 100);
                        l1.setStrokeWidth(4);
                        root.getChildren().add(l5);
                        lineas.MovLinea(l5, arco);
                    }
                    if (en6.isVisible()) {
                        l6.setVisible(true);
                        l6.setStartX(en6.getLayoutX() + 15);
                        l6.setStartY(en6.getLayoutY() + 18);
                        l6.setEndX(en6.getLayoutX() + 15);
                        l6.setEndY(en6.getLayoutY() + 100);
                        l6.setStrokeWidth(4);
                        root.getChildren().add(l6);
                        lineas.MovLinea(l6, arco);
                    }
                    if (en7.isVisible()) {
                        l7.setVisible(true);
                        l7.setStartX(en7.getLayoutX() + 15);
                        l7.setStartY(en7.getLayoutY() + 18);
                        l7.setEndX(en7.getLayoutX() + 15);
                        l7.setEndY(en7.getLayoutY() + 100);
                        l7.setStrokeWidth(4);
                        root.getChildren().add(l7);
                        lineas.MovLinea(l7, arco);
                    }
                    if (en8.isVisible()) {
                        l8.setVisible(true);
                        l8.setStartX(en8.getLayoutX() + 15);
                        l8.setStartY(en8.getLayoutY() + 18);
                        l8.setEndX(en8.getLayoutX() + 15);
                        l8.setEndY(en8.getLayoutY() + 100);
                        l8.setStrokeWidth(4);
                        root.getChildren().add(l8);
                        lineas.MovLinea(l8, arco);
                    }
                    
                    lineas.eventosLinea(l1, root);
                    lineas.eventosLinea(l2, root);
                    lineas.eventosLinea(l3, root);
                    lineas.eventosLinea(l4, root);
                    lineas.eventosLinea(l5, root);
                    lineas.eventosLinea(l6, root);
                    lineas.eventosLinea(l7, root);
                    lineas.eventosLinea(l8, root);

                }
                //Inicio del codifo para mover los atomos
                atom.MovAtomo(arco, label, line, atomos, en1, en2, en3, en4, en5, en6, en7, en8, l1, l2, l3, l4, l5, l6, l7, l8);
                //fin del evento para mover los atomos
                atomos.add(arco);
                if (nenlaces >= 1) {
                    root.getChildren().addAll(en1, en2, en3, en4, en5, en6, en7, en8);
                }
                root.getChildren().add(arco);
                root.getChildren().add(label);
                unir = false;
                //final del evento click al boton

            }

        });

        Button Molec = new Button();
        Molec.setText("Crear molecula");

        botonese.molecbtn(Molec, Nombre);
        //setStylebtn(Molec);
        Molec.getStylesheets().add("/vista/Botones.css");
        btn.getStylesheets().add("/vista/Botones.css");
        join.getStylesheets().add("/vista/Botones.css");
        Molec.setLayoutX(20);
        Molec.setLayoutY(300);
        btn.setLayoutX(20);
        btn.setLayoutY(100);
        join.setLayoutX(20);
        join.setLayoutY(200);
        datos.setLayoutX(10);
        datos.setLayoutY(500);
        datos.setFitHeight(100);
        datos.setFitWidth(180);
        /*
        root.getChildren().add(datos);
        root.getChildren().add(join);
        root.getChildren().add(btn);
        root.getChildren().add(Molec);
        */
        menu.setPrefSize(200,700);
        menu.setLayoutX(800);
        menu.setLayoutY(0);
        menu.getChildren().add(datos);
        menu.getChildren().add(join);
        menu.getChildren().add(btn);
        menu.getChildren().add(Molec);
        root.getChildren().add(menu);
        Scene scene = new Scene(root, 1000, 700);
        eventospanel.doubleclick(root);
        eventospanel.reposicionar(root, menu);
            
        
        primaryStage.setTitle("Moleculator");
        primaryStage.getIcons().add(new Image("/modelo/unknown.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setMinHeight(705);
        primaryStage.setMinWidth(1005);
       
    }

   
    public void setBackg(Pane panel) {
        panel.setStyle("-fx-background-image: url(\"/modelo/fondo.png\");");
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

}
