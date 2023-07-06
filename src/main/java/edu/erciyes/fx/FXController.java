package edu.erciyes.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXController extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text(100,100,"Visual Programming");
        text.setFont(Font.font(20));
        Pane paneText = new Pane();
        paneText.getChildren().add(text);

        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");
        HBox paneButton = new HBox();
        paneButton.setAlignment(Pos.CENTER);
        paneButton.setSpacing(10.0);
        paneText.setPadding(new Insets(10,10,10,10));
        paneButton.setStyle("-fx-border-color: green; -fx-background-color: gray");
        paneButton.getChildren().addAll(btnLeft,btnRight);

        btnLeft.setOnAction(actionEvent -> text.setX(text.getX() - 10.0));
        btnRight.setOnAction(actionEvent -> text.setX(text.getX() + 10.0));

        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkItalic = new CheckBox("Italic");
        VBox paneCheck = new VBox();
        paneCheck.setAlignment(Pos.CENTER_RIGHT);
        paneCheck.setSpacing(10.0);
        paneCheck.setPadding(new Insets(10,10,10,10));
        paneCheck.setStyle("-fx-border-color: green;");
        paneCheck.getChildren().addAll(chkBold,chkItalic);

        EventHandler<ActionEvent> handler = e ->{
          if (chkBold.isSelected() && chkItalic.isSelected())
              text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
          else if ((chkBold.isSelected()))
              text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR,20));
          else if (chkItalic.isSelected())
              text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC,20));
          else
              text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR,20));
          };
        chkBold.setOnAction(handler);
        chkItalic.setOnAction(handler);

        RadioButton rdRed = new RadioButton("Red");
        RadioButton rdBlue = new RadioButton("Blue");
        RadioButton rdGreen = new RadioButton("Green");

        VBox paneRadio = new VBox();
        paneRadio.setAlignment(Pos.CENTER_LEFT);
        paneRadio.setSpacing(10.0);
        paneRadio.setPadding(new Insets(10,10,10,10));
        paneRadio.setStyle("-fx-border-color: green;");
        paneRadio.getChildren().addAll(rdRed, rdBlue, rdGreen);

        ToggleGroup group = new ToggleGroup();
        rdRed.setToggleGroup(group);
        rdBlue.setToggleGroup(group);
        rdGreen.setToggleGroup(group);

        rdGreen.setOnAction(e -> {
            if(rdGreen.isSelected())
                text.setFill(Color.GREEN);
        });
        rdBlue.setOnAction(e -> text.setFill(Color.BLUE));
        rdRed.setOnAction(e -> text.setFill(Color.RED));

        Label lbl = new Label("Enter a Text");
        TextField txtNew = new TextField();
        txtNew.setPrefColumnCount(30);
        HBox paneTextNew = new HBox();
        paneRadio.setAlignment(Pos.CENTER);
        paneRadio.setSpacing(10.0);
        paneRadio.setPadding(new Insets(10,10,10,10));
        paneRadio.setStyle("-fx-border-color: green;");
        paneTextNew.getChildren().addAll(lbl, txtNew);

        txtNew.setOnAction(e -> {
            text.setText(txtNew.getText());
            txtNew.setText("");});

        BorderPane root = new BorderPane();
        root.setCenter(paneText);
        root.setBottom(paneButton);
        root.setRight(paneCheck);
        root.setLeft(paneRadio);
        root.setTop(paneTextNew);
        Scene scene = new Scene(root,600,300);
        stage.setScene(scene);
        stage.show();
    }
}
