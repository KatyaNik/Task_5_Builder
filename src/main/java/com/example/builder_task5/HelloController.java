package com.example.builder_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class HelloController {
    @FXML
    private Label welcomeText;
    public Button button1;
    public AnchorPane anchorPane1;
    public AnchorPane anchorPane2;
    @FXML
    public void button1OnAction (ActionEvent event){
        Polygon crown1 = new Polygon(
                anchorPane1.getWidth()/2, anchorPane1.getHeight()*0,
                anchorPane1.getWidth()/4, anchorPane1.getHeight()/4,
                anchorPane1.getWidth()/4*3, anchorPane1.getHeight()/4
        );

        Polygon crown2 = new Polygon(
                anchorPane1.getWidth()/2, anchorPane1.getHeight()/8,
                anchorPane1.getWidth()/4, anchorPane1.getHeight()/4*3,
                anchorPane1.getWidth()/4*3, anchorPane1.getHeight()/4*2
        );
        crown1.setFill(Color.GREEN);
        crown2.setFill(Color.GREEN);
        anchorPane1.getChildren().addAll( crown1, crown2);
        //anchorPane2.getChildren().add(crown2);
    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}