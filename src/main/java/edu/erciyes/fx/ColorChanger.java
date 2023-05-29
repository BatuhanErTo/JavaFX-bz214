package edu.erciyes.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class ColorChanger extends Application {
    private Text txt;
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setPadding(new Insets(10,10,10,10));
        root.setSpacing(10.0);
        root.setAlignment(Pos.CENTER);
        Button btn = new Button("Change Color");
        txt = new Text("BZ214 Visual Programming");
        txt.setFont(Font.font(24.0));
        root.getChildren().addAll(txt,btn);

        //ClickHandler handler = new ClickHandler();
        /*
        btn.setOnAction(new EventHandler<ActionEvent>() {//Anonymous inner class
            @Override
            public void handle(ActionEvent actionEvent) {
                int red = (int)(Math.random() * 256.0);
                int green = (int)(Math.random() * 256.0);
                int blue = (int)(Math.random() * 256.0);
                Color color = Color.rgb(red,green,blue);
                txt.setFill(color);
            }
        }); */
        //Anonymous inner class
        btn.setOnAction(actionEvent ->
            txt.setFill(Color.color(Math.random(),Math.random(),Math.random())));

        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("Color Changer");
        stage.show();
    }
    /*
    class ClickHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent actionEvent){
            int red = (int)(Math.random() * 256.0);
            int green = (int)(Math.random() * 256.0);
            int blue = (int)(Math.random() * 256.0);
            Color color = Color.rgb(red,green,blue);
            txt.setFill(color);
        }
    }
     */
}
/*
class ClickHandler implements EventHandler<ActionEvent>{
    private Text txt;

    public ClickHandler(Text txt) {
        this.txt = txt;
    }

    public void handle(ActionEvent actionEvent){
        int red = (int)(Math.random() * 256.0);
        int green = (int)(Math.random() * 256.0);
        int blue = (int)(Math.random() * 256.0);
        Color color = Color.rgb(red,green,blue);
        txt.setFill(color);
    }
}
*/