package de.hhn.se.pmt.garten;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

/**
 * 21.12.2017
 *
 * @author SWirries
 * <p>
 * This code is
 * documentation enough
 */


public class StartupController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button buttonStartFilter;

  @FXML
  private Button buttonStartAnsicht;

  @FXML
  private Button buttonStartContentManger;

  @FXML
  private MenuItem menuStartContent;

  @FXML
  private MenuItem menuStartFilter;

  @FXML
  private MenuItem menuStartAnsicht;

  @FXML
  void initialize() {
    assert buttonStartFilter != null : "fx:id=\"buttonStartFilter\" was not injected: check your FXML file 'startup.fxml'.";
    assert buttonStartAnsicht != null : "fx:id=\"buttonStartAnsicht\" was not injected: check your FXML file 'startup.fxml'.";
    assert buttonStartContentManger != null : "fx:id=\"buttonStartContentManger\" was not injected: check your FXML file 'startup.fxml'.";
    assert menuStartContent != null : "fx:id=\"menuStartContent\" was not injected: check your FXML file 'startup.fxml'.";
    assert menuStartFilter != null : "fx:id=\"menuStartFilter\" was not injected: check your FXML file 'startup.fxml'.";
    assert menuStartAnsicht != null : "fx:id=\"menuStartAnsicht\" was not injected: check your FXML file 'startup.fxml'.";

//    buttonStartAnsicht.setOnAction(event -> onClickStartAnzeige());
//    buttonStartContentManger.setOnAction(event -> onClickStartContent());
//    buttonStartFilter.setOnAction(event -> onClickStartFilter());
      menuStartAnsicht.setOnAction(event -> onClickStartAnzeige());
      menuStartContent.setOnAction(event -> onClickStartContent());
      menuStartFilter.setOnAction(event -> onClickStartFilter());

  }

  private Start startClass;

  public void setStartClass(Start startClass) {
    this.startClass = startClass;
  }

  public void onClickStartFilter(){

  }

  public void onClickStartAnzeige(){

  }

  public void onClickStartContent(){
    FXMLLoader loader = startClass.getLoader();
    loader.setLocation(startClass.getClass().getResource("/fxml/plant.fxml"));
    try {
      loader.load();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

