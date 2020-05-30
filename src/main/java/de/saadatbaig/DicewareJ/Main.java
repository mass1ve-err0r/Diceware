package de.saadatbaig.DicewareJ;

import de.saadatbaig.DicewareJ.Controllers.HomeViewController;
import de.saadatbaig.DicewareJ.Views.HomeView;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    private FXMLLoader fxmlLoader;
    private static HomeViewController HVC;
    private static HomeView HV;

    public void start(Stage stage) throws Exception {
        // Setup Scene
        fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("HomeView.fxml"));
        Pane pane = fxmlLoader.load();
        HV = fxmlLoader.getController();
        HVC = new HomeViewController(HV);

        // scene settings
        Scene scene = new Scene(pane);
        stage.setTitle("DicewareJ - v1.0");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    // Entry-point
    public static void main(String[] args) {
        launch(args);
    }

    public static void cp(int _a, boolean _w, boolean _n) {
        HVC.generatePassword(_a, _w, _n);
    }

    public void stop() throws Exception {
        Platform.exit();
        System.exit(0);
    }

    /* End */
}
