package com.BAC.View;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLauncher extends Application{
//    @Override
//    public void start(Stage stage) throws Exception {
//
//    }
public static void main(String[] args) {
    launch(args);
}

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BAC Calculator");
        Label title = new Label("BAC Calculator");
        Label description = new Label("Drink safe! Do not use this app as replacement for medical advice.");
        Button btn = new Button();
        btn.setText("Begin drinking");
//        btn.setOnAction(e -> primaryStage.setScene(scene2));
//        btn.setOnAction(event -> System.out.println("Hello World!"));

        VBox root = new VBox();
        root.getChildren().add(title);
        root.getChildren().add(description);
        root.getChildren().add(btn);
//        scene1= new Scene(layout1,300,250);
//        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}

//public class HelloWorld extends Application {
//
//}
