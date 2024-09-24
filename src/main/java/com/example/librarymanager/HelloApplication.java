package com.example.librarymanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader mainMenu = new FXMLLoader(HelloApplication.class.getResource("template.fxml"));
        Scene scene = new Scene(mainMenu.load());

        stage.setTitle("LibraryManager");
        stage.setScene(scene);
        stage.show();

        HelloController controller = mainMenu.getController();
        controller.setStage(stage);
    }

    public static void startStage(Stage stage, FXMLLoader fxmlLoader, String title) throws IOException{
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
