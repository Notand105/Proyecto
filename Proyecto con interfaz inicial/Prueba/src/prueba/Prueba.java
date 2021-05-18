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
import javafx.scene.Node;
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
import modelo.Enlaces;
import modelo.Eventospanel;
import modelo.Objet;
public class Prueba extends Application {

    //variables
     ArrayList<Objet> Molecula = new ArrayList<Objet>();
      ArrayList<Objet> aUnir = new ArrayList<Objet>();
    ArrayList<Objet> AtomosGroup = new ArrayList<Objet>();
    ArrayList<Objet> AtomosGroup2 = new ArrayList<Objet>();
    ArrayList<Label> names = new ArrayList();
    ArrayList<Arc> atomos = new ArrayList();
    Lineas lineas = new Lineas();
    Atomos atom = new Atomos();
    boolean j1 = false;
    int orden = 0;
    int cont=0;
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
    int Tamaño;
    //fin de variables
    @Override
    public void start(Stage primaryStage) {
        Enlaces enlaces=new Enlaces();
        Image textoImagen = new Image("/modelo/Nombre.png");
        AbirVentanas ventanas = new AbirVentanas();
        Eventospanel eventospanel = new Eventospanel();
        Botonesevent botonese = new Botonesevent();

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
        Pane menu = new Pane();

        setBackg(menu);
        //root.setStyle("-fx-background-color: #WHITE;");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nenlaces = ventanas.Nenlaces();

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

                //enlaces para un atomo clonado
               
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
                Objet atomoPE= new Objet(arco, en1, en2, en3, en4, en5, en6, en7, en8,label,line);
                AtomosGroup.add(atomoPE);
                //Inicio del evento de doble click en el arco
                arco.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {Objet atomoPE= new Objet(arco, en1, en2, en3, en4, en5, en6, en7, en8,label,line);
                
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
                                    
                                    names.add(label);
                                    j = 0;
                                    Nombre.setText("");
                                    while (j < names.size()) {
                                        Nombre.setText(Nombre.getText() + names.get(j).getText());

                                        j = j + 1;
                                    }
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
                                Objet atomoPE2= new Objet(arco, en1, en2, en3, en4, en5, en6, en7, en8,label,line);
                                borrar = controlador3.getborrar();
                                clonar = controlador3.getclonar();
                                if (borrar) {
                                    aUnir.remove(atomoPE);
                                    names.remove(label.getText());
                                    j = 0;
                                    Nombre.setText("");
                                    while (j < names.size()) {
                                        Nombre.setText(Nombre.getText() + names.get(j).getText());

                                        j = j + 1;
                                    }
                                    if(AtomosGroup2.size()>0){
                                        int cont2=0;
                                        while (cont2<AtomosGroup2.size()){
                            
                                            eventospanel.borrar(root, AtomosGroup2.get(cont2).getArco(), AtomosGroup2.get(cont2).getEn1(), AtomosGroup2.get(cont2).getEn2(), AtomosGroup2.get(cont2).getEn3(), AtomosGroup2.get(cont2).getEn4(), AtomosGroup2.get(cont2).getEn5(), AtomosGroup2.get(cont2).getEn6(), AtomosGroup2.get(cont2).getEn7(), AtomosGroup2.get(cont2).getEn8(), AtomosGroup2.get(cont2).getLabel(), AtomosGroup2.get(cont2).getLine());
                              
                                            cont2=cont2+1;
                                        }
                                        
                                        AtomosGroup2.clear();
                                    
                                    }
                                    eventospanel.borrar(root, arco, en1, en2, en3, en4, en5, en6, en7, en8, label, line);

                                    borrar = false;
                                }
                                
                                if(controlador3.getGroup()){                                  
                                    cont=0;
                                    
                                    AtomosGroup2.add(atomoPE2);
                                    while (cont<AtomosGroup2.size()){
                                    AtomosGroup2.get(cont).getArco().setStroke(Color.BLUE);
                                    cont=cont+1;
                                    }
                                    atom.MovGroup(arco, AtomosGroup2);
                                }
                                if(controlador3.getDGroup()){
                                    int c3=0;
                                    while (c3<AtomosGroup2.size()){
                                        AtomosGroup2.get(c3).getArco().setStroke(Color.BLACK);
                                        AtomosGroup2.remove(atomoPE2);
                                        c3=c3+1;
                                    }
                                    AtomosGroup2.clear();
                                    int c4=0;
                                    while (c4<AtomosGroup.size()){
                                       atom.MovAtomo(AtomosGroup.get(c4).getArco(), AtomosGroup.get(c4).getLabel(), AtomosGroup.get(c4).getLine() ,AtomosGroup.get(c4).getEn1(), AtomosGroup.get(c4).getEn2(), AtomosGroup.get(c4).getEn3(), AtomosGroup.get(c4).getEn4(), AtomosGroup.get(c4).getEn5(), AtomosGroup.get(c4).getEn6(), AtomosGroup.get(c4).getEn7(), AtomosGroup.get(c4).getEn8());

                                        c4=c4+1;
                                    }
                                    //atom.MovAtomo(atomoPE2.getArco(), atomoPE2.getLabel(), atomoPE2.getLine() ,atomoPE2.getEn1(), atomoPE2.getEn2(), atomoPE2.getEn3(), atomoPE2.getEn4(), atomoPE2.getEn5(), atomoPE2.getEn6(), atomoPE2.getEn7(), atomoPE2.getEn8());
                                }
                                if(controlador3.getUnir()){
                                    if(!(aUnir.contains(atomoPE))){
                                        aUnir.add(atomoPE);
                                    }
                                    
                               
                                    eventospanel.union(root, aUnir);
                                    
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
                    System.out.println(arco.getLayoutX());
                }
                //Inicio del codifo para mover los atomos
                atom.MovAtomo(arco, label, line, en1, en2, en3, en4, en5, en6, en7, en8);
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

        botonese.molecbtn(Molec, Nombre,aUnir);
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
        menu.setPrefSize(200, 700);
        menu.setLayoutX(800);
        menu.setLayoutY(0);
        menu.getChildren().add(datos);
        menu.getChildren().add(join);
        menu.getChildren().add(btn);
        menu.getChildren().add(Molec);
        root.getChildren().add(menu);
        Scene scene = new Scene(root, 1000, 700);
        eventospanel.doubleclick(root,nenlaces);
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
