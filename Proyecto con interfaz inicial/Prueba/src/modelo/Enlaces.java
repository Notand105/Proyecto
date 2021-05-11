package modelo;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;

public class Enlaces {

    public void orden(Arc en1, Arc en2, Arc en3, Arc en4, Arc en5, Arc en6, Arc en7, Arc en8, Pane pane, Arc arco) {
        double x = arco.getRadiusX();
        double y = arco.getRadiusY();
        if (x == 20) {
            en1.setLayoutX(arco.getLayoutX() + 25);
            en1.setLayoutY(arco.getLayoutY() + 70);

            en2.setLayoutX(arco.getLayoutX() + 25);
            en2.setLayoutY(arco.getLayoutY() + 2);

            en3.setLayoutX(arco.getLayoutX() + 45);
            en3.setLayoutY(arco.getLayoutY() + 70);

            en4.setLayoutX(arco.getLayoutX() + 45);
            en4.setLayoutY(arco.getLayoutY() + 2);

            en5.setLayoutX(arco.getLayoutX() - 5);
            en5.setLayoutY(arco.getLayoutY() + 25);

            en6.setLayoutX(arco.getLayoutX() + 70);
            en6.setLayoutY(arco.getLayoutY() + 25);

            en7.setLayoutX(arco.getLayoutX() - 5);
            en7.setLayoutY(arco.getLayoutY() + 45);

            en8.setLayoutX(arco.getLayoutX() + 70);
            en8.setLayoutY(arco.getLayoutY() + 45);

        }
        else {
                if (en1.isVisible()) {
                    en1.setLayoutX(arco.getLayoutX()  - 10);
                    en1.setLayoutY(arco.getLayoutY() + x / 2 + 80);

                }
                if (en2.isVisible()) {
                    en2.setLayoutX(arco.getLayoutX()  - 10);
                    en2.setLayoutY(arco.getLayoutY() - x / 2 - 20);
                }
                if (en3.isVisible()) {
                    en3.setLayoutX(arco.getLayoutX()+ x / 2 + 45);
                    en3.setLayoutY(arco.getLayoutY()+ x / 2 + 80);

                }
                if (en4.isVisible()) {
                     en4.setLayoutX(arco.getLayoutX()+ x / 2 + 45);
                     en4.setLayoutY(arco.getLayoutY() - x / 2- 20);

                }
                if (en5.isVisible()) {
                    en5.setLayoutX(arco.getLayoutX() - x / 2- 15);
                    en5.setLayoutY(arco.getLayoutY() - x / 2 + 25);
                }
                if (en6.isVisible()) {
                   en6.setLayoutX(arco.getLayoutX()+ x / 2 + 82);
                    en6.setLayoutY(arco.getLayoutY() - x / 2+ 25);
                }
                if (en7.isVisible()) {
                    en7.setLayoutX(arco.getLayoutX()- x / 2 - 15);
                    en7.setLayoutY(arco.getLayoutY()+ x / 2 + 35);
                }
                if (en8.isVisible()) {
                    en8.setLayoutX(arco.getLayoutX()+ x / 2 + 82);
                    en8.setLayoutY(arco.getLayoutY() + x / 2+ 35);
                }
        }
        

    }

}
