package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 500, 500);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(stseen);


        int y = 30;

        ArrayList<TextField> tekstivaljad = new ArrayList<TextField>();
        for (int i = 0; i <4 ; i++) {
            tekstivaljad.add(new TextField());
            tekstivaljad.get(i).setLayoutX(120);
            tekstivaljad.get(i).setLayoutY(y);
            y+=30;
            pane.getChildren().add(tekstivaljad.get(i));
        }
        ArrayList<Label> labelid = new ArrayList<Label>();

        y = 30;

        for (int i = 0; i <4 ; i++) {
            labelid.add(new Label());
            labelid.get(i).setLayoutX(5);
            labelid.get(i).setLayoutY(y);
            y+=30;
            pane.getChildren().add(labelid.get(i));
        }
        labelid.get(0).setText("Alguskoordinaat X");
        labelid.get(1).setText("Alguskoordinaat Y");
        labelid.get(2).setText("Kõrgus");
        labelid.get(3).setText("Laius");

        Button looristkylik = new Button("Loo ristkülik");
        pane.getChildren().add(looristkylik);
        looristkylik.setLayoutX(5);
        looristkylik.setLayoutY(150);

        looristkylik.setOnAction(event -> {




            String a = tekstivaljad.get(0).getText();
            String b = tekstivaljad.get(1).getText();
            String c = tekstivaljad.get(2).getText();
            String d = tekstivaljad.get(3).getText();

            int yks = Integer.parseInt(a);
            int kaks = Integer.parseInt(b);
            int kolm = Integer.parseInt(c);
            int neli = Integer.parseInt(d);

            if (yks>500 || kaks>500 || kolm>500 || neli>500)
            {
                System.out.println("Mingi koordinaat on suurem kui 500");
                for (int i = 0; i <tekstivaljad.size() ; i++) {
                    tekstivaljad.get(i).clear();
                }
            }
            else {

                Rectangle ristkylik = new Rectangle(yks,kaks,kolm,neli);
                for (Label leibel : labelid) {
                    leibel.setVisible(false);
                }
                for (TextField vali : tekstivaljad) {
                    vali.setVisible(false);
                }
                looristkylik.setVisible(false);
                pane.getChildren().add(ristkylik);
            }
        });

        primaryStage.show();
    }
}
