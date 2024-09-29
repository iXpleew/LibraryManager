package com.example.librarymanager;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloController {
    private Stage stage;
    FXMLLoader registerUserFXMl = new FXMLLoader(HelloController.class.getResource("register-user.fxml"));
    FXMLLoader mainMenuFXML = new FXMLLoader(HelloController.class.getResource("template.fxml"));
    public void setStage(Stage stage){
        this.stage = stage;
    }
    @FXML
    protected void onRegisterUserClick() throws IOException {
        if (stage != null && registerUserFXMl != null) {
            HelloApplication.startStage(stage, registerUserFXMl, "Register user");
        } else {
            System.err.println("Stage is not properly initialized");
        }
    }


    @FXML
    protected void onBackUserClick() throws IOException{
        //tutaj trzebva ogrnac
        if(stage != null && mainMenuFXML != null){
            HelloApplication.startStage(stage, mainMenuFXML, "Library Manager");
        } else {
          System.err.println("Stage is not properly initialized");
        }
    }
    protected void updateTime() {
        Label timeForLabel = new Label();
        Timeline timer = new Timeline();{
            LocalDateTime timeLabel = LocalDateTime.now();
            DateTimeFormatter format_timeLabel = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = timeLabel.format(format_timeLabel);
            //timeForLabel.setText(localTime.now().fomrat("dd-MM-yyyy HH:mm:ss"));
        }
    }
}
