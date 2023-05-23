package com.spaghetti.visfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapeDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Rectangle r1 = new Rectangle(20,20,200,150);
        r1.setFill(Color.YELLOW);
        r1.setStroke(Color.NAVY);
        r1.setStrokeWidth(5.0);

        Rectangle r2 = new Rectangle(20,250,200,150);
        r2.setFill(Color.WHITE);
        r2.setStroke(Color.RED);
        r2.setStrokeWidth(5.0);
        r2.setArcHeight(25.0);
        r2.setRotate(45.0);

        Ellipse e1 = new Ellipse(400,100,100,75);

        Arc a1 = new Arc(400,300,100,100,90,90);
        a1.setFill(Color.GRAY);
        a1.setType(ArcType.ROUND);

        root.getChildren().addAll(r1,r2,e1,a1);
        stage.setScene(new Scene(root,800,800));
        stage.show();
    }
}
