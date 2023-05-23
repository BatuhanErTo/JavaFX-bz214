package com.spaghetti.visfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FXDemo extends Application {
    @Override
    public void init() {
        System.out.println("init");
    }

    @Override
    public void start(Stage stage) {
        Button btnOK = new Button("OK");
        Button btnExit = new Button("Exit");
        Button btnCancel = new Button("Cancel");

        /**
        HBox root = new HBox();
        root.getChildren().add(btnOK);
        root.getChildren().addAll(btnCancel,btnExit);
        root.getChildren().remove(btnCancel);
        root.getChildren().clear();
         **/

        /**
        BorderPane root = new BorderPane();
        root.setCenter(btnOK);
        root.setRight(btnCancel);
        root.setBottom(btnExit);
         **/

        GridPane root = new GridPane();
        root.add(btnOK,0,0);
        root.add(btnCancel,1,1);
        root.add(btnExit,2,1);

        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.setTitle("JavaFX Demo");
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
