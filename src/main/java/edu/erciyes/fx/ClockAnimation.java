package edu.erciyes.fx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClockAnimation extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        Clock clock = new Clock();

        EventHandler<ActionEvent> handler = event -> clock.setCurrentTime();
        Timeline animation = new Timeline();
        animation.getKeyFrames().addAll(new KeyFrame(Duration.millis(1000), handler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        root.setCenter(clock);
        Scene scene = new Scene(root, 500,500);
        stage.setScene(scene);
        stage.setTitle("Clock Animation");
        stage.show();
    }
}
