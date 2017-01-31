package JavaFX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenaos extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(pane, 500, 500, Color.BLUE));

        ArrayList<Circle> ringid = new ArrayList<Circle>();
        for (int i = 0; i < 300; i++) { // teeme 300 ringi
            ringid.add(new Circle(10)); // lisame uue ringi raadiusega 10 px
            ringid.get(i).setCenterX(Math.random()* 500); // määrame juhuslikult asendi
            ringid.get(i).setCenterY(Math.random()* 500);
            ringid.get(i).setFill(Color.RED); // ytleme, et see on punane
            pane.getChildren().add(ringid.get(i)); // ja paneme pane i peale
        }

        for (Circle ring :ringid) // iga ring ringide Arraylistis
        {
            ring.setOnMouseEntered(event -> { // kui seda puudutada hiirega, siis muutub roheliseks
                ring.setFill(Color.GREEN);
            });
        }

        primaryStage.show();
    }
}
