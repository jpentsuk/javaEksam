package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(pane, 500, 500, Color.BLACK));

        ArrayList<Rectangle> kujundid = new ArrayList<Rectangle>();

        for (int i = 0; i <100 ; i++) {
            kujundid.add(new Rectangle((Math.random()*500), (Math.random()*500),24,40));
            kujundid.get(i).setFill(Color.HOTPINK);
            pane.getChildren().add(kujundid.get(i));
        }

        for (Rectangle kujund : kujundid) {
            kujund.setOnMouseEntered(event -> {
                kujund.setScaleX(0.5);
                kujund.setScaleY(0.5);

                kujund.setOnMouseEntered(event1 -> {
                    kujund.setVisible(false);
                });

            });
        }



        primaryStage.show();
    }
}
