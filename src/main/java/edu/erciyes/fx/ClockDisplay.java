package edu.erciyes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.lang.invoke.VolatileCallSite;

public class ClockDisplay extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Clock clock = new Clock();

        BorderPane root = new BorderPane();
        root.setCenter(clock);
        Scene scene = new Scene(root, 500,500);
        stage.setScene(scene);
        stage.show();
    }
}
