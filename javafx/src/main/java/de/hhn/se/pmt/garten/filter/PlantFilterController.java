package de.hhn.se.pmt.garten.filter;

import de.hhn.se.pmt.garten.dao.DAOFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
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
  private CheckBox cbBlueht;

  @FXML
  private CheckBox cbFruechte;

  @FXML
  private Button btSubmitFilter;

  @FXML
  private FlowPane flowAusgabe;

  @FXML
  public void initialize() {

    assert tfFilterName
        != null : "fx:id=\"tfFilterName\" was not injected: check your FXML file 'filter.fxml'.";
    assert cbBlueht
        != null : "fx:id=\"cbBlueht\" was not injected: check your FXML file 'filter.fxml'.";
    assert cbFruechte
        != null : "fx:id=\"cbFruechte\" was not injected: check your FXML file 'filter.fxml'.";

    btSubmitFilter.setOnAction(event -> {
      /*
      try {
        ListFilter();
      } catch (PersistentException e) {
        e.printStackTrace();
      }*/
      onClick();
    });
    tfFilterName.setOnKeyTyped(event -> {

      if (tfFilterName.getText().length()>2) { //Wenn 3 Buchstaben eingegeben wurde feurere los und hole DAten aus der DB
        try {
          ListFilter();
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
      String a = cbBlueht.isSelected() ? "true" : "false";
      System.out.println("Blüht: " + a);
      String b = cbFruechte.isSelected() ? "true" : "false";
      System.out.println("Früchte: " + b);
      flowAusgabe.getChildren().add(new Label(tfFilterName.getText()));
    }
  }

  public void ListFilter() throws PersistentException {
    flowAusgabe.getChildren().clear();
    String condition =
        "DeutscherName LIKE '%" + tfFilterName.getText() + "%' OR BotanischerName LIKE '%"
            + tfFilterName.getText() + "%'";
    de.hhn.se.pmt.garten.Pflanze[] dehhnsepmtgartenPflanzes = daoFactory.getPflanzeDAO()
        .listPflanzeByQuery(condition, null);
    int length = Math.min(dehhnsepmtgartenPflanzes.length, ROW_COUNT);
    for (int i = 0; i < length; i++) {
      System.out.println(dehhnsepmtgartenPflanzes[i]);
      flowAusgabe.getChildren().add(new Label(dehhnsepmtgartenPflanzes[i].toString()));
    }
    System.out.println(length + " record(s) retrieved.");
  }

}
