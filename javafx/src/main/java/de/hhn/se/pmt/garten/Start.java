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

  private FXMLLoader loader;

  public static void main(String[] args) {
    launch(args);
    if(args != null){
      System.out.println(args[0]);
    }
  }
  @Override
  public void start(Stage primaryStage) throws Exception {

    loader = new FXMLLoader(getClass().getResource("/fxml/plant.fxml"));

    Parent root = loader.load();
    StartupController controller = loader.getController();
    controller.setStartClass(this);
    primaryStage.setTitle("Pflanze hinzufügen");
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public FXMLLoader getLoader() {
    return loader;
  }
}
