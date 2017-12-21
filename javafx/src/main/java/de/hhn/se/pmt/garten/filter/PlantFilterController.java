package de.hhn.se.pmt.garten.filter;

import de.hhn.se.pmt.garten.dao.DAOFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import org.orm.PersistentException;

/**
 * 14.12.2017
 *
 * @author Florian Domino
 */

public class PlantFilterController {

  DAOFactory daoFactory = DAOFactory.getDAOFactory();
  private static final int ROW_COUNT = 100;
  private static int counter;

  @FXML
  private TextField tfFilterName;

  @FXML
  private CheckBox cbAngepflanzt;

  @FXML
  private CheckBox cbFruechte;

  @FXML
  private Button btSubmitFilter;

  @FXML
  private VBox vBoxOutput;

  @FXML
  public void initialize() {

    assert tfFilterName
        != null : "fx:id=\"tfFilterName\" was not injected: check your FXML file 'filter.fxml'.";
    assert cbAngepflanzt
        != null : "fx:id=\"cbBlueht\" was not injected: check your FXML file 'filter.fxml'.";
    assert cbFruechte
        != null : "fx:id=\"cbFruechte\" was not injected: check your FXML file 'filter.fxml'.";

    btSubmitFilter.setOnAction(event -> {
      try {
        listFilter(tfFilterName.getText());
      } catch (PersistentException e) {
        e.printStackTrace();
      }
    });
    tfFilterName.setOnKeyPressed((KeyEvent event) -> {
      System.out.println(event.getText());
      System.out.println(tfFilterName.getText());
      String filter = tfFilterName.getText() + event.getText();

      if (filter.length()
          > 2) { //Wenn 3 Buchstaben eingegeben wurde feurere los und hole Daten aus der DB
        try {
          listFilter(filter);
        } catch (PersistentException e) {
          e.printStackTrace();
        }
      }
    });
  }

  public void onClick() {
    if (tfFilterName.getText().isEmpty()) {
      System.out.println("leer");
    } else {
      System.out.println(tfFilterName.getText());
      String a = cbAngepflanzt.isSelected() ? "true" : "false";
      System.out.println("Blüht: " + a);
      String b = cbFruechte.isSelected() ? "true" : "false";
      System.out.println("Früchte: " + b);
      vBoxOutput.getChildren().add(new Label(tfFilterName.getText()));
    }
  }

  public void listFilter(String x) throws PersistentException {
    vBoxOutput.getChildren().clear();
    String condition;
    if (cbAngepflanzt.isSelected()) {
      condition =
          "AngepflanztAufBuga = 1 AND (DeutscherName LIKE '%" + x + "%' OR BotanischerName LIKE '%"
              + x + "%')";
    } else {
      condition =
          "DeutscherName LIKE '%" + x + "%' OR BotanischerName LIKE '%"
              + x + "%'";
    }

    de.hhn.se.pmt.garten.Pflanze[] dehhnsepmtgartenPflanzes = daoFactory.getPflanzeDAO()
        .listPflanzeByQuery(condition, null);
    int length = Math.min(dehhnsepmtgartenPflanzes.length, ROW_COUNT);
    for (int i = 0; i < length; i++) {
      System.out.println(dehhnsepmtgartenPflanzes[i]);
      vBoxOutput.getChildren()
          .add(new Label(dehhnsepmtgartenPflanzes[i].toString().substring(1) + ","));
    }
    System.out.println(length + " record(s) retrieved.");
  }

}
