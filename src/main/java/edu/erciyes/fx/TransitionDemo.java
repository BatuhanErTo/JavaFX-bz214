package edu.erciyes.fx;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TransitionDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();

        Rectangle rect1 = new Rectangle(10,10,100,100);
        FadeTransition ft = new FadeTransition(Duration.millis(3000),rect1);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        root.getChildren().addAll(rect1);
        stage.setScene(new Scene(root,500,500));
        stage.show();
    }
}
