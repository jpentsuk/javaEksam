package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(pane, 500, 500));

        Circle pall = new Circle(20);
        pall.setCenterX(20);
        pall.setCenterY(20);
        pane.getChildren().add(pall);

        pall.setOnMouseEntered(event -> {
            pall.setCenterX(Math.random()*500);
            pall.setCenterY(Math.random()*500);
        });

        primaryStage.show();
    }
}
