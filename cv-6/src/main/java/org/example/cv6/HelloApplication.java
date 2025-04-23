package org.example.cv6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private javafx.scene.control.Label labWeight;
    private javafx.scene.control.Label labHeight;
    private Button butCalculate;
    private javafx.scene.control.TextField tfWeight;
    private javafx.scene.control.TextField tfHeight;
    private javafx.scene.control.Label labBMI;


    @Override
    public void start(Stage stage) throws Exception {
        FlowPane flowPane = new FlowPane();
        flowPane.setStyle("-fx-background-color: #fff");
        flowPane.setPadding(new Insets(50, 50, 50, 50));

        butCalculate = new Button("Calculate");

        labWeight = new javafx.scene.control.Label("Weight: ");
        labWeight.setStyle("-fx-background-color: white"); // nastavovani vzhledu
        labWeight.setStyle("-fx-font-size: 40px");
        labBMI = new javafx.scene.control.Label("BMI: ");

        labHeight = new javafx.scene.control.Label("Height: ");
        labHeight.setStyle("-fx-background-color: white"); // nastavovani vzhledu
        labHeight.setStyle("-fx-font-size: 40px");

        tfWeight = new javafx.scene.control.TextField();
        tfHeight = new javafx.scene.control.TextField();

        flowPane.getChildren().add(labWeight);
        flowPane.getChildren().add(tfWeight);
        flowPane.getChildren().add(labHeight);// pridani ibjektu do plochy
        flowPane.getChildren().add(tfHeight);

        flowPane.getChildren().add(butCalculate);
        flowPane.getChildren().add(labBMI);


        Scene scene = new Scene(flowPane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Hello!");

        stage.show();  // vytvoreni sceny

        // anonymni vnitrni trida event handler
        // pouziva se pro kratke jednorazove
//        button1.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                stage.setTitle("Clicked!");
//            }
//        });

        // lambda expresion
//        int counter = 0;
//        button1.setOnAction((ActionEvent event) -> {
//            System.out.println("Clicked: " + counter + " this many times");
//        });

        butCalculate.setOnAction(new ActionEventHandlerInt());

        tfWeight.setOnScroll((ScrollEvent scroll) -> {
            Double value = Double.parseDouble(tfWeight.getText() + 1);
            tfWeight.setText(value.toString());
        });
    }

    private class ActionEventHandlerInt implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent actionEvent) {
            if (tfHeight.getText().isEmpty() || tfWeight.getText().isEmpty()) {
                labBMI.setText("You must input some height or weight.");
            } else {
                double bmi = Double.parseDouble(tfWeight.getText()) / Math.pow(Double.parseDouble(tfHeight.getText()), 2);
                labBMI.setText("BMI: " + String.format("%.2f", bmi));
            }
            
        }
    }

    public static void main(String[] args) {
        launch();
    }
}