package de.hhn.se.pmt.garten.besucher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Start extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception{

    VBox root = FXMLLoader.load(getClass().getResource("/fxml/anzeigen.fxml"));
    primaryStage.setTitle("Pflanzeninfo");
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
