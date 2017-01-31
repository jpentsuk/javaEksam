package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(pane, 500, 500, Color.ALICEBLUE));

        Label sonum = new Label("Siin oli küll nüüd palju palle");
        sonum.setLayoutX(Math.random()*500);
        sonum.setLayoutY(Math.random()*500);
        pane.getChildren().add(sonum);
        ArrayList<Circle> ringid = new ArrayList<Circle>();

        for (int i = 0; i <2200 ; i++) {
            ringid.add(new Circle(20));
            ringid.get(i).setCenterX(Math.random()*500);
            ringid.get(i).setCenterY(Math.random()*500);
            ringid.get(i).setFill(Color.FUCHSIA);
            pane.getChildren().add(ringid.get(i));
        }
        for (Circle ring : ringid)
        {
            ring.setOnMouseEntered(event -> {
                ring.setVisible(false);
            });
        }



        primaryStage.show();
    }
}
