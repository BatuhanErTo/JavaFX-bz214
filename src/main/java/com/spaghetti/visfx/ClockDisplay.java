package com.spaghetti.visfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClockDisplay extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Clock clock = new Clock();
        stage.setScene(new Scene(clock,800,800));
        stage.show();
    }
}
