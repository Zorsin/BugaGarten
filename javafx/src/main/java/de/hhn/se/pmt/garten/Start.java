package de.hhn.se.pmt.garten;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 12.12.2017
 *
 * @author SWirries
 * <p>
 * This code is
 * documentation enough
 */
public class Start extends Application{
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/filter.fxml"));
    primaryStage.setTitle("Pflanze hinzufügen");
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
