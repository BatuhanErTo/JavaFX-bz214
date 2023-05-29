package edu.erciyes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleController extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Circle circle = new Circle(100,100,50);
        circle.setFill(Color.RED);
        circle.setFocusTraversable(true);

        circle.setOnMouseClicked(
                mouseEvent -> circle.requestFocus()
        );
        circle.setOnMouseDragged(
                mouseEvent -> {
                    circle.setCenterX(mouseEvent.getX());
                    circle.setCenterY(mouseEvent.getY());
                }
        );
        circle.setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()){
                case UP: circle.setCenterY(circle.getCenterY() - 10.0); break;
                case DOWN: circle.setCenterY(circle.getCenterY() + 10.0); break;
                case LEFT: circle.setCenterX(circle.getCenterX() - 10.0); break;

                case RIGHT: circle.setCenterX(circle.getCenterX() + 10.0); break;
            }
        });




        root.getChildren().addAll(circle);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Circle Controller");
        stage.show();
    }
}
