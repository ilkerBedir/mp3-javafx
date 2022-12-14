module com.example.mp3javafx {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.web;
  requires javafx.media;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires validatorfx;
  requires org.kordamp.ikonli.javafx;
  requires org.kordamp.bootstrapfx.core;
  requires eu.hansolo.tilesfx;

  opens com.example.mp3javafx to javafx.fxml;
  exports com.example.mp3javafx;
}