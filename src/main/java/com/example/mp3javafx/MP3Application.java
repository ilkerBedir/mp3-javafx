package com.example.mp3javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class MP3Application extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(MP3Application.class.getResource("mp3-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("MP3-Player");
    stage.setScene(scene);
    stage.show();
    stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
      @Override
      public void handle(WindowEvent event) {
        Platform.exit();
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    launch();
  }
}