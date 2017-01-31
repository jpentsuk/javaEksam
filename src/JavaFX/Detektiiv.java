package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv extends Application {

    ArrayList<Circle> ringid = new ArrayList<Circle>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        primaryStage.setTitle("Detektiiv");
        primaryStage.setScene(new Scene(pane, 500, 500, Color.BLUEVIOLET));


        for (int i = 0; i <3 ; i++) {
            ringid.add(new Circle(40));
        }

        for (int i = 0; i <3 ; i++) {
            ringid.get(i).setCenterX(Math.random() * 400);
            ringid.get(i).setCenterY(Math.random() * 400);
            ringid.get(i).setFill(Color.BLUEVIOLET);
        }
        for (Circle ring : ringid)
        {
            pane.getChildren().add(ring);
        }


        // kui hiirega minnakse ringi vastu

        ringid.get(0).setOnMouseEntered(event ->
        {
            ringid.get(0).setFill(Color.BLACK);});

        ringid.get(1).setOnMouseEntered(event ->
        {
            ringid.get(1).setFill(Color.BLACK);});

        ringid.get(2).setOnMouseEntered(event ->
        {
            ringid.get(2).setFill(Color.BLACK);});

        primaryStage.show();
    }
}
