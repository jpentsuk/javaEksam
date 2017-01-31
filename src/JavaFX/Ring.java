package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(pane, 500, 500));

        int y = 30;

        ArrayList<TextField> tekstivaljad = new ArrayList<TextField>();
        for (int i = 0; i < 3; i++) {
            tekstivaljad.add(new TextField());
            tekstivaljad.get(i).setLayoutX(120);
            tekstivaljad.get(i).setLayoutY(y);
            y += 30;
            pane.getChildren().add(tekstivaljad.get(i));
        }
        ArrayList<Label> labelid = new ArrayList<Label>();

        y = 30;

        for (int i = 0; i < 3; i++) {
            labelid.add(new Label());
            labelid.get(i).setLayoutX(5);
            labelid.get(i).setLayoutY(y);
            y += 30;
            pane.getChildren().add(labelid.get(i));
        }
        labelid.get(0).setText("Alguskoordinaat X");
        labelid.get(1).setText("Alguskoordinaat Y");
        labelid.get(2).setText("Raadius");


        Button looring = new Button("Loo ring");
        pane.getChildren().add(looring);
        looring.setLayoutX(5);
        looring.setLayoutY(150);

        looring.setOnAction(event -> {
            String a = tekstivaljad.get(0).getText();
            String b = tekstivaljad.get(1).getText();
            String c = tekstivaljad.get(2).getText();

            int yks = Integer.parseInt(a);
            int kaks = Integer.parseInt(b);
            int kolm = Integer.parseInt(c);

            if (yks > 500 || kaks > 500 || kolm > 500) {
                System.out.println("Mingi koordinaat on suurem kui 500");
                for (int i = 0; i < tekstivaljad.size(); i++) {
                    tekstivaljad.get(i).clear();
                }
            } else {

                Circle ring = new Circle(kolm);
                ring.setCenterX(yks);
                ring.setCenterY(kaks);
                for (Label leibel : labelid) {
                    leibel.setVisible(false);
                }
                for (TextField vali : tekstivaljad) {
                    vali.setVisible(false);
                }
                looring.setVisible(false);
                pane.getChildren().add(ring);
            }
        });

        primaryStage.show();
    }
}
